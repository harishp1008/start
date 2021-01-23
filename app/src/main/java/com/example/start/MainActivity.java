package com.example.start;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageButton begin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        begin=findViewById(R.id.begin);
        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i=new Intent(MainActivity.this,offer_list.class);
                startActivity(i);*/
                //showDialog();
                startActivity(new Intent(MainActivity.this,scan.class));
            }
        });


    }
    void showDialog()
    {
        LayoutInflater inflater=LayoutInflater.from(this);
        View view=inflater.inflate(R.layout.custom_popup,null);
       ImageButton yes=view.findViewById(R.id.yes);
       Button no=view.findViewById(R.id.no);
       yes.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(MainActivity.this,offer_list.class);
               startActivity(i);
           }
       });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Pressed No!",Toast.LENGTH_SHORT).show();
            }
        });
       AlertDialog alertDialog=new AlertDialog.Builder(this)
                .setView(view).create();
alertDialog.show();
    }
}