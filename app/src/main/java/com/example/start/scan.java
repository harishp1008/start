package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class scan extends AppCompatActivity {
private View layoutshow;
private ImageView imgwifi,imganim,imganim2;
private Handler handlerAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scan);


        init();

        Glide.with(getBaseContext()).load(R.drawable.wifi)
                .apply(new RequestOptions().circleCrop()).into(imgwifi);


                startTask();

    }
    private void init()
    {
        this.handlerAnim=new Handler();
        this.layoutshow=findViewById(R.id.layoutwifi);
        this.imgwifi=findViewById(R.id.wifi_icon);
        this.imganim=findViewById(R.id.img_anim);
        this.imganim2=findViewById(R.id.imganim2);
    }
    private void startTask()
    {
        this.runnable.run();
        this.layoutshow.setVisibility(View.VISIBLE);
    }
    private void stopTask()
    {
        this.handlerAnim.removeCallbacks(runnable);
        this.layoutshow.setVisibility(View.GONE);
    }
    private Runnable runnable=new Runnable() {
        @Override
        public void run() {
            imganim.animate().scaleX(4f).scaleY(4f).alpha(0f).setDuration(1000).withEndAction(new Runnable() {
                @Override
                public void run() {
                  imganim.setScaleX(1f);
                  imganim.setScaleY(1f);
                  imganim.setAlpha(1f);
                }
            });
            imganim2.animate().scaleX(4f).scaleY(4f).alpha(0f).setDuration(1000).withEndAction(new Runnable() {
                @Override
                public void run() {
                    imganim2.setScaleX(1f);
                    imganim2.setScaleY(1f);
                    imganim2.setAlpha(1f);
                }
            });
            handlerAnim.postDelayed(runnable,1500);

        }
    };












}