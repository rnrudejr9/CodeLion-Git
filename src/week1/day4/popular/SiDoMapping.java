package week1.day4.popular;

import java.util.HashMap;

public class SiDoMapping {
    private HashMap<Integer, String> sidoCode;

    public SiDoMapping(){
        sidoCode = new HashMap<>();
        sidoCode.put(11, "서울특별시");
        sidoCode.put(21, "부산광역시");
        sidoCode.put(22, "대구광역시");
        sidoCode.put(23, "인천광역시");
        sidoCode.put(24, "광주광역시");
        sidoCode.put(25, "대전광역시");
        sidoCode.put(26, "울산광역시");
        sidoCode.put(29, "세종특별자치시");
        sidoCode.put(31, "경기도");
        sidoCode.put(32, "강원도");
        sidoCode.put(33, "충청북도");
        sidoCode.put(34, "충청남도");
        sidoCode.put(35, "전라북도");
        sidoCode.put(36, "전라남도");
        sidoCode.put(37, "경상북도");
        sidoCode.put(38, "경상남도");
        sidoCode.put(39, "제주특별자치도");
    }
    public String codeToName(int code){
        return sidoCode.get(code);
    }
}