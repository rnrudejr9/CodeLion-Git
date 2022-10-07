package week1.day4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadLineContext_useT<PopulationMove_useT> readlineconext = new ReadLineContext_useT<>();
//        List<PopulationMove_useT> result = readlineconext.readByData("C:\\Users\\\\KOO\\\\Downloads\\\\2021_인구관련연간자료_20220927_66125.csv");
//        for(PopulationMove_useT p : result){
//            System.out.println(p.getFromSido());
//            System.out.println(p.getToSido());
//        }

        String filename = "hello";
        FileController fc = new FileController();
        fc.createFile(filename);
        String filewriteText = "hello world!!";
        fc.writeFile(filewriteText);

    }
}
