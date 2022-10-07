package week1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class ReadLineContext_useT<T> {
    public List<T> readByData(String adress){

        List<T> result = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(adress), StandardCharsets.UTF_8
        )) {
            String str;
            while((str = br.readLine()) != null){
                PopulationMove_useT pm = PopulationMove_useT.Parse(str);
                result.add((T) pm);
            }
        } catch (IOException e ){
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        ReadLineContext_useT<PopulationMove_useT> readlineconext = new ReadLineContext_useT<>();
        List<PopulationMove_useT> result = readlineconext.readByData("C:\\Users\\\\KOO\\\\Downloads\\\\2021_인구관련연간자료_20220927_66125.csv");
        for(PopulationMove_useT p : result){
            System.out.println(p.getFromSido());
            System.out.println(p.getToSido());
        }
    }
}
