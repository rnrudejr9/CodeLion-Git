package week1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NewBufferedReader {
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