package week4.day2;

import java.util.HashSet;
import java.util.Set;

public class HashTable {

    private int size = 10000;
    private int[] table = new int[size];

    public HashTable(){

    }

    public HashTable(int size){
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key){
        int asciiSum=0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }

        return asciiSum % size;
    }

    // key와 value를 받는 insert 함수를 통해 array에 저장
    public void insert(String key, int value){
        this.table[hash(key)] = value;
        System.out.printf("%s가 %d 번 방에 저장되었습니다\n",key, value);
    }

    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang", "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu",
                "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim",
                "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim",
                "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark",
                "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok",
                "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn",
                "SoonminEom", "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee",
                "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang",
                "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho",
                "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan",
                "JinhyuckHeo", "MinwooHwang", "SieunHwang", "JunhaHwang"};

        HashTable ht = new HashTable(200);
        for (int i=0; i< names.length; i++){
            ht.insert(names[i], ht.hash(names[i]));
        }

        // 해쉬가 충돌하는 상태
        System.out.println(ht.search("JiyoungAhn"));

    }



}