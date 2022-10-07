package week1.day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    public static void main(String[] args){
        String adress = "C:\\Users\\\\KOO\\\\Downloads\\\\2021_인구관련연간자료_20220927_66125.csv";
        NewBufferedReader br = new NewBufferedReader(adress);

        List<PopulationMove> list = new ArrayList<>();
        list.add(PopulationMove.Parse(br.readByData()));

        for(PopulationMove pm : list){
            System.out.println(pm.getFromSido());
            System.out.println(pm.getToSido());
        }
    }
}

