package io.github.checkloset.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CalenderLookDBHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String NAME = "calenderManager";
    private static final String TABLE_NAME = "calenderLook";
    private static final int VERSION = 1;

    private static final String ID = "id";
    private static final String CUSTOM_ID = "customClothes_id";
    private static final String CLOTHES_DATE = "clothes_date";
    private static final String REPRESENT_COLOR = "represent_color";


    public CalenderLookDBHelper(Context context){
        super(context, NAME, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Create_table = "create table " + TABLE_NAME + "(" +
                ID + "integer primary key, " +
                CUSTOM_ID + "integer, " +
                CLOTHES_DATE + "text, " +
                REPRESENT_COLOR + "text )";

        sqLiteDatabase.execSQL(Create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVer, int newVer) {

        sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

}
