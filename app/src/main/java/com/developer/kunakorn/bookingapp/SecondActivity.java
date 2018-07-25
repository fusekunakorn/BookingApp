package com.developer.kunakorn.bookingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        LinearLayout li_sec = (LinearLayout)findViewById(R.id.li_sec);
        li_sec.setBackgroundColor(this.getResources().getColor(R.color.colorAccent));

        Intent intent = getIntent();
        String res = intent.getStringExtra("StringResult");
        TextView txt_sec_result = (TextView)findViewById(R.id.txt_sec_result);
        txt_sec_result.setText(res.toString());
    }
}
