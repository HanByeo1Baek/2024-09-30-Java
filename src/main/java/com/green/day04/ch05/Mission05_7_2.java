package com.green.day04.ch05;

public class Mission05_7_2 {
    public static void main(String[] args) {
        /*
        다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성해보자.
        A B
       +B A
       -----
        9 9
         */
        for(int i=0; i<10; i++){
            for(int k=10; k>=0; k--){
                if((i+k)==9){
                    System.out.printf("%d, %d\n", i, k);
                }
            }
        }
    }
}
