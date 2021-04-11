package ALDS1_3_B_Queue;

import java.util.Scanner;

class Main {
    static int quantum;
    static int currentElapsedTime;

    class Data {
        String processName;
        int time;

        // Constructor
        Data(String s, int n) {
            this.processName = s;
            this.time = n;
        }
    }

    class Queue {
        int capacity = 0;
        int size = 0;
        int head = 0;
        int tail = -1;
        Data[] queue;

        // Constructor
        Queue(int capacity) {
            this.queue = new Data[capacity];
            this.capacity = capacity;
        }

        private void enqueue(Data data) {
            int index = (this.tail + 1) % this.capacity;
            this.queue[index] = data;
            this.size++;
            this.tail++;
        }

        private void dequeue() {
            int index = this.head % this.capacity;
            Data data = this.queue[index];
            this.head++;
            this.size--;
            elapsedTime(data);
        }

        private boolean isEmpty() {
            return size == 0;
        }

        private void elapsedTime(Data data) {
            int x = Math.min(data.time, quantum);
            data.time -= x;
            currentElapsedTime += x;

            if(data.time > 0) {
                enqueue(data);
            } else {
                System.out.println(data.processName + " " + currentElapsedTime);
            }
        }
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        quantum = sc.nextInt();

        Queue q = new Queue(n*2);

        for(int i=0; i<n; i++) {
            q.enqueue(new Data(sc.next(), sc.nextInt()));
        }
        sc.close();

        while(!q.isEmpty()) {
            q.dequeue();
        }

    }
    public static void main(String[] args) {
        new Main();
    }
}