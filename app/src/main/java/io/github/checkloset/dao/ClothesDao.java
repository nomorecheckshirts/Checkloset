package io.github.checkloset.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import io.github.checkloset.entity.Clothes;

@Dao
public interface ClothesDao {

    @Query("select * from Clothes")
    public List<Clothes> findAllClothes();

    @Query("select * from Clothes where id = :id")
    public Clothes findOneClothes(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertClothes(Clothes clothes);

    @Delete
    public void deleteClothes(Clothes clothes);
}
