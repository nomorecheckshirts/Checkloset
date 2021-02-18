package io.github.checkloset.items;

public class CustomClothes {
    public int id;
    public int clothes; //  옷 id or file path
    public String color; // RRRGGGBBB format
    public int thick;
    public String kind = "Outer";
    public String tag = "tag";
    public String note = "notes";

    public CustomClothes(){

    }

    public CustomClothes(int id, int clothes, String color, int thick,
                         String kind, String tag, String note){

        this.id = id;
        this.clothes = clothes;
        this.color = color;
        this.thick = thick;
        this.kind = kind;
        this.tag = tag;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public int getClothes() {
        return clothes;
    }

    public String getColor() {
        return color;
    }

    public int getThick() {
        return thick;
    }

    public String getKind() {
        return kind;
    }

    public String getTag() {
        return tag;
    }

    public String getNote() {
        return note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClothes(int clothes) {
        this.clothes = clothes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setThick(int thick) {
        this.thick = thick;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
