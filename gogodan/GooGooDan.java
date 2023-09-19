package gogodan;

import java.util.Scanner;

public class GooGooDan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int i;
        for (i = 0; i <= 9; i++) {
            System.out.println(number + " * " + i + "=" + number * i);
        }

    }
}