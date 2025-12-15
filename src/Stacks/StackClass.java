package Stacks;

import java.util.Stack;

public class StackClass {

    //stack follows -> LIFO

    //timecomplexity
          //inserting an item takes constant time
          //removing an item takes constant time

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();  //new object stack is in heap memory and stack varible is in stack memory
        stack.push(13);
        stack.push(23);
        stack.push(33);   // push means pushes to stack

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
