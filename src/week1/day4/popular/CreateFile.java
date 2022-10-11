package week1.day4.popular;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class CreateFile {
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    //List<String>을 지정한 파일(filename)에 write
    public void write(List<String> strs, String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = Files.newBufferedReader(new File("pathname").toPath());
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str:strs) {
                writer.write(str);
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido()+","+populationMove.getToSido()+"\n";
    }
}