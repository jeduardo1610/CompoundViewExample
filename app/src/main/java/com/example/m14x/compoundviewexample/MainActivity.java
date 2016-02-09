package com.example.m14x.compoundviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    DatePicker mDatePicker;
    int year, month,day;

    Button mInitial;
    Button mFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        CalendarCustom cc = (CalendarCustom) this.findViewById(R.id.calendar_custom);
        mInitial = (Button) findViewById(R.id.BtnIDate);
        mFinal = (Button) findViewById(R.id.BtnFDate);



    }



}
