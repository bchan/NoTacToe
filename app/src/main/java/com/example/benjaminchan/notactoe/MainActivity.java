package com.example.benjaminchan.notactoe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private TextView mTextMessage;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    // Board
    Board b = new Board();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
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

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                b.addX(1,1);
                mTextMessage.setText(b.toString());
                break;
            case R.id.button2:
                b.addX(1,2);
                mTextMessage.setText(b.toString());
                break;
            case R.id.button3:
                b.addX(1,3);
                mTextMessage.setText(b.toString());
                break;
            case R.id.button4:
                b.addX(2,1);
                mTextMessage.setText(b.toString());
                break;
            case R.id.button5:
                b.addX(2,2);
                mTextMessage.setText(b.toString());
                break;
            case R.id.button6:
                b.addX(2,3);
                mTextMessage.setText(b.toString());
                break;
            case R.id.button7:
                b.addX(3,1);
                mTextMessage.setText(b.toString());
                break;
            case R.id.button8:
                b.addX(3,2);
                mTextMessage.setText(b.toString());
                break;
            case R.id.button9:
                b.addX(3,3);
                mTextMessage.setText(b.toString());
                break;

        }

    }

}
