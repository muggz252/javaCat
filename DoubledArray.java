package Project1;

import java.util.*;

public class DoubledArray {
    public static void main(String[] args) {
        int[] array = {1, 30, 8, -5, -5, 9, 30, 8, 1};
        Arrays.sort(array);

        List<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList1.add(array[i++]);
        }

        List<Integer> arrayList2 = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            arrayList2.add(array[i++]);

        }
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);
    }
}
