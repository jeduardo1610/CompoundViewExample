package com.example.m14x.compoundviewexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;

/**
 * Created by m14x on 09/02/2016.
 */
public class CalendarCustom extends RelativeLayout {

    private Button mSetDate1;
    private Button mSetDate2;
    private Button mCalculate;
    private TextView mTxtDateI;
    private TextView mTxtDateF;

    public CalendarCustom(Context context) {
        super(context);
        initializeViews(context);
    }

    public CalendarCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeViews(context);
    }

    private void initializeViews(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.calendar_components, this);


        mSetDate1 = (Button) findViewById(R.id.BtnIDate);
        mSetDate2 = (Button) findViewById(R.id.BtnFDate);
        mTxtDateI = (TextView) findViewById(R.id.TxtDateInitial);
        mTxtDateF = (TextView) findViewById(R.id.TxtDateEnd);

        mSetDate1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setDate(mTxtDateI);
            }
        });

        mSetDate2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setDate(mTxtDateF);
            }
        });

    }

    public void setDate(TextView tx) {
        int year;
        int month;
        int day;


       DatePicker mDatePicker = (DatePicker) findViewById(R.id.datePicker);


        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        // set current date into textview
        tx.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append(month + 1).append("-").append(day).append("-")
                .append(year).append(" "));

        // set current date into datepicker
        mDatePicker.init(year, month, day, null);


    }
}
