package week1.day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


class NewBufferedReader {
    private String adress;

    public NewBufferedReader(String adress) {
        this.adress = adress;
    }
    public void readByLine() {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(adress), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readByData(){
        String line;
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(adress), StandardCharsets.UTF_8
        )) {
            line = br.readLine();
        } catch (IOException e ){
            throw new RuntimeException(e);
        }
        return line;
    }
}

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

