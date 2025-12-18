package LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        //so here we just assgined value to the variables but they are in random
        Node a = new Node(10); //a.data = 10;
        Node b = new Node(20); //b.data = 10;
        Node c = new Node(30); //c.data = 10;
        Node d = new Node(40); //d.data = 10;
        Node e = new Node(50); //e.data = 10;
        //now we will be connecting
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;    //this is how we connect

        //the above is one way,to make it much cleaner we use node constructor
        System.out.println(a); //LinkedList.Node@6acbcfc0 gave this output, eventhough we havet created linked list since we connected it gave as linked list
        System.out.println(b);
        System.out.println(a.next); // here it gives one adress for a , and the adress for b and a.next will be the same
        System.out.println(a.next.next);  // this syntax is also there
    }
}
