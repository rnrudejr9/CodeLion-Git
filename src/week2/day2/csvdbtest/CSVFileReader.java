package week2.day2.csvdbtest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader<T> {
    public static String fileRead(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(filename));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        return br.readLine();
    }
    public static void main(String[] args) {
        String filename = "./서울시 병의원 위치 정보.csv";
        String s = null;
        try {
            s = fileRead(filename);
        }catch (Exception e){
            System.out.println("파일 읽기 에러");
        }
        System.out.println(s);

    }
}
