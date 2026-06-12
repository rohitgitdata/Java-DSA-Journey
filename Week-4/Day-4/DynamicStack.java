public class DynamicStack {
        protected int[] data;
        private static final int DEFAULT_SIZE = 10;
        protected int ptr = -1;
        
        public DynamicStack(){
            this(DEFAULT_SIZE);
        }

        public DynamicStack(int size) {
            this.data = new int[size];
        }
        
        public boolean isEmpty(){
            return ptr == -1;
        }
        
        public boolean push(int item){
           if (ptr == data.length - 1) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
           }
            ptr++;
            data[ptr] = item;
            return true;
        }
        public int pop() throws Exception{
            if (isEmpty()) {
                throw new Exception("Stack is Empty");
            }
            int removed = data[ptr];
            ptr--;
            return removed;
        }
        public int peek() throws Exception{
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }
            int top = data[ptr];
            return top;
        }
        public static void main(String[] args)throws Exception {
            DynamicStack stack = new DynamicStack(10);
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
            System.err.println("The last element of the stack is : " + stack.peek());

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
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println(("| __ |"));            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }       
        }
}
