package week1.day3.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class ReadFile{
    private String filename;
    public ReadFile(String filename){
        this.filename = filename;
    }
    public void read(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get("a_file.txt"), StandardCharsets.UTF_8)) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void createANewFile() throws IOException {
        File file = new File("./numbers.txt");
        file.createNewFile();
        System.out.println("파일 생성 되었는지?:" + file.exists());
    }

    public void readByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./numbers.txt"),16*1024);

        for(int i = 0; i<5;i++){
            System.out.println((char)br.read());
        }

    }
}

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("a_file");
        readFile.createANewFile();
        readFile.readByte("a_file");
    }
}
