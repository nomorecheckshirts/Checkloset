package io.github.checkloset.items;

public class CalenderLook {
    public int id;
    public String customClothes_ids;
    public String clothes_date = "2021-02-02";
    public String weather;
    public String represent_color; // RRRGGGBBB form

    public CalenderLook(int id, String customClothes_ids, String clothes_date,
                        String weather, String represent_color) {
        this.id = id;
        this.customClothes_ids = customClothes_ids; // id|id|id format
        this.clothes_date = clothes_date;
        this.weather = weather;
        this.represent_color = represent_color;
    }

    public CalenderLook(){

    }

    public int getId() {
        return id;
    }

    public String getClothes_date() {
        return clothes_date;
    }

    public String getWeather(){
        return weather;
    }

    public String getRepresent_color() {
        return represent_color;
    }

    public String getCustomClothes_ids() {
        return customClothes_ids;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomClothes_ids(String customClothes_ids) {
        this.customClothes_ids = customClothes_ids;
    }

    public void setClothes_date(String clothes_date) {
        this.clothes_date = clothes_date;
    }

    public void setWeather(String weather){
        this.weather = weather;
    }

    public void setRepresent_color(String represent_color) {
        this.represent_color = represent_color;
    }
}
