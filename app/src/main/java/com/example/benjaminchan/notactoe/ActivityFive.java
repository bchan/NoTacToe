package com.example.benjaminchan.notactoe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.Activity;
import android.view.View.OnClickListener;

public class ActivityFive extends Activity implements OnClickListener, SensorEventListener {

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
    private ImageButton button10;
    private ImageButton button11;
    private ImageButton button12;
    private ImageButton button13;
    private ImageButton button14;
    private ImageButton button15;
    private ImageButton button16;
    private ImageButton button17;
    private ImageButton button18;
    private ImageButton button19;
    private ImageButton button20;
    private ImageButton button21;
    private ImageButton button22;
    private ImageButton button23;
    private ImageButton button24;
    private ImageButton button25;
    private Button resetbutton;
    private Button homebutton;
    private View line1;
    private View line2;
    private View line3;
    private View line4;
    private View line5;
    private View line6;
    private View line7;
    private View line8;

    // Board
    Board b = new Board(5);

    private SensorManager mSensorManager;
    private Sensor mLight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        button1 = (ImageButton) findViewById(R.id.button1);
        button2 = (ImageButton) findViewById(R.id.button2);
        button3 = (ImageButton) findViewById(R.id.button3);
        button4 = (ImageButton) findViewById(R.id.button4);
        button5 = (ImageButton) findViewById(R.id.button5);
        button6 = (ImageButton) findViewById(R.id.button6);
        button7 = (ImageButton) findViewById(R.id.button7);
        button8 = (ImageButton) findViewById(R.id.button8);
        button9 = (ImageButton) findViewById(R.id.button9);
        button10 = (ImageButton) findViewById(R.id.button10);
        button11 = (ImageButton) findViewById(R.id.button11);
        button12 = (ImageButton) findViewById(R.id.button12);
        button13 = (ImageButton) findViewById(R.id.button13);
        button14 = (ImageButton) findViewById(R.id.button14);
        button15 = (ImageButton) findViewById(R.id.button15);
        button16 = (ImageButton) findViewById(R.id.button16);
        button17 = (ImageButton) findViewById(R.id.button17);
        button18 = (ImageButton) findViewById(R.id.button18);
        button19 = (ImageButton) findViewById(R.id.button19);
        button20 = (ImageButton) findViewById(R.id.button20);
        button21 = (ImageButton) findViewById(R.id.button21);
        button22 = (ImageButton) findViewById(R.id.button22);
        button23 = (ImageButton) findViewById(R.id.button23);
        button24 = (ImageButton) findViewById(R.id.button24);
        button25 = (ImageButton) findViewById(R.id.button25);
        resetbutton = (Button) findViewById(R.id.resetbutton);
        homebutton = (Button) findViewById(R.id.homebutton);
        line1 = (View) findViewById(R.id.line1);
        line2 = (View) findViewById(R.id.line2);
        line3 = (View) findViewById(R.id.line3);
        line4 = (View) findViewById(R.id.line4);
        line5 = (View) findViewById(R.id.line5);
        line6 = (View) findViewById(R.id.line6);
        line7 = (View) findViewById(R.id.line7);
        line8 = (View) findViewById(R.id.line8);

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
        button10.setBackgroundColor(Color.TRANSPARENT);
        button11.setBackgroundColor(Color.TRANSPARENT);
        button12.setBackgroundColor(Color.TRANSPARENT);
        button13.setBackgroundColor(Color.TRANSPARENT);
        button14.setBackgroundColor(Color.TRANSPARENT);
        button15.setBackgroundColor(Color.TRANSPARENT);
        button16.setBackgroundColor(Color.TRANSPARENT);
        button17.setBackgroundColor(Color.TRANSPARENT);
        button18.setBackgroundColor(Color.TRANSPARENT);
        button19.setBackgroundColor(Color.TRANSPARENT);
        button20.setBackgroundColor(Color.TRANSPARENT);
        button21.setBackgroundColor(Color.TRANSPARENT);
        button22.setBackgroundColor(Color.TRANSPARENT);
        button23.setBackgroundColor(Color.TRANSPARENT);
        button24.setBackgroundColor(Color.TRANSPARENT);
        button25.setBackgroundColor(Color.TRANSPARENT);


        button1.setImageResource(android.R.color.transparent);
        button2.setImageResource(android.R.color.transparent);
        button3.setImageResource(android.R.color.transparent);
        button4.setImageResource(android.R.color.transparent);
        button5.setImageResource(android.R.color.transparent);
        button6.setImageResource(android.R.color.transparent);
        button7.setImageResource(android.R.color.transparent);
        button8.setImageResource(android.R.color.transparent);
        button9.setImageResource(android.R.color.transparent);
        button10.setImageResource(android.R.color.transparent);
        button11.setImageResource(android.R.color.transparent);
        button12.setImageResource(android.R.color.transparent);
        button13.setImageResource(android.R.color.transparent);
        button14.setImageResource(android.R.color.transparent);
        button15.setImageResource(android.R.color.transparent);
        button16.setImageResource(android.R.color.transparent);
        button17.setImageResource(android.R.color.transparent);
        button18.setImageResource(android.R.color.transparent);
        button19.setImageResource(android.R.color.transparent);
        button20.setImageResource(android.R.color.transparent);
        button21.setImageResource(android.R.color.transparent);
        button22.setImageResource(android.R.color.transparent);
        button23.setImageResource(android.R.color.transparent);
        button24.setImageResource(android.R.color.transparent);
        button25.setImageResource(android.R.color.transparent);


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
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        resetbutton.setOnClickListener(this);
        homebutton.setOnClickListener(this);

        mTextMessage = (TextView) findViewById(R.id.message);
        mTextMessage.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.blueText));

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mLight = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
    }

    private void resetBoard() {
        b.reset(5);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button14.setEnabled(true);
        button15.setEnabled(true);
        button16.setEnabled(true);
        button17.setEnabled(true);
        button18.setEnabled(true);
        button19.setEnabled(true);
        button20.setEnabled(true);
        button21.setEnabled(true);
        button22.setEnabled(true);
        button23.setEnabled(true);
        button24.setEnabled(true);
        button25.setEnabled(true);

        button1.setImageResource(android.R.color.transparent);
        button2.setImageResource(android.R.color.transparent);
        button3.setImageResource(android.R.color.transparent);
        button4.setImageResource(android.R.color.transparent);
        button5.setImageResource(android.R.color.transparent);
        button6.setImageResource(android.R.color.transparent);
        button7.setImageResource(android.R.color.transparent);
        button8.setImageResource(android.R.color.transparent);
        button9.setImageResource(android.R.color.transparent);
        button10.setImageResource(android.R.color.transparent);
        button11.setImageResource(android.R.color.transparent);
        button12.setImageResource(android.R.color.transparent);
        button13.setImageResource(android.R.color.transparent);
        button14.setImageResource(android.R.color.transparent);
        button15.setImageResource(android.R.color.transparent);
        button16.setImageResource(android.R.color.transparent);
        button17.setImageResource(android.R.color.transparent);
        button18.setImageResource(android.R.color.transparent);
        button19.setImageResource(android.R.color.transparent);
        button20.setImageResource(android.R.color.transparent);
        button21.setImageResource(android.R.color.transparent);
        button22.setImageResource(android.R.color.transparent);
        button23.setImageResource(android.R.color.transparent);
        button24.setImageResource(android.R.color.transparent);
        button25.setImageResource(android.R.color.transparent);

        mTextMessage.setText("Player 1's Turn");
        mTextMessage.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.blueText));

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.button1:
                b.addX(1, 1);
                button1.setImageResource(R.drawable.ximagefive);
                button1.setEnabled(false);
                break;
            case R.id.button2:
                b.addX(1, 2);
                button2.setImageResource(R.drawable.ximagefive);
                button2.setEnabled(false);
                break;
            case R.id.button3:
                b.addX(1, 3);
                button3.setImageResource(R.drawable.ximagefive);
                button3.setEnabled(false);
                break;
            case R.id.button4:
                b.addX(1, 4);
                button4.setImageResource(R.drawable.ximagefive);
                button4.setEnabled(false);
                break;
            case R.id.button5:
                b.addX(1, 5);
                button5.setImageResource(R.drawable.ximagefive);
                button5.setEnabled(false);
                break;
            case R.id.button6:
                b.addX(2, 1);
                button6.setImageResource(R.drawable.ximagefive);
                button6.setEnabled(false);
                break;
            case R.id.button7:
                b.addX(2, 2);
                button7.setImageResource(R.drawable.ximagefive);
                button7.setEnabled(false);
                break;
            case R.id.button8:
                b.addX(2, 3);
                button8.setImageResource(R.drawable.ximagefive);
                button8.setEnabled(false);
                break;
            case R.id.button9:
                b.addX(2, 4);
                button9.setImageResource(R.drawable.ximagefive);
                button9.setEnabled(false);
                break;
            case R.id.button10:
                b.addX(2, 5);
                button10.setImageResource(R.drawable.ximagefive);
                button10.setEnabled(false);
                break;
            case R.id.button11:
                b.addX(3, 1);
                button11.setImageResource(R.drawable.ximagefive);
                button11.setEnabled(false);
                break;
            case R.id.button12:
                b.addX(3, 2);
                button12.setImageResource(R.drawable.ximagefive);
                button12.setEnabled(false);
                break;
            case R.id.button13:
                b.addX(3, 3);
                button13.setImageResource(R.drawable.ximagefive);
                button13.setEnabled(false);
                break;
            case R.id.button14:
                b.addX(3, 4);
                button14.setImageResource(R.drawable.ximagefive);
                button14.setEnabled(false);
                break;
            case R.id.button15:
                b.addX(3, 5);
                button15.setImageResource(R.drawable.ximagefive);
                button15.setEnabled(false);
                break;
            case R.id.button16:
                b.addX(4, 1);
                button16.setImageResource(R.drawable.ximagefive);
                button16.setEnabled(false);
                break;
            case R.id.button17:
                b.addX(4, 2);
                button17.setImageResource(R.drawable.ximagefive);
                button17.setEnabled(false);
                break;
            case R.id.button18:
                b.addX(4, 3);
                button18.setImageResource(R.drawable.ximagefive);
                button18.setEnabled(false);
                break;
            case R.id.button19:
                b.addX(4, 4);
                button19.setImageResource(R.drawable.ximagefive);
                button19.setEnabled(false);
                break;
            case R.id.button20:
                b.addX(4, 5);
                button20.setImageResource(R.drawable.ximagefive);
                button20.setEnabled(false);
                break;
            case R.id.button21:
                b.addX(5, 1);
                button21.setImageResource(R.drawable.ximagefive);
                button21.setEnabled(false);
                break;
            case R.id.button22:
                b.addX(5, 2);
                button22.setImageResource(R.drawable.ximagefive);
                button22.setEnabled(false);
                break;
            case R.id.button23:
                b.addX(5, 3);
                button23.setImageResource(R.drawable.ximagefive);
                button23.setEnabled(false);
                break;
            case R.id.button24:
                b.addX(5, 4);
                button24.setImageResource(R.drawable.ximagefive);
                button24.setEnabled(false);
                break;
            case R.id.button25:
                b.addX(5, 5);
                button25.setImageResource(R.drawable.ximagefive);
                button25.setEnabled(false);
                break;

            case R.id.resetbutton:
                resetBoard();
                return;
            case R.id.homebutton:
                Intent home = new Intent(this, LaunchActivity.class);
                startActivity(home);
                return;
        }

        b.changeTurn();
        if (b.checkTurns()) {
            mTextMessage.setText("Player 1's Turn");
            mTextMessage.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.blueText));
        } else {
            mTextMessage.setText("Player 2's Turn");
            mTextMessage.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.greenText));
        }

        if(b.checkFive())
        {
            if(b.checkTurns())
            {
                mTextMessage.setText("Player 1 wins!");
            }
            else
            {
                mTextMessage.setText("Player 2 wins!");
            }
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
            button17.setEnabled(false);
            button18.setEnabled(false);
            button19.setEnabled(false);
            button20.setEnabled(false);
            button21.setEnabled(false);
            button22.setEnabled(false);
            button23.setEnabled(false);
            button24.setEnabled(false);
            button25.setEnabled(false);
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
        if (luxValue < 40) {
            rl.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeBackground));
            line1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
            line2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
            line3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
            line4.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
            line5.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
            line6.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
            line7.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
            line8.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
        } else {
            rl.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
            line1.setBackgroundColor(Color.BLACK);
            line2.setBackgroundColor(Color.BLACK);
            line3.setBackgroundColor(Color.BLACK);
            line4.setBackgroundColor(Color.BLACK);
            line5.setBackgroundColor(Color.BLACK);
            line6.setBackgroundColor(Color.BLACK);
            line7.setBackgroundColor(Color.BLACK);
            line8.setBackgroundColor(Color.BLACK);
        }
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
