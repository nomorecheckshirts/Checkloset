package io.github.checkloset.entity;

public class CalenderLook {
    public int id;
    public int customClothes_id;
    public String clothes_date = "2021-02-02";
    public String represent_color; // RRRGGGBBB form

    public CalenderLook(int id, int customClothes_id, String clothes_date, String represent_color) {
        this.id = id;
        this.customClothes_id = customClothes_id;
        this.clothes_date = clothes_date;
        this.represent_color = represent_color;
    }

    public int getId() {
        return id;
    }

    public int getCustomClothes_id() {
        return customClothes_id;
    }

    public String getClothes_date() {
        return clothes_date;
    }

    public String getRepresent_color() {
        return represent_color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomClothes_id(int customClothes_id) {
        this.customClothes_id = customClothes_id;
    }

    public void setClothes_date(String clothes_date) {
        this.clothes_date = clothes_date;
    }

    public void setRepresent_color(String represent_color) {
        this.represent_color = represent_color;
    }
}
