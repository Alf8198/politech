package Politech;

import java.util.*;

public class TaskB implements Service {
    ArrayList<Integer> unique = new ArrayList<>();
    ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 3, 5, 3, 6, 8, 4, 8, 99, 99, 1058, 4));


    @Override
    public ArrayList list() {
        Collections.sort(array);

        for (Integer anArray : array) {
            if (unique.contains(anArray)) {
            } else unique.add(anArray);
        }
        System.out.println(unique);
        System.out.println(array);
        return null;
    }

    @Override
    public int num() {
        return 0;
    }

    @Override
    public Date uD() {
        return null;
    }

}
