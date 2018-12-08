package com.example.meric.firstappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText txtAdres;
    TextView txtView;
    Button btnYaz;
    Button webAdresGit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAdres= (EditText) findViewById(R.id.txtAdres);
        txtView=(TextView) findViewById(R.id.textView);
        btnYaz=(Button) findViewById(R.id.btnYaz);
        webAdresGit=(Button) findViewById(R.id.btnWebGit);



        btnYaz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String txt=txtAdres.getText().toString();
                txtView.setText(txt);
            }
        });

        webAdresGit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Web.class);
                intent.putExtra("adres",txtAdres.getText().toString());
                startActivity(intent);
            }
        });




    }
}
