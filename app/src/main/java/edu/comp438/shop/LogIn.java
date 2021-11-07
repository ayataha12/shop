package edu.comp438.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity {

    Button myaccout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

       myaccout = (Button) findViewById(R.id.login);
        myaccout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyAccount();
            }
        });
    }
    public void openMyAccount() {
        Intent intent = new Intent(this, MyAccount.class);
        startActivity(intent);
    }
}