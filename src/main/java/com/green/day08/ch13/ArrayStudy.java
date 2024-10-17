package com.green.day08.ch13;

public class ArrayStudy {
    /*
    배열은 같은 타입의 여러(많은) 데이터를 묶어서 저장하기 위해 사용
    배열을 사용하지 않는다면 데이터 수만큼 변수를 만들어야 한다.

    만약, 100개의 정수값을 저장을 한다면 변수 선언을 100번 해야한다.
    예를 들어, int n1, n2, n3, n4 ..... n100; 까지

    그치만 배열을 사용하면 여러데이터를  편하게 저장하고 가져올 수 있다.
    (read/write)

    배열 만드는 방법
    int[] 변수명 = new int[100]; ← 100개의 정수값을 저장할 수 있는 공간을 만들었다.
    String 변수명2  = new String[100]; ← 100개의 문자열을 저장할 수 있는 공간을 만들었다.

    int[] 변수명 도 가능하구요.
    int 변수명[] 도 가능한데 int[] 변수명만 사용해 주세요.
    ↑ 정수라고 헷갈릴 수도 있음

    int[] arr; 가 의마하는 바는 int 배열(객체)의 주소값만 저장할 수 있다.
    다른 타입의 배열의 주소값은 저장할 수 없다.

    new int[100]; int형의 공간이 100개가 만들어졌다.
    각 공간은 int 값만 저장할 수 있다.
    new String[100]; String형의 공간이 100개가 만들어졌다.
    각 공간은 String 주소값만 저장할 수 있다.

    [배열 쓰기]
    int[] arr = new int[10];
    arr[0] = 10; ← 첫번째 공간에 10을 대입, 공간번호(index)는 0부터 시작
    arr[1] = 20; ← 두번째 공간에 20을 대입

    arr[9] = 100; ← 마지막 공간에 100을 대입

    초기화 하지 않은 공간은 디폴트값이 들어간다. (저장되어있다.)
    숫자형은 0, 레퍼런스타입은 null, boolean은 false

    [배열 읽기]
    System.out.println(arr[0]); ← 10
    System.out.println(arr[9]); ← 100

    arr.length 는 자신의 공간의 크기값을 저장한 정수 상수
    어떤 크기의 배열이든 마지막 공간의 값을 사용하고 싶을 때는
    arr[arr.length-1] 이렇게 하면 된다.

    ----

    [배열 생성과 동시에 초기화]
    int[] arr2 = {1, 2, 3, 4, 5}; ← new int[] 가 생략되어 상태

    int[] arr3 = new int[]{1, 2, 3, 4, 5};

    메소드에 파라미터로 방금만든 배열을 보내고 싶을 때,

    메소드명({1, 2, 3}); ← 이렇게 호출하는 것이 안된다.
    메소드명(new int[]{1, 2, 3}); ← 이렇게 호출해야 한다.

    그치만 우회가 가능
    int[] arr = {1, 2, 3};
    메소드명(arr);

    배열과 반복문(for)의 궁합이 좋다. 대부분 함께 쓰인다.
     */
}
