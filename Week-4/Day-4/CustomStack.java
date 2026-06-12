public class CustomStack {
        protected int[] data;
        private static final int DEFAULT_SIZE = 10;
        protected int ptr = -1;
        
        public CustomStack(){
            this(DEFAULT_SIZE);
        }

        public CustomStack(int size) {
            this.data = new int[size];
        }
        
        public boolean isFull(){
            return ptr == data.length - 1;
        }
        public boolean isEmpty(){
            return ptr == -1;
        }
        
        public boolean push(int item) throws Exception{
            if (isFull()) {
                throw new Exception("Your Stack is full you cannot add anything in this");
            }
            ptr++;
            data[ptr] = item;
            return true;
        }
        public int pop() throws Exception{
            if (isEmpty()) {
                throw new Exception("Your Stack is Empty you connot access and remove anything in this");
            }
            int removed = data[ptr];
            ptr--;
            return removed;
        }
        public int peek() throws Exception{
            if (isEmpty()) {
                System.out.println("stack is empty");
            }
            int top = data[ptr];
            return top;
        }
        public static void main(String[] args)throws Exception {
        CustomStack stack = new CustomStack(10);
        System.out.println();
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60);
            stack.push(70);
            stack.push(80);
            stack.push(90);
            stack.push(100);
            stack.push(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
           try {
            System.err.println("The last element of the stack is : " + stack.peek());
           } catch (Exception e) {
            System.out.println(e.getMessage());
           }
           System.out.println();
        try {
            System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println(("| __ |"));            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        }
}
