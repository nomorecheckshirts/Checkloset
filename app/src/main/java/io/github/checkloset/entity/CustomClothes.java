package io.github.checkloset.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CustomClothes")
public class CustomClothes {
    @PrimaryKey(autoGenerate = true) public int id = 1;
    @ColumnInfo(name = "image_file") public String imageFile= "image.jpeg"; // 이미지 정보
    @ColumnInfo(name = "colorR") public float colorR = 0.0f;
    @ColumnInfo(name = "colorG") public float colorG = 0.0f;
    @ColumnInfo(name = "colorB") public float colorB = 0.0f;
    @ColumnInfo(name = "thick") public int thick = 0;
    @ColumnInfo(name = "kind") public String kind = "Outer";
    @ColumnInfo(name = "tag") public String tag = "tag";
    @ColumnInfo(name = "note") public String note = "notes";
}
