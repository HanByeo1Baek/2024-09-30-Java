package com.green.day15.ch21;
//p.480
//Generic이 없던 시절의 코드
public class FruitAndBox {
    public static void main(String[] args) {
        //사과상자 객체화 (이름은 자유)
        //오렌지상자 객체화
        Apple ap = new Apple();
        AppleBox ab = new AppleBox(ap);
        //AppleBox ab = new AppleBox(new Apple()); <- 아렇게 해도 된다.

        Orange or = new Orange();
        OrangeBox ob = new OrangeBox(or);


    }
}

class Apple{
    @Override
    public String toString(){
        return "사과";
    }
}

class Orange{
    @Override
    public String toString(){
        return "오렌지";
    }
}

class AppleBox{
    private Apple ap;

    //private한 멤버 필드에 값 넣는 방법 2가지
    //1. 생성자
    //2. setter 메소드

    //생성자 통해서 값 넣어주세요.

    AppleBox(Apple ap){
        this.ap = ap;
    }

    //메소드를 통해 ap값을 외부로 리턴할 수 있다.

    public Apple getAp(){
        return ap;
    }
}

class OrangeBox{
    private Orange orange;

    OrangeBox(Orange orange){
        this.orange = orange;
    }

    public Orange getOrange(){
        return orange;
    }
}