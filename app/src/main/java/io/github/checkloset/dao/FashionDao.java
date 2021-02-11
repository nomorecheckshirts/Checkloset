package io.github.checkloset.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import io.github.checkloset.entity.Fashion;

@Dao
public interface FashionDao {

    @Query("select * from Fashion")
    public List<Fashion> findAllFashion();

    @Query("select * from Fashion where id = :id")
    public Fashion findOneFashion(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertFashion(Fashion fashion);

    @Delete
    public void deleteFashion(Fashion fashion);
}