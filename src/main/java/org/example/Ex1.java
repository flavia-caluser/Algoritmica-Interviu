package org.example;
public class Ex1 {
    public static void main(String[] args) {
        printOddNumbersBetween(-3,5);
    }

    public static void printOddNumbersBetween (int x, int y){
        if(x%9==0) {
            System.out.println("Primul numar e divizibil cu 9");
            return;
        }
        for (int i = x; i <=y ; i++) {
            if(i%9==0)
                break;
            else if (i%2!=0)
                System.out.print(i + " ");
        }

    }
}