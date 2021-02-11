package io.github.checkloset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

public class MainActivity extends AppCompatActivity {
    MaterialCalendarView materialCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_view);

        materialCalendarView = findViewById(R.id.calendarView);

        materialCalendarView.setTopbarVisible(false);
    }
}