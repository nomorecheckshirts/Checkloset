package io.github.checkloset.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "Fashion")
public class Fashion {
    @PrimaryKey(autoGenerate = true) public int id;
    @ColumnInfo(name = "customClothes_id") public int customClothes_id;
    @ColumnInfo(name = "clothes_date") public String clothes_date = "2021-02-02";
}
