package com.example.nomalc_pc.picstamps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button firstBtn;
    private Button secondBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondBtn = findViewById(R.id.secondBtn);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistration();
            }
        });

        firstBtn = findViewById(R.id.firstBtn);
        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openLogin();
            }
        });

    }

    public void openRegistration() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void openLogin() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
