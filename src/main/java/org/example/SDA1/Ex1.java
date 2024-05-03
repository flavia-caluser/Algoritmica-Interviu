package org.example.SDA1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int counterRosu = 0;
        int counterAlbastru = 0;
        int counterViolet = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu nr de scanduri:");
        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(i%2==0 && i%3==0)
                counterViolet++;
            else if (i%2==0)
                counterRosu++;
            else if(i%3==0)
                counterAlbastru++;
        }
        if(n<=1) {
            System.out.println("Numarul introdus este prea mic");
            return;
        }
        System.out.println("Numarul de scanduri rosii este: "+ counterRosu);
        System.out.println("Numarul de scanduri albastre este: "+ counterAlbastru);
        System.out.println("Numarul de scanduri violet este: "+ counterViolet);
    }

}
