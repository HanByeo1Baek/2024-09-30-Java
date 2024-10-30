package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        Path path = Paths.get("D:/Simple.txt");
        //try안에 코드가 많으면 성능이 떨어진다.
        try (BufferedWriter writer = Files.newBufferedWriter(path); Scanner s = new Scanner(System.in)) {
            AutoCloseable auto = writer;
            auto = s;
            writer.write("FinallyCase");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        writer.close();
        s.close();
        무조건 실행이 된다.
        AutoCloseable 인터페이스를 상속받은 객체만 쓸 수 있다.
         */
        System.out.println("-- 끝 --");
    }
}