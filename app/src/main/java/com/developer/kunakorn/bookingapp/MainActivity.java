package com.developer.kunakorn.bookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    Button btn_test, btn_string;

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
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

        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        init();


    }

    private void init() {
        btn_test = (Button) findViewById(R.id.btn_test);
        btn_string = (Button) findViewById(R.id.btn_string);
        btn_string.setOnClickListener(onClicked);
        btn_test.setOnClickListener(onClicked);
    }

    public View.OnClickListener onClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_test:
                    btn_test.setBackgroundColor(btn_test.getContext().getResources().getColor(R.color.colorPrimaryDark));
                    calculate(1, 2);
                    break;
                case R.id.btn_string:
                    btn_test.setBackgroundColor(btn_string.getContext().getResources().getColor(R.color.colorAccent));

                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("StringResult",testString("Delta"));
                    startActivity(intent);
                    break;
            }

        }
    };

    public static int calculate(int a, int b) {
        return a + b;
    }

    public String testString(String x) {
        String y = "Alpha";
        return x + y;
    }


}
