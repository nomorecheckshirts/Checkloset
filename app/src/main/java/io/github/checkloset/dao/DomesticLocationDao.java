package io.github.checkloset.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import io.github.checkloset.entity.Clothes;
import io.github.checkloset.entity.DomesticLocation;

public interface DomesticLocationDao {

    @Query("select * from DomesticLocation")
    public List<DomesticLocation> findAllDomesticLocation();

    @Query("select * from DomesticLocation where code = :id")
    public DomesticLocation findOneDomesticLocation(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertDomesticLocation(DomesticLocation domesticLocation);

    @Delete
    public void deleteDomesticLocation(DomesticLocation domesticLocation);
}
