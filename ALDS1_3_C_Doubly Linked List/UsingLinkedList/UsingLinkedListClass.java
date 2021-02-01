import java.util.Scanner;
import java.util.LinkedList;

public class UsingLinkedListClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<n; i++) {
            String action = sc.next();
            if(action.equals("insert")) {
                list.addFirst(sc.nextInt());
            } else {
                if(action.equals("deleteFirst")) {
                    list.removeFirst();
                } else if(action.equals("deleteLast")) {
                    list.removeLast();
                } else {
                    int target = sc.nextInt();
                    if(list.contains(target)) {
                        list.remove(list.indexOf(target));
                    }
                }
            }
        }
        sc.close();
        for(int i=0; i<list.size(); i++) {
            if(i == list.size()-1) {
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i) + " ");
            }
        } 
    }
}
