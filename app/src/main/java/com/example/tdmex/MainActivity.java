package com.example.tdmex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1;
    ImageView im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        b1=findViewById(R.id.b1);
        im1=findViewById(R.id.im2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.valueOf(e1.getText().toString())<0){
                    RotateAnimation anim = new RotateAnimation(0,-90,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,1f);
                    anim.setDuration(3000);
                    anim.setFillAfter(true);
                    im1.startAnimation(anim);
                }
                if(Integer.valueOf(e1.getText().toString())>100){
                    RotateAnimation anim = new RotateAnimation(0,90,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,1f);
                    anim.setDuration(3000);
                    anim.setFillAfter(true);
                    im1.startAnimation(anim);
                }
                if(Integer.valueOf(e1.getText().toString())<100&Integer.valueOf(e1.getText().toString())>0){
                    e2.setText(String.valueOf(Integer.valueOf(e1.getText().toString())*0.75));
                    e3.setText(String.valueOf(Integer.valueOf(e1.getText().toString())*0.15));
                    e4.setText(String.valueOf(Integer.valueOf(e1.getText().toString())*0.10));
                }
            }
        });
    }
}