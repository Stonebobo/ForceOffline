package com.littlestone.forceoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends MyActivity {
    private Button btn_forceOnline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_forceOnline=findViewById(R.id.btn_forceOnline);
        btn_forceOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("ForceOnline");
                sendBroadcast(intent);
            }
        });
    }

}