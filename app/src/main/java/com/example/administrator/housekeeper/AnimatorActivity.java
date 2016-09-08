package com.example.administrator.housekeeper;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);
        ImageView imageView = (ImageView) findViewById(R.id.iv_a1);
        Animation animation = AnimationUtils.loadAnimation(this,R.animator.tween_animator);
        imageView.startAnimation(animation);
    }
}
