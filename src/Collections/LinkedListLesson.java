package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListLesson {
    public static void main(String[] args) {
        List<Integer> linkedListTest = new LinkedList<>();
        linkedListTest.add(1);
        linkedListTest.get(0);
        linkedListTest.size();
        linkedListTest.remove(0);


        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }

}
