/*package io.github.checkloset.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import io.github.checkloset.dao.ClothesDao;
import io.github.checkloset.dao.CustomClothesDao;
import io.github.checkloset.dao.DomesticLocationDao;
import io.github.checkloset.dao.FashionDao;
import io.github.checkloset.entity.CalenderLook;
import io.github.checkloset.entity.Clothes;
import io.github.checkloset.entity.CustomClothes;
import io.github.checkloset.entity.DomesticLocation;

@Database(entities = {Clothes.class, CustomClothes.class, DomesticLocation.class, CalenderLook.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ClothesDao clothesDao();
    public abstract CustomClothesDao customClothesDao();
    public abstract DomesticLocationDao domesticLocationDao();
    public abstract FashionDao fashionDao();

    private AppDatabase instance = null;

    public AppDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "ChecklosetDB.db"
            ).build();
        }

        return instance;
    }
}
*/