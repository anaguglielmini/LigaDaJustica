package com.example.pam_ligajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void v(View view) {
        Intent intent = new Intent(this, VixenActivity.class);
        startActivity(intent);
    }

    public void f(View view) {
        Intent intent = new Intent(this, FlashActivity.class);
        startActivity(intent);
    }
    public void m(View view) {
        Intent intent = new Intent(this, MulherActivity.class);
        startActivity(intent);
    }
    public void s(View view) {
        Intent intent = new Intent(this, SupermanActivity.class);
        startActivity(intent);
    }
    public void voltar(View view) {
        Intent intent = new Intent(this, ComecoActivity.class);
        startActivity(intent);
    }
}

