package org.example.SDA3;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(5);
        array1.add(1);
        array1.add(2);
        array1.add(25);
        array1.add(6);
        array1.add(-1);
        array1.add(8);
        array1.add(10);
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(8);
        array2.add(-1);
        array2.add(10);

        //deci fac o singura parcurgere cu doi indici si verific pe rand elementele
        // daca apartin primului array
        //daca da verific ca indexul in primul array al celui de al doilea element
        // este mai mare decat al primului
        System.out.println(verifyIfSubarray(array1,array2));
    }

    public static String verifyIfSubarray(ArrayList<Integer> array1, ArrayList<Integer> array2){
        boolean check = false;
        for (int i = 0; i < array2.size() - 1; i++) {
            for (int j = i+1; j < array2.size(); j++) {
                Integer first = array2.get(i);
                Integer second = array2.get(j);
                if (array1.contains(first) && array1.contains(second)) {
                    if (array1.indexOf(second) < array1.indexOf(first))
                        return check +" Array2 nu este subsir al lui array1";
                }
            }
        }
        check = true;
        return check +" Array2 este subsir al lui array1";
    }
}
