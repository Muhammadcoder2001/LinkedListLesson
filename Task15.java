package LinkedListLesson;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task15 {

    public static void main(String[] args) {

        LinkedList <String> list = new LinkedList<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Green");
        list.add("Orange");

        List <String> list1 = new LinkedList<>();
        list1.add("Abdulloh");
        list1.add("Habibullo");
        list1.add("Xafizullo");
        list1.add("Sardor");
        list.addAll(list1);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
