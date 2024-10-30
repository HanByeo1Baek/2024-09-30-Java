package com.green.BaekJun;
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[][] stu = new Student[10][5];

        for(int i=0; i< stu.length; i++){
            String name = s.nextLine();
            int phone = s.nextInt();
            String dept = s.nextLine();
            int grade = s.nextInt();
            int sn = s.nextInt();
            for(int j=0; j<stu[i].length; j++){
                stu[i][j] = new Student(name, phone, dept, grade, sn);
            }
        }
        for(Student[] item : stu){
            System.out.println(item);
        }

        Professor[] pro = new Professor[3];

        for(int i=0; i<pro.length; i++){
            String name = s.nextLine();
            int phone = s.nextInt();
            String dept = s.nextLine();

            pro[i] = new Professor(name, phone, dept);
        }

        for(Professor item : pro){
            System.out.println(item);
        }

        Subject[] sb = new Subject[5];

        for(int i=0; i<sb.length; i++){
            String subname = s.nextLine();
            int subnum = s.nextInt();

            sb[i] = new Subject(subname, subnum);
        }

        for(Subject item : sb){
            System.out.println(item);
        }

        String select = s.nextLine();
        while(true){
            if(select.equals("학생")){
                String menu = s.nextLine();
                if(menu.equals("신청")){
                    System.out.println("학번을 입력하시오 : ");

                }
                else if(menu.equals("확인")){
                    System.out.println("학번을 입력하시오 : ");

                }
            }
            else if(select.equals("교수")){

                System.out.println("담당교수 인사번호를 입력하시오 : ");

            }
            else if(select.equals("종료")){
                break;
            }
        }
    }
}

class Information{
    private String name;
    private int phone;
    private String dept;

    Information(String name, int phone, String dept){
        this.name = name;
        this.phone = phone;
        this.dept = dept;
    }

}

class Student extends Information{
    private int grade;
    private int sn;

    Student(String name, int phone, String dept, int grade, int sn){
        super(name, phone, dept);
        this.grade = grade;
        this.sn = sn;

    }

}

class Professor extends Information{

    Professor(String name, int phone, String dept){
        super(name, phone, dept);

    }
}

class Subject{
    private String subname;
    private int subnum;

    Subject(String subname, int subnum){
        this.subname = subname;
        this.subnum = subnum;
    }
}