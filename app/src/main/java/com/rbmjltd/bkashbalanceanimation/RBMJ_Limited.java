package com.rbmjltd.bkashbalanceanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class RBMJ_Limited extends AppCompatActivity {

    CardView CardView;
    ImageView moneyIconLeft,moneyIconRight;
    TextView moneyTextView;
    Animation leftToRightAnim,rightToLeftAnim,fadeOutAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RBMJLTD();


        if (moneyTextView.getText()==getString(R.string.tap_for_balnace)){
            moneyIconLeft.setVisibility(View.VISIBLE);
            moneyIconRight.setVisibility(View.INVISIBLE);
        }else {
            moneyIconLeft.setVisibility(View.INVISIBLE);
            moneyIconRight.setVisibility(View.VISIBLE);
        }

        CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (moneyTextView.getText()==getString(R.string.tap_for_balnace)){

                    moneyIconLeft.startAnimation(leftToRightAnim);
                    moneyTextView.startAnimation(fadeOutAnim);

                    new CountDownTimer(2000,1000){

                        @Override
                        public void onTick(long l) {

                        }

                        @Override
                        public void onFinish() {
                            moneyTextView.setText(getString(R.string.balnace_amount));
                            moneyIconLeft.setVisibility(View.INVISIBLE);
                            moneyIconRight.setVisibility(View.VISIBLE);

                            new CountDownTimer(1000,500){

                                @Override
                                public void onTick(long l) {

                                }

                                @Override
                                public void onFinish() {
                                    moneyIconRight.startAnimation(rightToLeftAnim);
                                    moneyTextView.startAnimation(fadeOutAnim);
                                    new CountDownTimer(2000,1000){

                                        @Override
                                        public void onTick(long l) {

                                        }

                                        @Override
                                        public void onFinish() {

                                            moneyIconLeft.setVisibility(View.VISIBLE);
                                            moneyIconRight.setVisibility(View.INVISIBLE);
                                            moneyTextView.setText(getString(R.string.tap_for_balnace));

                                        }
                                    }.start();

                                }
                            }.start();

                        }
                    }.start();
                }

            }
        });


    }//============OnCreate Bundle End ===========================================

    void RBMJLTD(){
        CardView = findViewById(R.id.CardView);
        moneyIconLeft = findViewById(R.id.moneyIconLeft);
        moneyIconRight = findViewById(R.id.moneyIconRight);
        moneyTextView = findViewById(R.id.moneyTextView);

        leftToRightAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_to_right);
        rightToLeftAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_to_left);
        fadeOutAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);


    }






}