package week1.day4;

import java.util.HashMap;
import java.util.List;

public class PopulationMove_useT<T> {
    private T fromSido;
    private T toSido;
    private HashMap<Integer, String> map;
    public PopulationMove_useT(T fromSido, T toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
        map = new HashMap<>();
    }
    public T getFromSido() {
        return fromSido;
    }
    public T getToSido() {
        return toSido;
    }
    public void PopulationMap(List<PopulationMove_useT> list){
        for(PopulationMove_useT pm : list){
        }
    }

    public static PopulationMove_useT Parse(String data){
        String[] splitdata = data.split(",");
        int data1 = Integer.parseInt(splitdata[6]); //전출
        int data2 = Integer.parseInt(splitdata[0]); //전입
        //파싱 안해도됨. 제네릭 사용함
        return new PopulationMove_useT(data1,data2);
    }
}
