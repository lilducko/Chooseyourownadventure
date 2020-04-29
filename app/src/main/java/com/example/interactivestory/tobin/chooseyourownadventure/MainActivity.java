package com.example.interactivestory.tobin.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.pg1NameEditText);
        startButton = findViewById(R.id.pg1StartButton);

        startButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                Toast.makeText( MainActivity.this, name, Toast.LENGTH_LONG).show();
                startStory(name);
            }

            private void startStory(String name) {

            }
        }));
    }
    private void startStory(String name) {

    }
}
