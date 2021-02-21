package io.github.checkloset.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import io.github.checkloset.items.CalenderLook;

public class CalenderLookDBHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String NAME = "calenderManager";
    private static final String TABLE_NAME = "calenderLook";
    private static final int VERSION = 1;

    private static final String ID = "id";
    private static final String CUSTOM_IDS = "customClothes_ids";
    private static final String CLOTHES_DATE = "clothes_date";
    private static final String WEATHER = "weather";
    private static final String REPRESENT_COLOR = "represent_color";


    public CalenderLookDBHelper(Context context){
        super(context, NAME, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Create_table = "create table " + TABLE_NAME + "(" +
                ID + "integer primary key, " +
                CUSTOM_IDS + "text, " +
                CLOTHES_DATE + "text, " +
                WEATHER + "text, " +
                REPRESENT_COLOR + "text )";

        sqLiteDatabase.execSQL(Create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVer, int newVer) {

        sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public List<CalenderLook> getAllCalenderLook(){

        List<CalenderLook> list = new ArrayList<>();
        String selectQuery = "select * from " + TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){
            do{
                CalenderLook calenderLook = new CalenderLook();

                calenderLook.setId(Integer.parseInt(cursor.getString(0)));
                calenderLook.setCustomClothes_ids(cursor.getString(1));
                calenderLook.setClothes_date(cursor.getString(2));
                calenderLook.setWeather(cursor.getString(3));
                calenderLook.setRepresent_color(cursor.getString(4));

                list.add(calenderLook);
            }while(cursor.moveToNext());
        }

        return list;
    }

    public CalenderLook getCalenderLook(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, new String[]{ID, CUSTOM_IDS, CLOTHES_DATE, WEATHER, REPRESENT_COLOR},
                ID + "=?", new String[]{String.valueOf(id)}, null, null, null, null);

        if(cursor == null){
            return null;
        }

        cursor.moveToFirst();

        CalenderLook calenderLook = new CalenderLook();

        calenderLook.setId(Integer.parseInt(cursor.getString(0)));
        calenderLook.setCustomClothes_ids(cursor.getString(1));
        calenderLook.setClothes_date(cursor.getString(2));
        calenderLook.setWeather(cursor.getString(3));
        calenderLook.setRepresent_color(cursor.getString(4));

        return calenderLook;
    }

    public void addCalenderLook(CalenderLook calenderLook){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(ID, calenderLook.getId());
        contentValues.put(CUSTOM_IDS, calenderLook.getCustomClothes_ids());
        contentValues.put(CLOTHES_DATE, calenderLook.getClothes_date());
        contentValues.put(WEATHER, calenderLook.getWeather());
        contentValues.put(REPRESENT_COLOR, calenderLook.getRepresent_color());

        db.insert(TABLE_NAME, null, contentValues);
        db.close();
    }

    public int updateCalenderLook(CalenderLook calenderLook){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(ID, calenderLook.getId());
        contentValues.put(CUSTOM_IDS, calenderLook.getCustomClothes_ids());
        contentValues.put(CLOTHES_DATE, calenderLook.getClothes_date());
        contentValues.put(WEATHER, calenderLook.getWeather());
        contentValues.put(REPRESENT_COLOR, calenderLook.getRepresent_color());

        return db.update(TABLE_NAME, contentValues, ID + "=?",
                new String[]{String.valueOf(calenderLook.getId())});
    }

    public void deleteCalenderLook(CalenderLook calenderLook){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, ID + "=?", new String[]{String.valueOf(calenderLook.getId())});
        db.close();
    }

    public void deleteCalenderLook(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, ID + "=?", new String[]{String.valueOf(id)});
        db.close();
    }

    public List<Integer> getCustomIds(CalenderLook calenderLook){
        List<Integer> list = new ArrayList<>();
        String[] ids = calenderLook.getCustomClothes_ids().split("|");
        
        for(String clothesId : ids){
            list.add(Integer.parseInt(clothesId));
        }

        return list;
    }

    public List<Integer> getCustomIds(int id){
        CalenderLook calenderLook = getCalenderLook(id);

        List<Integer> list = new ArrayList<>();
        String[] ids = calenderLook.getCustomClothes_ids().split("|");

        for(String clothesId : ids){
            list.add(Integer.parseInt(clothesId));
        }

        return list;
    }

}
