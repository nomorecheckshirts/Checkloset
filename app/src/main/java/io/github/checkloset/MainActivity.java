package io.github.checkloset;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import io.github.checkloset.db.AppDatabase;
import io.github.checkloset.db.CustomClothesDBHelper;
import io.github.checkloset.entity.CustomClothes;

public class MainActivity extends AppCompatActivity {

    // 요런식으로 원하는 데이터베이스 클래스 가져와서 사용
    CustomClothesDBHelper db = new CustomClothesDBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}