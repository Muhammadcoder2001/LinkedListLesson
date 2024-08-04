package LinkedListLesson;

import java.util.LinkedList;

public class TAsk4 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

        System.out.println(list.get(list.size() -1));
    }
}
