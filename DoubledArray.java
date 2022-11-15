package Project1;

import java.util.*;

public class DoubledArray {
    public static void main(String[] args) {
        int[] array = {1, 30, 8, -5, -5, 9, 30, 8, 1};
        Arrays.sort(array);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        for (Integer i : array) {
            arrayList.add(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList1.add(array[i++]);

        }
        for (int i = 1; i < arrayList.size(); i++) {
            arrayList2.add(array[i++]);

        }
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);
    }
}
