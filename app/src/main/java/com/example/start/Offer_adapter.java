package com.example.start;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;



public class Offer_adapter extends RecyclerView.Adapter<Offer_adapter.ViewHolder> {
    Context context;
    String per[];
    String clot[];
    String pric[];
    String Coup[];
    String dat[];
    String offer_d[];
    int[] offer_img;
    public Offer_adapter(Context context,String[] per,String [] clot,String[] pric,String[] Coup,String[] dat,String[] offer_d,int[] offer_img)
    {
        this.context=context;
        this.per=per;
        this.clot=clot;
        this.pric=pric;
        this.Coup=Coup;
        this.dat=dat;
        this.offer_d=offer_d;
        this.offer_img=offer_img;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.offer,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Offer_adapter.ViewHolder holder, int position) {
        holder.percent.setText(per[position]);
        holder.offer.setText(offer_d[position]);
        holder.clothes.setText(clot[position]);
        holder.price.setText(pric[position]);
        holder.coupon.setText(Coup[position]);
        holder.date.setText(dat[position]);
        holder.bg.setBackgroundResource(offer_img[position]);
    }

    @Override
    public int getItemCount() {
        return pric.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView percent;
        TextView clothes;
        TextView price;
        TextView coupon;
        TextView date;
        TextView offer;
        CardView bg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            percent=itemView.findViewById(R.id.percent);
            clothes=itemView.findViewById(R.id.clothes);
            price=itemView.findViewById(R.id.price);
            coupon=itemView.findViewById(R.id.code);
            date=itemView.findViewById(R.id.expiry_date);
            offer=itemView.findViewById(R.id.offer_name);
            bg= (CardView)itemView.findViewById(R.id.colour);
        }
    }
}
