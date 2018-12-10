package com.example.benjaminchan.notactoe;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.app.Activity;
import android.content.Intent;


public class LaunchActivity extends Activity implements OnClickListener, SensorEventListener {
    //home screen buttons for 3 by 3 and 5 by 5
    //lightsensor to also change the background color of homescreen
    private Button button1;
    private Button button2;
    private RelativeLayout rl;
    private SensorManager mSensorManager;
    private Sensor mLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launchscreen);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        rl = (RelativeLayout) findViewById(R.id.frame);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mLight = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
    }

    //button1 is for 3 by 3 board, button2 is for 5 by 5 board
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, ActivityFive.class);
                startActivity(intent2);
                break;
        }
    }

    // From https://developer.android.com/guide/topics/sensors/sensors_environment#java
    @Override
    public final void onAccuracyChanged(Sensor sensor, int accuracy) {
        // If sensor accuracy changes, do something.
    }
    
    //changing the background color by detecting the lux value
    @Override
    public final void onSensorChanged(SensorEvent event) {
        float luxValue = event.values[0];
        if (luxValue < 40) {
            rl.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeBackground));
        } else {
            rl.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
        }
    }
    //resuming the light sensor
    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mLight, SensorManager.SENSOR_DELAY_NORMAL);
    }
    //pausing the light sensor
    @Override
    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }
}
