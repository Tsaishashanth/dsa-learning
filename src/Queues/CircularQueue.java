package Queues;

public class CircularQueue {

    //in cirular queue the elements int the array will be circular so ,after last element we use % to get the first index again like 5%5 =0 ->first index
    protected int [] data;

    private static final int Defaultsize = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;  //size is nothing but how many elements in the queue

    public CircularQueue(){
        this(Defaultsize);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isfull() {
        return size == data.length;
    }
    public boolean isempty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isfull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;   // this moves the position
        size++;
        return true;
        // we will always insert element in the ending
    }
    public int remove() throws Exception {
        if(isempty()) {
            throw new Exception ("queue is empty");
        }
        int removed = data[front++];  //here front++ means not the second value , it means move to next value after data[front] ,[++front -> first increment and then do]
        front = front % data.length; // this moves the position
        size--;
        return removed;
        // we will always remove element from the starting
    }

    public void display() {
        if(isempty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.println(data[i] + "->");
            i++;              // i++ -> 2 //down becomes 3%5 -> 2 3 is divided by 5 becomes 2
            i %= data.length; // we wrote here this bcoz 5%5 is 0 continue
        }
        while (i != end);
        System.out.println("END");
    }
}
