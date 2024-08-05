package LinkedListLesson;

import java.util.LinkedList;

public class Task18 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Green");
        list.add("Orange");
        if(list.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            System.out.println("List is not empty");

        }
        list.clear();
        if(list.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty");
        }
    }
}
