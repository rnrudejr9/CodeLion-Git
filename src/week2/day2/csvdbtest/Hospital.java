package week2.day2.csvdbtest;

public class Hospital {
    private String id;
    private String adress;
    private String district;
    private char category;
    private int emergency_room;
    private String name;
    private String subdivision;

    public Hospital(String id, String adress, String district, char category, int emergency_room, String name, String subdivision) {
        this.id = id;
        this.adress = adress;
        this.district = district;
        this.category = category;
        this.emergency_room = emergency_room;
        this.name = name;
        this.subdivision = subdivision;
    }
}
