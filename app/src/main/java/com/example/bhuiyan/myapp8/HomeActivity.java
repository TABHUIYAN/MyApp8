package com.example.bhuiyan.myapp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnBack;
    private Button btnPlayQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnBack=(Button) findViewById(R.id.bcHome);
        btnPlayQuiz=(Button)findViewById(R.id.btnPlayQuiz);
        btnBack.setOnClickListener(this);
        btnPlayQuiz.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==btnBack){
            finish();
            startActivity(new Intent(this,ProfileActivity.class));
        }
      if (view==btnPlayQuiz){
           finish();
            startActivity(new Intent(this,IQActivity.class));
        }
    }
}


