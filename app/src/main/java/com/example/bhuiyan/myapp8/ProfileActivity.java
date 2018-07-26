package com.example.bhuiyan.myapp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;
    private TextView textViewUserEmail;
    //private TextView textViewUserName;
    private Button btnLogout;
    private Button btnHome;
    private Button btnAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        firebaseAuth= FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser()==null){
            finish();
            startActivity(new Intent(this,SignupActivity.class));
        }
        //firebase user objecty
        FirebaseUser user=firebaseAuth.getCurrentUser();
        btnHome=(Button)findViewById(R.id.btnHome);
        btnAbout=(Button)findViewById(R.id.btnAbout);
        textViewUserEmail=(TextView)findViewById(R.id.textViewUserEmail);
        //textViewUserName=(TextView)findViewById(R.id.textViewUserName);
        //textViewUserName.setText("Welcome:" +user.getName());
        textViewUserEmail.setText("Welcome: "+user.getEmail());
        btnLogout=(Button)findViewById(R.id.btnLogout);


        //listener Attached
        btnHome.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnLogout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==btnLogout){
            firebaseAuth.signOut();
            startActivity(new Intent(this,SignupActivity.class));
        }
        if (view==btnHome){
            finish();
            startActivity(new Intent(this,HomeActivity.class));
        }
        if (view==btnAbout){
            finish();
            startActivity(new Intent(this,AboutActivity.class));
        }}}
