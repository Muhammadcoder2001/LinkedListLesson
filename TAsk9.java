package LinkedListLesson;

import java.util.LinkedList;

public class TAsk9 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

        LinkedList <String> list1 = new LinkedList<>();

        list1.add("1");
        list1.add("12");
        list1.add("11");
        list1.add("32");
        list1.add("19");

        list.addAll(list1);
        System.out.println(list);


    }
}
