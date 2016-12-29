package com.result.androidrx;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button button;
    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction("com.xiazdong");
            intent.putExtra("name", "xiazdong");
            Main2Activity.this.sendOrderedBroadcast(intent, null);   //有序广播发送
            Toast.makeText(getApplicationContext(), "发送广播成功", Toast.LENGTH_SHORT).show();
        }
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button)this.findViewById(R.id.button);
        button.setOnClickListener(listener);
    }
}
