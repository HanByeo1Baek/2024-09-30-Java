package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        /*
        중첩 for문을 이용하여 구구단을 출력해 주세요.

         */
        for(int i=1; i<10; i++){
            for(int k=2; k<10;k++){
                System.out.printf("%d x %d = %d\t", k, i, (i*k));
            }
            System.out.println();
        }
    }
}