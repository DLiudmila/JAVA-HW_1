import java.util.ArrayList;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(2001);
        System.out.println(i);
//        int i = 1024;
        int n = 0;
        while (i > 0){
            i =i >> 1;
            n++;
        }
        System.out.println(n);
        ArrayList<Integer> m1 = new ArrayList<>();
//        int[] m1 = new int[99999];
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1.add(j);
            }
        }
        System.out.println(m1);

        ArrayList<Integer> m2 = new ArrayList<>();
//        int[] m1 = new int[99999];
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m2.add(j);
            }
        }
        System.out.println(m2);


    }
}
