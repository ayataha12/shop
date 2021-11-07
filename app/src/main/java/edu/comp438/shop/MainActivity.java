package edu.comp438.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonL,buttonS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonL = (Button) findViewById(R.id.buttonLog);
        buttonS = (Button) findViewById(R.id.buttonSign);

        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLog();
            }
        });

        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSign();
            }
        });
    }
    public void openLog() {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }
    public void openSign() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}