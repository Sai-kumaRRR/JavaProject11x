package ex33_Collection_Frameworks.List;

import java.util.LinkedList;

public class Lab231_Linked_list02 {
    public static void main(String[] args) {

        LinkedList<String>animals = new LinkedList();


        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("elephant");
        animals.addLast("elephant");
        System.out.println("LinkedList:"  +  animals);

        // accessing elements
        System.out.println("First element:" + animals.getFirst());
        System.out.println("Last element:" + animals.getLast());


        // removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: "+ animals);

        System.out.println("size of LinkedList: "+ animals.size());


    }
}
