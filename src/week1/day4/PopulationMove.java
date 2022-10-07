package week1.day4;

import java.util.HashMap;
import java.util.List;

public class PopulationMove {
    private int fromSido;
    private int toSido;
    private HashMap<Integer, String> map;
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
        map = new HashMap<>();
    }
    public int getFromSido() {
        return fromSido;
    }
    public int getToSido() {
        return toSido;
    }
    public void PopulationMap(List<PopulationMove> list){
        for(PopulationMove pm : list){
        }
    }

    public static PopulationMove Parse(String data){
        String[] splitdata = data.split(",");
        int data1 = Integer.parseInt(splitdata[0]);
        int data2 = Integer.parseInt(splitdata[6]);
        return new PopulationMove(data1,data2);
    }
}
