package LinkedListLesson;

import java.util.LinkedList;

public class TAsk13 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Green");
        list.add("Orange");

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("White");
        list1.add("Brown");
        list1.add("Black");
        list1.add("Green");
        list1.add("Orange");

        if(list.equals(list1)){
            System.out.println("objects are equal");
        }else{
            System.out.println("Objects are not equal");
        }

    }
}
