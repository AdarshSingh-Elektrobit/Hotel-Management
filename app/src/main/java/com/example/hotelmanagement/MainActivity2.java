package com.example.hotelmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }



    public  void adminLogin(View view){

        Intent intent = new Intent(getApplicationContext(), AdminLogin.class);
        startActivity(intent);

    }

    public  void guestLogin(View view){
        Intent intent = new Intent(getApplicationContext(), GuestLogin.class);
        startActivity(intent);
    }
}