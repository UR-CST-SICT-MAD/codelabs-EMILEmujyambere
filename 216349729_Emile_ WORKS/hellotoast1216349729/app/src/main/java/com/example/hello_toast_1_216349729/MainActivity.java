package com.example.hello_toast_1_216349729;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private int cnt=0;
        private TextView mShowCount;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                mShowCount = (TextView)findViewById(R.id.textView2);
                if(mShowCount!=null){
                        mShowCount.setText(Integer.toString(cnt));
                }
        }

        public void showToast(View view) {
                Toast.makeText(this, "Hello toast!", Toast.LENGTH_LONG).show();
        }

        public void countUp(View view) {
                ++cnt;
                if(mShowCount!=null){
                        mShowCount.setText(Integer.toString(cnt));
                }
        }
}
