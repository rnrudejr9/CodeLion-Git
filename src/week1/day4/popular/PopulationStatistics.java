package week1.day4.popular;

import week1.day4.popular.CreateFile;
import week1.day4.popular.PopulationMove;
import week1.day4.popular.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    public static void main(String[] args) throws IOException {
        String address="./hello";
        ReadFile readFile = new ReadFile(address);
        List<PopulationMove> populationMoves = readFile.readByLine();

        MoveCount moveCount=new MoveCount();
        moveCount.setMoveCntMap(populationMoves);
        Map<String, Integer> moveCntMap=moveCount.getMoveCntMap();

        CreateFile createFile = new CreateFile();
        List<String> cntResult=new ArrayList<>();
        for(String key:moveCntMap.keySet()){
            String s = String.format("key:%s value:%d\n", key, moveCntMap.get(key));
            cntResult.add(s);
        }
        createFile.write(cntResult, "each-sido-cnt.txt");
    }
}