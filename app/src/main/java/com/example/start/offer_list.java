package com.example.start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class offer_list extends AppCompatActivity {
    RecyclerView offer_recyclerView;
    RecyclerView.Adapter offer_adapter;
    RecyclerView.LayoutManager offer_layoutManager;
    String percent[]={"20% OFF","10% OFF","30% OFF","50% OFF","60% OFF"};
    String cloth[]={"On T-shirts","on Casual shirts","on Socks","on Any item","on Shoes"};
    String price[]={"Max Rs : 130","Max Rs: 120","Max 100","Max Rs : 100","Max Rs : 110"};
    String Coupon[]={"BUYERS","WINTER","SUPERR"," "," "};
    String date[]={"Expires on: 02/01","Expires on: 04/01","Expires on: 03/01","Expires on: 10/01","Expires on: 03/02"};
    String offer_detail[]={"Winter offer","Prime offer","Prime Offer","Combo offer","Bulk offer"};
    int bg[]={R.drawable.blue,R.drawable.light,R.drawable.pink,R.drawable.red,R.drawable.purple};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_list);
        offer_recyclerView=findViewById(R.id.store);
        offer_layoutManager=new LinearLayoutManager(this);
        offer_recyclerView.setLayoutManager(offer_layoutManager);
        offer_adapter=new Offer_adapter(this,percent,cloth,price,Coupon,date,offer_detail,bg);
        offer_recyclerView.setAdapter(offer_adapter);
    }
}