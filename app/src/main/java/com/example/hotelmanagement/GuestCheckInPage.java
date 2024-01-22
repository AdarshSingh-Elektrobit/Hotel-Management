package com.example.hotelmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuestCheckInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_check_in_page);
    }

    public void Checkout(View view){
        Intent intent = new Intent(getApplicationContext(),GuestLogin.class);
        startActivity(intent);

//        Intent intent = new Intent(Intent.ACTION_CALL);



    }
}