package com.example.bhuiyan.myapp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btnBack=(Button)findViewById(R.id.btnSample);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==btnBack){
            finish();
            startActivity(new Intent(this,ProfileActivity.class));
        }
    }
}
