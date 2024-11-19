package com.example.animationdemo;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button btn_Blink,btn_Move,btn_Rotate,btn_Slide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =findViewById(R.id.imageView);
        btn_Blink = findViewById(R.id.btnBlinkImage);
        btn_Blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink_animation);
                imageView.startAnimation(animation);
            }
        });
        btn_Move = findViewById(R.id.btnMoveImage);
        btn_Move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.move_object_animation);
                imageView.startAnimation(animation);
            }
        });
        btn_Rotate = findViewById(R.id.btnRotateImage);
        btn_Rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.rotate_animation);
                imageView.startAnimation(animation);
            }
        });
        btn_Slide = findViewById(R.id.btnSlideImage);
        btn_Slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slide_animation);
                imageView.startAnimation(animation);
            }
        });
    }
}