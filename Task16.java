package LinkedListLesson;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task16 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Green");
        list.add("Orange");
        System.out.println(list);
        List<String> list1 = (LinkedList<String>)list.clone();
        System.out.println(list1);

    }
}
