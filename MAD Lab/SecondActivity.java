package com.example.intents;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewData = findViewById(R.id.textViewData);

        // Get data from the Intent
        String data = getIntent().getStringExtra("EXTRA_DATA");
        textViewData.setText(data);
    }
}
