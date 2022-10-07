package week1.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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



}
