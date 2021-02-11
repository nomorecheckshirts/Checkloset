package io.github.checkloset.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Clothes")
public class Clothes {
    @PrimaryKey(autoGenerate = true) public int id = 1;
    @ColumnInfo(name = "image_file") public String imageFile = "image.jpeg";
}
