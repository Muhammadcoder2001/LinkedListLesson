package LinkedListLesson;

import javax.swing.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task19 {

    // task 20

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
//        String a = JOptionPane.showInputDialog(null, "So'zni kiriting: ");
        list.add("White");
        list.add("Brown");
        list.add("Black");
        list.add("Green");
        list.add("Orange");
        System.out.println(list.remove(0));

        System.out.println(list.get(0));
        }
}
