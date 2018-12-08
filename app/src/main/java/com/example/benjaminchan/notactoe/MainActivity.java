package com.example.benjaminchan.notactoe;

import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.view.View;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.content.Context;


public class MainActivity extends AppCompatActivity implements OnClickListener, SensorEventListener {

    private TextView mTextMessage;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;
    private ImageButton button7;
    private ImageButton button8;
    private ImageButton button9;
    private Button resetbutton;

    // Board
    Board b = new Board();

    private SensorManager mSensorManager;
    private Sensor mLight;

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {

//        @Override
//
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
//                    return true;
//                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
//                    return true;
//                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
//                    return true;
//            }
//            return false;
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (ImageButton) findViewById(R.id.button1);
        button2 = (ImageButton) findViewById(R.id.button2);
        button3 = (ImageButton) findViewById(R.id.button3);
        button4 = (ImageButton) findViewById(R.id.button4);
        button5 = (ImageButton) findViewById(R.id.button5);
        button6 = (ImageButton) findViewById(R.id.button6);
        button7 = (ImageButton) findViewById(R.id.button7);
        button8 = (ImageButton) findViewById(R.id.button8);
        button9 = (ImageButton) findViewById(R.id.button9);
        resetbutton = (Button) findViewById(R.id.resetbutton);
        //visibility
        button1.setBackgroundColor(Color.TRANSPARENT);
        button2.setBackgroundColor(Color.TRANSPARENT);
        button3.setBackgroundColor(Color.TRANSPARENT);
        button4.setBackgroundColor(Color.TRANSPARENT);
        button5.setBackgroundColor(Color.TRANSPARENT);
        button6.setBackgroundColor(Color.TRANSPARENT);
        button7.setBackgroundColor(Color.TRANSPARENT);
        button8.setBackgroundColor(Color.TRANSPARENT);
        button9.setBackgroundColor(Color.TRANSPARENT);

        button1.setImageResource(android.R.color.transparent);
        button2.setImageResource(android.R.color.transparent);
        button3.setImageResource(android.R.color.transparent);
        button4.setImageResource(android.R.color.transparent);
        button5.setImageResource(android.R.color.transparent);
        button6.setImageResource(android.R.color.transparent);
        button7.setImageResource(android.R.color.transparent);
        button8.setImageResource(android.R.color.transparent);
        button9.setImageResource(android.R.color.transparent);


        //listeners:
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        resetbutton.setOnClickListener(this);

//        button1.setText(" ");
//        button2.setText(" ");
//        button3.setText(" ");
//        button4.setText(" ");
//        button5.setText(" ");
//        button6.setText(" ");
//        button7.setText(" ");
//        button8.setText(" ");
//        button9.setText(" ");

        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mLight = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
    }

    private void resetBoard() {
        b.reset(3);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);

        button1.setImageResource(android.R.color.transparent);
        button2.setImageResource(android.R.color.transparent);
        button3.setImageResource(android.R.color.transparent);
        button4.setImageResource(android.R.color.transparent);
        button5.setImageResource(android.R.color.transparent);
        button6.setImageResource(android.R.color.transparent);
        button7.setImageResource(android.R.color.transparent);
        button8.setImageResource(android.R.color.transparent);
        button9.setImageResource(android.R.color.transparent);

        mTextMessage.setText("Player 1's Turn");

    }

    @Override
    public void onClick(View v) {

        if (b.checkTurns()) {
            mTextMessage.setText("Player 1's Turn");
        } else {
            mTextMessage.setText("Player 2's Turn");
        }

        switch (v.getId()) {
            case R.id.button1:
                b.addX(1, 1);
                //button1.setText("X");
                button1.setImageResource(R.drawable.ximage);
                break;
            case R.id.button2:
                b.addX(1, 2);
                //button2.setText("X");
                button2.setImageResource(R.drawable.ximage);
                break;
            case R.id.button3:
                b.addX(1, 3);
                //button3.setText("X");
                button3.setImageResource(R.drawable.ximage);
                break;
            case R.id.button4:
                b.addX(2, 1);
                //button4.setText("X");
                button4.setImageResource(R.drawable.ximage);
                break;
            case R.id.button5:
                b.addX(2, 2);
                //button5.setText("X");
                button5.setImageResource(R.drawable.ximage);
                break;
            case R.id.button6:
                b.addX(2, 3);
                //button6.setText("X");
                button6.setImageResource(R.drawable.ximage);
                break;
            case R.id.button7:
                b.addX(3, 1);
                //button7.setText("X");
                button7.setImageResource(R.drawable.ximage);
                break;
            case R.id.button8:
                b.addX(3, 2);
                //button8.setText("X");
                button8.setImageResource(R.drawable.ximage);
                break;
            case R.id.button9:
                b.addX(3, 3);
                //button9.setText("X");
                button9.setImageResource(R.drawable.ximage);
                break;
            case R.id.resetbutton:
                resetBoard();
                break;
        }


        if(b.checkThree())
        {
            mTextMessage.setText("You lose!");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
//            if (v.getId() == R.id.button5) {
//                mTextMessage.setText("Player 1's Turn");
//                button1.setText(" ");
//                button2.setText(" ");
//                button3.setText(" ");
//                button4.setText(" ");
//                button5.setText(" ");
//                button6.setText(" ");
//                button7.setText(" ");
//                button8.setText(" ");
//                button9.setText(" ");
//
//                b.reset(3);
//            }
        }


    }



    // From https://developer.android.com/guide/topics/sensors/sensors_environment#java
    @Override
    public final void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Do something here if sensor accuracy changes.
    }

    @Override
    public final void onSensorChanged(SensorEvent event) {
        float luxValue = event.values[0];
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.frame);
        if (luxValue > 100) {

            //rl.setBackgroundColor(Color.GRAY);
            rl.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeBackground));
        } else {
            rl.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
        }

        //if (luxValue > 100000) {
        //mTextMessage.setText(Float.toString(luxValue));
    }

    @Override
    protected void onResume() {
        // Register a listener for the sensor.
        super.onResume();
        mSensorManager.registerListener(this, mLight, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        // Be sure to unregister the sensor when the activity pauses.
        super.onPause();
        mSensorManager.unregisterListener(this);
    }

}
