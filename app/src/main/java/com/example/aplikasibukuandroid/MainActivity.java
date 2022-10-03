package com.example.aplikasibukuandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_beli,btn_lihat;
    TextView txt_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_desc = findViewById(R.id.txt_desc);
        txt_desc.setMovementMethod(new ScrollingMovementMethod());
    }
    public void sampledisplay(View view){
        Intent it = new Intent(this, sample.class);
        startActivity(it);
    }
    public void belibuku(View view){
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.amazon.com/Android-Programming-Beginners-depth-full-featured/dp/1789538505";
        it.setData(Uri.parse(url));
        startActivity(it);
    }
}