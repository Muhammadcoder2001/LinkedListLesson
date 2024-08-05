package LinkedListLesson;

import java.util.Collections;
import java.util.LinkedList;

public class TAsk20 {

    public static void main(String[] args) {

        LinkedList <String> list = new LinkedList<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Green");
        list.add("Orange");
        if (list.contains("White")){
            System.out.println("Something is here");
        }
        else {
            System.out.println("Nothing is here");
        }
        if (list.contains("Qora")){
            System.out.println("Bunday object mavjud");
        }
        else{
            System.out.println("Bunday object mavjud emas!");

        }
        System.out.println(list.getLast());
    }
}
