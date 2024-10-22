package com.green.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        ClassC c = new ClassC();

    }
}
//ClassC는 ClassB를 상속
//ClassB는 ClassA를 상속
//super 생성자 호출은 자식 생성자 코드에서 최상위에 위치해야 한다.
class ClassA{
    ClassA(){
        System.out.println("==== ClassA ====");
    }
}
class ClassB extends ClassA{
    ClassB(){
        System.out.println("==== ClassB ====");
    }
}
class ClassC extends ClassB{
    ClassC(){
        System.out.println("==== ClassC ====");
    }
}