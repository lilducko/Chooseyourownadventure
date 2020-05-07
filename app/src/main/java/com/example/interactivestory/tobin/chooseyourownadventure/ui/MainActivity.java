package com.example.interactivestory.tobin.chooseyourownadventure.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.interactivestory.tobin.chooseyourownadventure.R;

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
                startStory(name);
            }



        }));
    }
    private void startStory(String name) {

        Resources resources = getResources();

        String key = resources.getString(R.string.user_name);
        Intent intent = new Intent(MainActivity.this, StoryActivity.class);
        intent.putExtra(key, name);
        startActivity(intent);

    }
}
