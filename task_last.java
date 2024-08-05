package LinkedListLesson;

import java.util.Collections;
import java.util.LinkedList;

public class task_last {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Green");
        list.add("Orange");

        if(list.isEmpty()){
            System.out.println("List is empty");

        }else{
            System.out.println("List is not empty");
        }

        System.out.println(list);

        list.set(0, "Pink");
        System.out.println(list);
    }
}
