package ex33_Collection_Frameworks.List;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {

        // stack
        // list IN -> first out (LIFO)
        // stack s - new stack ();
        // s.add("SAI")
        // s.add("KUMAR")
     //   System.out.println(s);


        Stack s = new Stack();
        s.push("SAI");
        s.push("kumar");
        s.push("amit");
        s.push("amit2");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("vijay");
        System.out.println(s);













    }
}