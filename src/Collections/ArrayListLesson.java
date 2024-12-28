package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLesson {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.get(0);
        list.size();
        list.remove(0);
        list.set(0, 5);

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }

        for (Integer x: list) {
            System.out.println(x);
        }

    }
}
