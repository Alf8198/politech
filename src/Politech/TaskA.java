package Politech;

import java.util.ArrayList;
import java.util.Date;

public class TaskA implements Service{
    int a = 100;
    int b = 200;
    @Override
    public int num() {
        if((a <=0)||(b <=0));
        System.out.println(nod(a, b));
        return 0;
    }

    @Override
    public Date uD() {
        return null;
    }

    public static int nod(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    @Override
    public ArrayList list() {
        return null;
    }

}
