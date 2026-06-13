public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
        protected int end = 0;
        private int front = 0;
        private int size = 0;
        
        public CircularQueue(){
            this(DEFAULT_SIZE);
        }

        public CircularQueue(int size) {
            this.data = new int[size];
        }
        
        public boolean isFull(){
            return size == data.length;
        }
        public boolean isEmpty(){
            return size == 0;
        }    
        public boolean insert(int item) throws Exception{
            if (isFull()) {
                throw new Exception("Queue is OVERFLOW");
            }
            data[end % data.length] = item;
            end = (end + 1) % data.length;
            size++;
            return true;
        }
        public int remove()throws Exception{
            if (isEmpty()) {
                throw new Exception("Queue is EMPTY");
            }
            int removed = data[front];
            front = (front + 1) % data.length;
            size--;
            return removed;
        }
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return data[front];
        }
        public void display(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                System.out.print(data[(front + i) % data.length] + " <- ");
            }
            System.out.println("END");
        }
        public static void main(String[] args) throws Exception{
            System.out.println("This is our circular queue with complexity constant except display method !!!");
            CircularQueue queue = new CircularQueue(10);
            System.out.println();
        try {
            queue.insert(10);
            queue.insert(20);
            queue.insert(30);
            queue.insert(40);
            queue.insert(50);
            queue.insert(60);
            queue.insert(70);
            queue.insert(80);
            queue.insert(90);
            queue.insert(100);
            queue.insert(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
           try {
            System.err.println("The first element of the queue is : " + queue.peek());
           } catch (Exception e) {
            System.out.println(e.getMessage());
           }
           System.out.println();
        try {
            System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println(("| __ |"));            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
