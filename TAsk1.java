package LinkedListLesson;

import java.util.LinkedList;

public class TAsk1 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Qobil");
        list.add("Alijon");
        list.add("Javohir");
        list.add("Abdumalik");
        list.add("Mirabbos");

        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
