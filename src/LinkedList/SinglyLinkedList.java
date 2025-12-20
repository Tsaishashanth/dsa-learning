package LinkedList;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;
                                                         //... one node can have multiple nodes but one node will have only one next

    public static void display(Node head) {              //here node is a classname and head is variable it is usefull or printingthe linked list
//        System.out.println(head.data);
//        System.out.println(head.next.data);              //we can use these but to print all the linkedlist it is impossible so we use do while loop

        //while loop
        if(head == null) return ;
        Node temp = head;                                   //doubt -> why we need to use temp node here
        while(temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("linked list is finished");

        //forloop

//        for(Node temp = head; temp != null; temp = temp.next) {
//            System.out.println(temp.data);
//        }

    }
    public static void displayrec (Node head) {

        //recursion                                                                             doubt -> recurssion will print from last to first

        if(head == null) return;
        System.out.println(head.data + " ");
        displayrec(head.next);
    }

    //adding element at the end

    public void addatend(int data) {

        Node temp = new Node(data);

        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }

    //adding element at front(head)
    public void addathead (int data) {
        Node temp = new Node(data);

        if(head == null ) head = tail = temp;
        else {
            head.next = temp;
            head = temp;
        }
    }

    //deleting at the head
    public void deleteathead (int data) {
        Node temp = new Node(data);

        if(head == null)  head = tail = null ;             // doubt -> here if we delete at the head, we need to make tail also null
        head = head.next;
        size--;
    }

    //inserting at perticular index
    //first we will check whether that value is present in linked list or not
    int  exist (int data) {
        if (head == null) return -1;
        int idx = 0;

        Node temp = head;
        while(temp != null ) {
            if(temp.data == data) return true;
            temp = temp.next;
            idx++;
        }
        return -1;
    }




    public static void main(String[] args) {

        //so here we just assgined value to the variables but they are in random

        Node a = new Node(10);          //a.data = 10;
        Node b = new Node(20);           //b.data = 10;
        Node c = new Node(30);           //c.data = 10;
        Node d = new Node(40);            //d.data = 10;
        Node e = new Node(50);            //e.data = 10;

        //now we will be connecting

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;                          //this is how we connect

                                             //the above is one way,to make it much cleaner we use node constructor

        System.out.println(a);                //LinkedList.Node@6acbcfc0 gave this output, eventhough we havet created linked list since we connected it gave as linked list
        System.out.println(b);
        System.out.println(a.next);           // here it gives one adress for a , and the adress for b and a.next will be the same
        System.out.println(a.next.next);       // this syntax is also there

        display(b);                             //here which ever parameter we pass to the method that becomes the head;
    }
}
