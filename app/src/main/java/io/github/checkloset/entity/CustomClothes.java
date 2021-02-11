package io.github.checkloset.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CustomClothes")
public class CustomClothes {
    @PrimaryKey(autoGenerate = true) public int id;
    @ColumnInfo(name = "clothes_id") public int clothes_id;
    @ColumnInfo(name = "colorR") public float colorR;
    @ColumnInfo(name = "colorG") public float colorG;
    @ColumnInfo(name = "colorB") public float colorB;
    @ColumnInfo(name = "thick") public int thick;
    @ColumnInfo(name = "kind") public String kind = "Outer";
    @ColumnInfo(name = "tag") public String tag = "tag";
    @ColumnInfo(name = "note") public String note = "notes";
}
