package Stacks;

public class CustomStack {

    protected int[] data;
    private static final int default_size = 10;

    int ptr = -1;


//    public  customstack(){
//        this(default_size);  // this looks for the same constructor which has one parameter and sends the value to it
//                             //since the default is private and final we use this constructor to pass to the down constructor
//    }

    public void customstack(int size) {
        this.data = new int[size];

    }
    public boolean push(int item) {
        if (isfull()) {
            System.out.println("array is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception{
        if(isempty()) {
            throw new Exception ("cannot pop from an empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    private boolean isfull() {
        return ptr == data.length-1;
    }
    private boolean isempty() {
        return  ptr == -1;
    }
    public static void main(String[] args) {
    }
}
