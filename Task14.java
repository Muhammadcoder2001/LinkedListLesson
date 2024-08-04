package LinkedListLesson;

import java.util.Collections;
import java.util.LinkedList;

public class Task14 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Green");
        list.add("Orange");
        System.out.println(list);
        Collections.swap(list, 0,2);
        System.out.println(list);

    }
}
