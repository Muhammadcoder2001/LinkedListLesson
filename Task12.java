package LinkedListLesson;

import java.util.LinkedList;
import java.util.List;
public class Task12 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

        List<String> list1 = list.subList(0, 4);

        System.out.println(list1);
    }
}
