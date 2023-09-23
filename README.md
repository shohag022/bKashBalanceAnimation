# bKash Balance Animation
> This source code provides instructions for integrating the bKash Balance Animation into your project.

> If you want to see the complete video of this code, watch it on ‌‌‌‌‌<a href="https://www.youtube.com/@rbmjltd" rel="nofollow">`YouTube`</a>  .

# XML Code 
```gradle
    <androidx.cardview.widget.CardView
        android:id="@+id/CardView"
        android:layout_width="match_parent"
        android:layout_height="45dp"
        app:cardBackgroundColor="@color/white"
        app:cardCornerRadius="24dp"
        android:layout_marginStart="40dp"
        android:layout_marginEnd="40dp"
        android:layout_centerInParent="true"
        android:elevation="10dp"
        >

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            android:orientation="horizontal"
            >
            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                >
                <ImageView
                    android:id="@+id/moneyIconLeft"
                    android:layout_width="40dp"
                    android:layout_height="40dp"
                    android:src="@drawable/bdt"
                    android:padding="10dp"
                    android:layout_margin="2dp"
                    android:background="@drawable/round_bg"
                    android:layout_alignParentStart="true"
                    android:visibility="invisible"
                    />

                <ImageView
                    android:id="@+id/moneyIconRight"
                    android:layout_width="40dp"
                    android:layout_height="40dp"
                    android:src="@drawable/bdt"
                    android:padding="10dp"
                    android:layout_margin="2dp"
                    android:background="@drawable/round_bg"
                    android:layout_alignParentEnd="true"
                    android:visibility="invisible"
                    />

                <TextView
                    android:id="@+id/moneyTextView"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_centerInParent="true"
                    android:text="@string/tap_for_balnace"
                    android:textAlignment="center"
                    android:textColor="@color/bKash"
                    android:textSize="18sp"
                    android:textStyle="bold" />

            </RelativeLayout>

        </LinearLayout>


    </androidx.cardview.widget.CardView>
```
# Java Code
> This code will sit above the ‌‌`onCreate Bundle`
``` gradle
    CardView CardView;
    ImageView moneyIconLeft,moneyIconRight;
    TextView moneyTextView;
    Animation leftToRightAnim,rightToLeftAnim,fadeOutAnim;
```
> This code will sit inside the `onCreate Bundle`
``` gradle
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
```
> This code will sit outside the `onCreate Bundle`.
``` gradle
    void RBMJLTD(){
        CardView = findViewById(R.id.CardView);
        moneyIconLeft = findViewById(R.id.moneyIconLeft);
        moneyIconRight = findViewById(R.id.moneyIconRight);
        moneyTextView = findViewById(R.id.moneyTextView);

        leftToRightAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_to_right);
        rightToLeftAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_to_left);
        fadeOutAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
    }
```
‌‌


## Contact With Us

If you face any problem using this library then feel free to contact me.
To contact me message me on Facebook or email me at:

`Email`: shohag@rbmjltd.com

`Facebook`: <a href="https://www.facebook.com/M220719" rel="nofollow">Monir Hossain (Shohag)</a> 

`YouTube`: <a href="https://www.youtube.com/@rbmjltd" rel="nofollow">RBMJ Limited</a> 

# Authors
<a href="https://www.facebook.com/M220719" rel="nofollow">Shohag Hossain (Monir)</a>
