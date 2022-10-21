package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnloc, btncall, btnmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnloc=findViewById(R.id.btnloc);
        btncall=findViewById(R.id.btncall);
        btnmail=findViewById(R.id.btnmail);

        btnloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maps = new Intent(Intent.ACTION_VIEW
                    , Uri.parse("https://maps.google.com/?q=-6.908129,109.384857"));
                startActivity(maps);
            }
        });

        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no = "+6282322304800";
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.fromParts("tel", no,null));
                startActivity(call);
            }
        });

        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mail = new Intent(Intent.ACTION_VIEW
                    , Uri.parse("mailto:111202113396@mhs.dinus.ac.id"));
                startActivity(mail);
            }
        });


    }
}