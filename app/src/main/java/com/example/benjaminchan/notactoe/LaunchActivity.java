package com.example.benjaminchan.notactoe;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.app.Activity;
import android.content.Intent;


public class LaunchActivity extends Activity implements OnClickListener, SensorEventListener {

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

    @Override
    public final void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Do something here if sensor accuracy changes.
    }

    @Override
    public final void onSensorChanged(SensorEvent event) {
        float luxValue = event.values[0];
        if (luxValue < 40) {
            rl.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeBackground));
        } else {
            rl.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.darkThemeText));
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
