package week1.day3.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class ReadFile{
    private String filename;
    public ReadFile(String filename){
        this.filename = filename;
    }
    public void read(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void createANewFile() throws IOException {
        File file = new File(filename);
        file.createNewFile();
        System.out.println("파일 생성 되었는지?:" + file.exists());
    }

    boolean fileExist(){
        boolean r = Files.exists(Paths.get(filename));
        return r;
    }

    public void readByte(String filename,int size) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename),16*1024);
        for(int i = 0; i<size;i++){
            System.out.println((char)br.read());
        }
    }

    public String read2Chars(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }


}

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("a_file");

        System.out.println(readFile.read2Chars("a_file"));

        if(readFile.fileExist()){
          //  readFile.readByte("a_file",10);
        }else{
            System.out.println("파일이 없습니다.");
            readFile.createANewFile();
        }

//        File dir = new File("./");
//        File files[] = dir.listFiles();
//        for(File file : files){
//            System.out.println(file);
//        }
    }
}
