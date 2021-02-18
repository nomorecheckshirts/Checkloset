package io.github.checkloset.entity;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

public class Clothes {
    @PrimaryKey(autoGenerate = true) public int id = 1;
    @ColumnInfo(name = "image_file") public String imageFile = "image.jpeg";
} // 굳이 필요한가? 의견 물어보고 지우던가 놔두던가 하자.

