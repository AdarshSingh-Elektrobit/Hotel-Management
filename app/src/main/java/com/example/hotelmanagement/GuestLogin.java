package com.example.hotelmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuestLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_login);
    }


    public void startGuestDashboard(View view){
        Intent intent = new Intent(getApplicationContext(), GuestDashboard.class);
        startActivity(intent);

    }
}