package com.example.jda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int versionCode = BuildConfig.VERSION_CODE;
        String versionName = BuildConfig.VERSION_NAME;

        Log.i("VCODE", "onCreate: Vesrsion Code = "+versionCode);
        Log.i("VNAME", "onCreate: Version Name = "+versionName);

        t1=(TextView)findViewById(R.id.txt1);
        t2=(TextView)findViewById(R.id.txt2);

        t1.setText(versionName);
        t2.setText(versionCode);


    }
}
