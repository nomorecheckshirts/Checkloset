package io.github.checkloset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bottomNavigationContainer = findViewById(R.id.bottom_navigation_container);

        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(bottomNavigationContainer);
//        BottomSheetBehavior.setPeekHeight(50);
    }
}