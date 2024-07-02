package org.example;

public class Main {
    public static void main(String[] args) {
        int finalAns = countNumber(50, 0);
        System.out.println(finalAns);
    }

    public static int countNumber(int size, int index) {
        if (size > index) {
            int allSum = 0;
            for (index = 0; index < size; index++) {
                if (index % 2 == 0) {
                    allSum++;
                }
            }
            return allSum;
        } else {
            return -1;
        }
    }
}