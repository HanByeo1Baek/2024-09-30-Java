package com.green.day10.ch13;

public class MissionTwoDimenArrayToObject {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student("영수", 100, 90, 80);
        arr[1] = new Student("상철", 90, 90, 80);
        arr[2] = new Student("광수", 80, 70, 60);


        printStudentInfo(arr);
        printKorScores(arr);
        printEngScores(arr);
        printMathScores(arr);
        printTotalSubjectScore(arr);// 학급 - 합계점수 ?, 평균점수 ?
    }

    public static void printStudentInfo(Student[] students){
        for(Student stu : students){
            System.out.println(stu);
        }
    }

    public static void printKorScores(Student[] students){
        int totalKorScore = 0;
        for(Student stu : students){
            totalKorScore += stu.getKorScore();
        }
        System.out.printf("국어 - 합계점수 : %d, 평균점수 : %.1f\n", totalKorScore, (float)totalKorScore / students.length);
    }
    public static void printEngScores(Student[] students){
        int totalEngScore = 0;
        for(Student stu : students){
            totalEngScore += stu.getEngScore();
        }
        System.out.printf("영어 - 합계점수 : %d, 평균점수 : %.1f\n", totalEngScore, (float)totalEngScore / students.length);
    }
    public static void printMathScores(Student[] students){
        int totalMathScore = 0;
        for(Student stu : students){
            totalMathScore += stu.getMathScore();
        }
        System.out.printf("수학 - 합계점수 : %d, 평균점수 : %.1f\n", totalMathScore, (float)totalMathScore / students.length);
    }
    public static void printTotalSubjectScore(Student[] students){
        int sum = 0;
        for(Student stu : students){
            sum += stu.getAllScore();
        }
        float avg = (float)sum / (students.length * Student.SUBJECT_CNT);
        System.out.printf("학급 - 합계점수 : %d, 평균점수 : %.1f\n", sum, avg);
    }
}

class Student {
    public static final int SUBJECT_CNT = 3;
    private String name;
    private int korScore; // 국어 점수
    private int engScore; // 영어 점수
    private int mathScore; // 수학 점수

    Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getKorScore() {
        return korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getAllScore(){
        return korScore + engScore + mathScore;
    }

    @Override
    public String toString(){
        int totalScore = getAllScore();
        return String.format("%s - 국어: %d, 영어: %d, 수학: %d, 합계점수: %d, 평균점수: %.1f\n"
                , name, korScore, engScore, mathScore, totalScore, (float)totalScore / SUBJECT_CNT);
    }
}