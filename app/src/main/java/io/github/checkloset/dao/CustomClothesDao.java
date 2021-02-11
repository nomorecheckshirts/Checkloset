package io.github.checkloset.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import io.github.checkloset.entity.Clothes;
import io.github.checkloset.entity.CustomClothes;

@Dao
public interface CustomClothesDao {

    @Query("select * from CustomClothes")
    public List<CustomClothes> findAllCustomClothes();

    @Query("select * from CustomClothes where id = :id")
    public CustomClothes findOneCustomClothes(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertCustomClothes(CustomClothes customClothes);

    @Delete
    public void deleteCustomClothes(CustomClothes customClothes);
}
