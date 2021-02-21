package io.github.checkloset.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import io.github.checkloset.items.CustomClothes;

public class CustomClothesDBHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String NAME = "customClothesManager";
    private static final String TABLE_NAME = "customClothes";
    private static final int VERSION = 1;

    private static final String ID = "id";
    private static final String CLOTHES = "clothes";
    private static final String COLOR = "color";
    private static final String THICK = "thick";
    private static final String KIND = "kind";
    private static final String TAG = "tag";
    private static final String NOTES = "notes";


    public CustomClothesDBHelper(Context context){
        super(context, NAME, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Create_table = "create table " + TABLE_NAME + "(" +
                ID + "integer primary key, " +
                CLOTHES + "integer, " +
                COLOR + "text, " +
                THICK + "integer, " +
                KIND + "text, " +
                TAG + "text, " +
                NOTES + "text )";

        sqLiteDatabase.execSQL(Create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public List<CustomClothes> getAllCustomClothes(){

        List<CustomClothes> list = new ArrayList<CustomClothes>();
        String selectQuery = "select * from " + TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if(cursor.moveToFirst()){
            do{
                CustomClothes customClothes = new CustomClothes();

                customClothes.setId(Integer.parseInt(cursor.getString(0)));
                customClothes.setClothes(Integer.parseInt(cursor.getString(1)));
                customClothes.setColor(cursor.getString(2));
                customClothes.setThick(Integer.parseInt(cursor.getString(3)));
                customClothes.setKind(cursor.getString(4));
                customClothes.setTag(cursor.getString(5));
                customClothes.setNote(cursor.getString(6));

                // list에 추가
                list.add(customClothes);
            }while(cursor.moveToNext());
        }

        return list;
    }

    public CustomClothes getCustomClothes(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, new String[]{ID, CLOTHES, COLOR, THICK, KIND, TAG, NOTES},
                 ID + "=?", new String[]{String.valueOf(id)}, null, null, null, null);

        if(cursor == null){
            return null;
        }

        cursor.moveToFirst();

        CustomClothes customClothes = new CustomClothes();

        customClothes.setId(Integer.parseInt(cursor.getString(0)));
        customClothes.setClothes(Integer.parseInt(cursor.getString(1)));
        customClothes.setColor(cursor.getString(2));
        customClothes.setThick(Integer.parseInt(cursor.getString(3)));
        customClothes.setKind(cursor.getString(4));
        customClothes.setTag(cursor.getString(5));
        customClothes.setNote(cursor.getString(6));

        return customClothes;
    }

    public void addCustomClothes(CustomClothes customClothes){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(ID, customClothes.getId());
        contentValues.put(CLOTHES, customClothes.getClothes());
        contentValues.put(COLOR, customClothes.getColor());
        contentValues.put(THICK, customClothes.getThick());
        contentValues.put(KIND, customClothes.getKind());
        contentValues.put(TAG, customClothes.getTag());
        contentValues.put(NOTES, customClothes.getNote());

        db.insert(TABLE_NAME, null, contentValues);
        db.close();
    }

    public int updateCustomClothes(CustomClothes customClothes){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(ID, customClothes.getId());
        contentValues.put(CLOTHES, customClothes.getClothes());
        contentValues.put(COLOR, customClothes.getColor());
        contentValues.put(THICK, customClothes.getThick());
        contentValues.put(KIND, customClothes.getKind());
        contentValues.put(TAG, customClothes.getTag());
        contentValues.put(NOTES, customClothes.getNote());

        return db.update(TABLE_NAME, contentValues, ID + "=?",
                new String[]{String.valueOf(customClothes.getId())});
    }

    public void deleteCustomClothes(CustomClothes customClothes){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, ID + "=?", new String[]{String.valueOf(customClothes.getId())});

        db.close();
    }

    public void deleteCustomClothes(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, ID + "=?", new String[]{String.valueOf(id)});

        db.close();
    } // 앱 상황 따라 필요없는거 삭제할 것
}
