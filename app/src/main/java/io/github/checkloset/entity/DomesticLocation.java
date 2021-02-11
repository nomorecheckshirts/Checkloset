package io.github.checkloset.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class DomesticLocation {
    @PrimaryKey public Long code;
    @ColumnInfo(name = "Level1") public String level1;
    @ColumnInfo(name = "Level2") public String level2;
    @ColumnInfo(name = "Level3") public String level3;
    @ColumnInfo(name = "x") public int x;
    @ColumnInfo(name = "y") public int y;
}
