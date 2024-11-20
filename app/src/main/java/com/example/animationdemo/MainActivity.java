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
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
//    private Button btn_Blink,btn_Move,btn_Rotate,btn_Slide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =findViewById(R.id.imageView);

//    implementation 'androidx.dynamicanimation:dynamicanimation:1.0.0'
        SpringAnimation springAnimationY = new SpringAnimation(imageView,DynamicAnimation.TRANSLATION_Y,0f);
        springAnimationY.getSpring().setDampingRatio(SpringForce.DAMPING_RATIO_HIGH_BOUNCY);
        springAnimationY.getSpring().setStiffness(SpringForce.STIFFNESS_LOW);

//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                springAnimationY.animateToFinalPosition(800f);
//            }
//        });

//        DynamicAnimation.OnAnimationEndListener endListener = new DynamicAnimation.OnAnimationEndListener(){
//
//            @Override
//            public void onAnimationEnd(DynamicAnimation animation, boolean canceled, float value, float velocity) {
//                springAnimationY.animateToFinalPosition(0f);
//            }
//        };
//        springAnimationY.addEndListener(endListener);

        FlingAnimation flingAnimation = new FlingAnimation(imageView,DynamicAnimation.ROTATION_X);

        flingAnimation.setStartVelocity(2000f);
        flingAnimation.setFriction(1.5f);
        flingAnimation.setMinValue(0f);
        flingAnimation.setMaxValue(1000f);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flingAnimation.start();
            }
        });

//        btn_Blink = findViewById(R.id.btnBlinkImage);
//       btn_Blink.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
//                        R.anim.blink_animation);
//                imageView.startAnimation(animation);
//            }
//        });
//        btn_Move = findViewById(R.id.btnMoveImage);
//        btn_Move.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
//                        R.anim.move_object_animation);
//                imageView.startAnimation(animation);
//            }
//        });
//        btn_Rotate = findViewById(R.id.btnRotateImage);
//        btn_Rotate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
//                        R.anim.rotate_animation);
//                imageView.startAnimation(animation);
//            }
//        });
//        btn_Slide = findViewById(R.id.btnSlideImage);
//        btn_Slide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
//                        R.anim.slide_animation);
//                imageView.startAnimation(animation);
//            }
//        });
    }
}