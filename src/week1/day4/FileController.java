package week1.day4;

import java.io.*;

public class FileController {
    File file;
    public void createFile(String filename){
        file = new File(filename);
        try{
            file.createNewFile();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //List<String> 을 지정한 파일에 write 합니다.
    public void writeFile(String str)  {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(str);
            bw.close();
        } catch ( IOException e){
            System.out.println("문제발생");
        }

    }
}
