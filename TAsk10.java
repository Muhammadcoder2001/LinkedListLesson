package LinkedListLesson;

import java.util.Collections;
import java.util.LinkedList;

public class TAsk10 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
