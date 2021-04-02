package com.lthn.gotopapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void ClickRS(View view) {
        // gambar RS di Click
        Intent i = new Intent(this, RS.class);
        startActivity(i);


    }

    public void ClickSekolah(View view) {
        // gambar Sekolah di Click
        Intent i = new Intent(this, Sekolah.class);
        startActivity(i);

    }

    public void ClickPolisi(View view) {
        // gambar Polisi di Click
        Intent i = new Intent(this, Polisi.class);
        startActivity(i);

    }

    public void ClickGrocery(View view) {
        // gambar Grocery di Click
        Intent i = new Intent(this, Grocery.class);
        startActivity(i);

    }
}