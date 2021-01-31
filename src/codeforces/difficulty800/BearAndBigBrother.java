package codeforces.difficulty800;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextByte();
        int b = scanner.nextByte();
        int years = 0;

        while (a <= b) {

            a *= 3;
            b *= 2;
            years++;
        }

        System.out.println(years);
    }
}
