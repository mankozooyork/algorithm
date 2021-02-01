import java.util.Queue;
import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Scanner;

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
    /** serialVersionUID. */
    private static final long serialVersionUID = 1611421744L;

    public Pair(final K key, final V value) {
        super(key, value);
    }
 }

public class QueueClassUsed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quantum = sc.nextInt();
    
        Queue <Pair<String, Integer>> q = new LinkedList<Pair<String, Integer>>();
        for(int i=0; i<n; i++) {
            q.add(new Pair<String, Integer>(sc.next(), sc.nextInt()));
        }
    
        int elapsedTime = 0;
    
        while(q.peek() != null) {
            Pair<String, Integer> currentQueue = q.peek();
            int rst = Math.min(quantum, currentQueue.getValue());
            int diff = currentQueue.getValue() - rst;
            elapsedTime += rst;
            q.remove();
            if(diff > 0) {
                currentQueue.setValue(diff);
                q.add(currentQueue);
            } else {
                System.out.println(currentQueue.getKey() + " " + elapsedTime);
            }
        } 
        sc.close();
    }
}
