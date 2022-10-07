package week1.day4;

import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    public static void main(String[] args){
        String adress = "C:\\Users\\\\KOO\\\\Downloads\\\\2021_인구관련연간자료_20220927_66125.csv";
        NewBufferedReader br = new NewBufferedReader(adress);

        List<PopulationMove_useT> list = new ArrayList<>();
        list.add(PopulationMove_useT.Parse(br.readByData()));

        for(PopulationMove_useT pm : list){
            System.out.println(pm.getFromSido());
            System.out.println(pm.getToSido());
        }
    }
}

