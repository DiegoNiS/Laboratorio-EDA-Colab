public class QueueTest {

    public static void main(String[] args) throws Exception {
        
        Queue<String> queue = new Queue<>();
        
        queue.add(new Node("Hello"));
        queue.add(new Node("World"));
        queue.add(new Node("from Queue class"));
        
        queue.showQueue();
        
        queue.remove();
        System.out.println();
        
        queue.showQueue();
        queue.remove();
        System.out.println();
        
        queue.showQueue();
        
        Queue<Integer> queue2 = new Queue<>();
        
        queue2.add(new Node(1));
        queue2.add(new Node(2));
        queue2.add(new Node(3));
        queue2.add(new Node(4));
        
        queue2.showQueue();
        
        queue2.remove();
        System.out.println();
        
        queue2.showQueue();
        System.out.println();
        System.out.println(queue2.remove());
        System.out.println();
        
        queue2.showQueue();
        
        System.out.println();
        System.out.println(queue2.remove());
        System.out.println();
        
        queue2.showQueue();
        
        System.out.println();
        System.out.println(queue2.remove());
        System.out.println();
        
        queue2.showQueue();
    }
}
