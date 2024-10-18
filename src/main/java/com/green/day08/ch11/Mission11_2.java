package com.green.day08.ch11;

public class Mission11_2 {
    /*
    다음 주민등록 번호의 중간에 삽입된 '-'를 지우고 공백으로 채워서
    출력하는 프로그램을 작성해보자.
    단, StringBuilder 클래스를 활용하여 빈번한 문자열 생성이
    발생하지 않도록 해야한다.

    990925-101299

    콘솔에 990925 101299 가 출력이 되면 된다.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("990925-101299");
        StringBuilder sb2 = new StringBuilder("990925-101299");
        int a = sb.indexOf("-");
        sb.replace(a, a+1, " ");
        System.out.println(sb);
        System.out.println(sb2.replace(sb2.indexOf("-"), sb2.indexOf("-")+1, " "));

    }
}