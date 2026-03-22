import java.util.*;

class Person{
    int age;
    String name;
}
public class Dsa{
    public static void main(String[] args){
        // string (immutable)
//        String s="abc";                        // declare
//        s.length();                            // length
//        s.charAt(0);                           // access
//        s.substring(0,2);                      // substring
//        String s1="123";
//        s.equals(s1);                          // compare
//        s=s+s1;                                // concatenate
//        Integer.parseInt(s1);                  // string to int

        // string builder (mutable)
//        StringBuilder sb=new StringBuilder();   // declare
//        sb.append("abc");                       // append
//        sb.insert(0,"z");                       // insert
//        sb.delete(0,2);                         // delete
//        sb.reverse();                           // reverse
//        sb.length();                            // length
//        sb.charAt(0);                           // char access
//        sb.toString();                          // convert to string

        // array list
//        ArrayList<Integer> list=new ArrayList<>();  // declare
//        list.add(2);                                // add element
//        list.add(1,2);                              // insert at index
//        list.get(0);                                // access
//        list.set(0,3);                              // update
//        list.remove(4);                             // remove
//        list.size();                                // size
//        list.contains(4);                           // contains
//        Collections.sort(list);                     // list sort

        // hashmap
//        HashMap<Integer,Integer> hashMap=new HashMap<>();       // declare
//        hashMap.put(1,2);                                       // insert
//        hashMap.get(1);                                         // get
//        hashMap.containsKey(1);                                 // check key
//        hashMap.remove(1);                                      // remove
//        hashMap.size();                                         // size
//        for(int key:hashMap.keySet()) System.out.println(key);  // looping in keys
//        for(Map.Entry<Integer,Integer> e:hashMap.entrySet()){   // looping in [key,value]
//            System.out.println(e.getKey()+" "+e.getValue());
//        }

        // tree map
//        TreeMap<Integer,Integer> map=new TreeMap();             // declare
//        map.put(1,2);                                           // insert
//        map.get(1);                                             // get
//        map.remove(1);                                          // remove
//        map.containsKey(1);                                     // check key
//        map.size();                                             // size
//        map.firstKey();                                         // smallest key
//        map.lastKey();                                          // largest key
//        map.ceilingKey(1);                                      // lower bound of key
//        map.higherKey(1);                                       // upper bound of key

        // hashset
//        HashSet<Integer> hashSet=new HashSet<>();       // declare
//        hashSet.add(1);                                 // insert
//        hashSet.contains(1);                            // check element
//        hashSet.remove(1);                              // remove
//        hashSet.size();                                 // size
//        for(int e:hashSet) System.out.println(e);       // loop

        // ordered set
//        TreeSet<Integer> set=new TreeSet<>();           // declare
//        set.add(1);                                     // add
//        set.remove(1);                                  // remove
//        set.contains(1);                                // check element
//        set.first();                                    // first element
//        set.last();                                     // last element
//        set.ceiling(1);                                 // lower bound
//        set.higher(0);                                  // upper bound

        // queue
//        Queue<Integer> q=new LinkedList<>();            // declare
//        q.add(1);                                       // insert
//        q.poll();                                       // pop
//        q.peek();                                       // top
//        q.size();                                       // size

        // deque
//        Deque<Integer> deque=new ArrayDeque<>();        // declare
//        deque.addFirst(1);                              // push front
//        deque.addLast(2);                               // push back
//        deque.getFirst();                               // front top
//        deque.getLast();                                // back top
//        deque.pollFirst();                              // pop front
//        deque.pollLast();                               // pop back
//        deque.size();                                   // size

        // linked list
//        LinkedList<Integer> linkedList=new LinkedList<>();  // declare
//        linkedList.addLast(1);                              // add at last
//        linkedList.addFirst(2);                             // add at front
//        linkedList.remove();                                // remove first element
//        linkedList.getFirst();                              // get first element
//        linkedList.getLast();                               // get last element

        // stack
//        Stack<Integer> stack=new Stack<>();               // declare
//        stack.push(1);                                    // insert
//        stack.pop();                                      // pop
//        stack.peek();                                     // top
//        stack.size();                                     // size

        // priority queue (min heap)
//        PriorityQueue<Integer> minHeap=new PriorityQueue<>();   // declare
//        minHeap.add(1);                                         // insert
//        minHeap.poll();                                         // pop
//        minHeap.peek();                                         // top
//        minHeap.size();                                         // size

        // priority queue (max heap)
//        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder()); // declare
//        maxHeap.add(1);                                                                 // insert
//        maxHeap.poll();                                                                 // pop
//        maxHeap.peek();                                                                 // top
//        maxHeap.size();                                                                 // size

        // traditional arrays
//        int arr[]=new int[10];                          // declare
//        arr.length;                                     // length
//        arr[0];                                         // access
//        arr[0]=2;                                       // update
//        Arrays.sort(arr);                               // arrays sort

        // 2d arrays
//        int [][] grid=new int[10][10];                  // declare

        // complex comparator sort -> sort by age, if tie sort by name
//        ArrayList<Person> people=new ArrayList<>();
//        Collections.sort(people,(p1,p2)->{
//            if(p1.age!=p2.age) return p1.age-p2.age;
//            return p1.name.compareTo(p2.name);
//        });
//        PriorityQueue<Person> pq=new PriorityQueue<>((p1,p2)->{
//            if(p1.age!=p2.age) return p1.age-p2.age;
//            return p1.name.compareTo(p2.name);
//        });
    }
}