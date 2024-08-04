package LinkedListLesson;

import java.util.LinkedList;

public class TAsk7 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Abdulloh");
        list.add("Hafizullo");
        list.add("Sardor");
        list.add("Abdulbosit");
        list.add("Habibullo");
        list.add("Samandar");

        if(list.contains("Habibullo")){
            System.out.println("The element is available");

        }else{
            System.out.println("The element is not available");
        }
    }
}
