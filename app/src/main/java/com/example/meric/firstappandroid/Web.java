package com.example.meric.firstappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv=(WebView) findViewById(R.id.webwiev);
        wv.loadUrl(getIntent().getExtras().getString("adres"));


    }
}
