package com.example.prakt47_;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button startButton;
    private TextView statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        startButton = findViewById(R.id.startButton);
        statusText = findViewById(R.id.statusText);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startProcess();
            }
        });
    }

    private void startProcess() {
        progressBar.setVisibility(View.VISIBLE);

        statusText.setText("Загрузка...");
        statusText.setTextColor(Color.BLACK);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
                statusText.setText("Загрузка завершена!");
                statusText.setTextColor(Color.GREEN);
                findViewById(R.id.activity_main).setBackgroundColor(Color.parseColor("#A8E6A3"));
            }
        }, 5000);
    }
}