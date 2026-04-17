import java.util.*;
import java.util.concurrent.*;

class Person{
    int age;
    String name;
}
public class Dsa{
    public static void main(String[] args){
        // string (immutable)
        String s="abc";                        // declare
        s.length();                            // length
        s.charAt(0);                           // access
        s.substring(0,2);                      // substring
        String s1="123";
        s.equals(s1);                          // compare
        s=s+s1;                                // concatenate
        Integer.parseInt(s1);                  // string to int

        // string builder (mutable)
        StringBuilder sb=new StringBuilder();   // declare
        sb.append("abc");                       // append
        sb.insert(0,"z");                       // insert
        sb.delete(0,2);                         // delete
        sb.reverse();                           // reverse
        sb.length();                            // length
        sb.charAt(0);                           // char access
        sb.toString();                          // convert to string

        // array list
        ArrayList<Integer> list=new ArrayList<>();  // declare
        list.add(2);                                // add element
        list.add(1,2);                              // insert at index
        list.get(0);                                // access
        list.set(0,3);                              // update
        list.remove(4);                             // remove
        list.size();                                // size
        list.contains(4);                           // contains
        Collections.sort(list);                     // list sort

        // hashmap
        HashMap<Integer,Integer> hashMap=new HashMap<>();       // declare
        hashMap.put(1,2);                                       // insert
        hashMap.get(1);                                         // get
        hashMap.containsKey(1);                                 // check key
        hashMap.remove(1);                                      // remove
        hashMap.size();                                         // size
        for(int key:hashMap.keySet()) System.out.println(key);  // looping in keys
        for(Map.Entry<Integer,Integer> e:hashMap.entrySet()){   // looping in [key,value]
            System.out.println(e.getKey()+" "+e.getValue());
        }

        // tree map
        TreeMap<Integer,Integer> map=new TreeMap();             // declare
        map.put(1,2);                                           // insert
        map.get(1);                                             // get
        map.remove(1);                                          // remove
        map.containsKey(1);                                     // check key
        map.size();                                             // size
        map.firstKey();                                         // smallest key
        map.lastKey();                                          // largest key
        map.floorEntry(1);                                      // <=
        map.ceilingEntry(1);                                    // >=
        map.lowerEntry(1);                                      // <
        map.higherEntry(1);                                     // >

        // hashset
        HashSet<Integer> hashSet=new HashSet<>();       // declare
        hashSet.add(1);                                 // insert
        hashSet.contains(1);                            // check element
        hashSet.remove(1);                              // remove
        hashSet.size();                                 // size
        for(int e:hashSet) System.out.println(e);       // loop

        // ordered set
        TreeSet<Integer> set=new TreeSet<>();           // declare
        set.add(1);                                     // add
        set.remove(1);                                  // remove
        set.contains(1);                                // check element
        set.first();                                    // first element
        set.last();                                     // last element
        set.floor(1);                                   // <=
        set.ceiling(1);                                 // >=
        set.lower(1);                                   // <
        set.higher(1);                                  // >

        // queue
        Queue<Integer> q=new LinkedList<>();            // declare
        q.add(1);                                       // insert
        q.poll();                                       // pop
        q.peek();                                       // top
        q.size();                                       // size

        // deque
        Deque<Integer> deque=new ArrayDeque<>();        // declare
        deque.addFirst(1);                              // push front
        deque.addLast(2);                               // push back
        deque.getFirst();                               // front top
        deque.getLast();                                // back top
        deque.pollFirst();                              // pop front
        deque.pollLast();                               // pop back
        deque.size();                                   // size

        // linked list
        LinkedList<Integer> linkedList=new LinkedList<>();  // declare
        linkedList.addLast(1);                              // add at last
        linkedList.addFirst(2);                             // add at front
        linkedList.remove();                                // remove first element
        linkedList.getFirst();                              // get first element
        linkedList.getLast();                               // get last element

        // stack
        Stack<Integer> stack=new Stack<>();               // declare
        stack.push(1);                                    // insert
        stack.pop();                                      // pop
        stack.peek();                                     // top
        stack.size();                                     // size

        // priority queue (min heap)
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();   // declare
        minHeap.add(1);                                         // insert
        minHeap.poll();                                         // pop
        minHeap.peek();                                         // top
        minHeap.size();                                         // size

        // priority queue (max heap)
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder()); // declare
        maxHeap.add(1);                                                                 // insert
        maxHeap.poll();                                                                 // pop
        maxHeap.peek();                                                                 // top
        maxHeap.size();                                                                 // size

        // traditional arrays
        int arr[]=new int[10];                          // declare
        arr.length;                                     // length
        arr[0];                                         // access
        arr[0]=2;                                       // update
        Arrays.sort(arr);                               // arrays sort

        // 2d arrays
        int [][] grid=new int[10][10];                  // declare

        // complex comparator sort -> sort by age, if tie sort by name
        ArrayList<Person> people=new ArrayList<>();
        Collections.sort(people,(p1,p2)->{
            if(p1.age!=p2.age) return p1.age-p2.age;
            return p1.name.compareTo(p2.name);
        });
        PriorityQueue<Person> pq=new PriorityQueue<>((p1,p2)->{
            if(p1.age!=p2.age) return p1.age-p2.age;
            return p1.name.compareTo(p2.name);
        });

        //---------------- thread safe data structures ----------------

        // concurrent hashmap (thread-safe hashmap)
        ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();  // declare
        map.put(1,2);                                                      // insert
        map.get(1);                                                        // get
        map.containsKey(1);                                                // check key
        map.remove(1);                                                     // remove
        map.size();                                                        // size
        for(Map.Entry<Integer,Integer> e:map.entrySet()){                  // loop entries
            System.out.println(e.getKey()+" "+e.getValue());
        }

        // concurrent skip list map (thread-safe sorted map)
        ConcurrentSkipListMap<Integer,Integer> map=new ConcurrentSkipListMap<>(); // declare
        map.put(1,2);                                                             // insert
        map.get(1);                                                               // get
        map.remove(1);                                                            // remove
        map.containsKey(1);                                                       // check key
        map.size();                                                               // size
        map.firstKey();                                                           // smallest key
        map.lastKey();                                                            // largest key
        map.floorEntry(1);                                                        // <=
        map.ceilingEntry(1);                                                      // >=
        map.lowerEntry(1);                                                        // <
        map.higherEntry(1);                                                       // >

        // concurrent hash set (via map)
        Set<Integer> set=ConcurrentHashMap.newKeySet(); // declare
        set.add(1);                                     // insert
        set.contains(1);                                // check
        set.remove(1);                                  // remove
        set.size();                                     // size

        // copy on write array list (thread-safe list, read-heavy)
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>(); // declare
        list.add(1);                                                     // add
        list.get(0);                                                     // get
        list.remove(0);                                                  // remove
        list.size();                                                     // size
        for(int e:list) System.out.println(e);                           // loop

        // blocking queue (producer/consumer)
        BlockingQueue<Integer> q=new LinkedBlockingQueue<>(); // declare
        q.put(1);                                             // insert (blocks if full)
        q.take();                                             // remove (blocks if empty)
        q.peek();                                             // top
        q.size();                                             // size

        // array blocking queue (bounded)
        BlockingQueue<Integer> q=new ArrayBlockingQueue<>(10); // declare
        q.put(1);                                              // insert (blocks if full)
        q.take();                                              // remove (blocks if empty)

        // blocking deque
        BlockingDeque<Integer> deque=new LinkedBlockingDeque<>(); // declare
        deque.addFirst(1);                                        // push front
        deque.addLast(2);                                         // push back
        deque.takeFirst();                                        // pop front (blocking)
        deque.takeLast();                                         // pop back (blocking)

        // non-blocking queue
        Queue<Integer> q=new ConcurrentLinkedQueue<>(); // declare
        q.add(1);                                       // insert
        q.poll();                                       // remove
        q.peek();                                       // top

        // non-blocking deque
        Deque<Integer> deque=new ConcurrentLinkedDeque<>(); // declare
        deque.addFirst(1);                                  // push front
        deque.addLast(2);                                   // push back
        deque.pollFirst();                                  // pop front
        deque.pollLast();                                   // pop back

        // priority blocking queue (heap)
        PriorityBlockingQueue<Integer> pq=new PriorityBlockingQueue<>(); // declare
        pq.put(1);                                                       // insert
        pq.take();                                                       // remove (blocking)
        pq.peek();                                                       // top
    }
}