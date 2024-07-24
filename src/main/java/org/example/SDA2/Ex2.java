package org.example.SDA2;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(461);
        numbers.add(7);
        numbers.add(21);
        numbers.add(0);
        numbers.add(88);
        numbers.add(2);
        numbers.add(7);
        numbers.add(7);
        Integer m = 2;
        Integer n = 7;
        System.out.println(verifyIfNeighbours(numbers,m,n));
    }
    public static boolean verifyIfNeighbours(ArrayList<Integer> numbers, Integer m, Integer n) {

        for (int i = 1; i < numbers.size()-1; i++) {
            if(numbers.get(i)==m){
                if(numbers.get(i-1)==n || numbers.get(i+1)==n)
                    return false;
            }
            if(numbers.get(i)==n){
                if(numbers.get(i-1)==m || numbers.get(i+1)==m)
                    return false;
            }
        }
        return true;
    }
}
