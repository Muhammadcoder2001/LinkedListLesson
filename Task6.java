package LinkedListLesson;

import java.util.LinkedList;

public class Task6 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");


        list.remove(3);
        System.out.println(list);
    }
}
