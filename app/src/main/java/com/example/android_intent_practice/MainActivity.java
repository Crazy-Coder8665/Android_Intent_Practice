package com.example.android_intent_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Dial(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+923040169808"));
        startActivity(intent);
    }

    public void Browse(View view) {
        Uri webpage = Uri.parse("https://google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void Mail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, "addresses@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
        startActivity(intent);
    }

    public void change(View view) {
        Intent intent= new Intent(this,MainActivity2.class);
        intent.putExtra("message","Welcome to this Activity");
        startActivity(intent);
    }
}