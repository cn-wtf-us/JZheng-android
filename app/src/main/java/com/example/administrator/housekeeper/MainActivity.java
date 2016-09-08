package com.example.administrator.housekeeper;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.iv_t0);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
               R.animator.property_animator);
        set.setTarget(imageView);
        set.start();


    }
}
