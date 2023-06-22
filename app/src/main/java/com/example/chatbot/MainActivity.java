package com.example.chatbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    TextView tv;
    EditText et;
    ImageButton ib;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv= findViewById(R.id.recycleView);
        tv= findViewById(R.id.Welcom_text);
        et= findViewById(R.id.message_Edit_text);
        ib= findViewById(R.id.sendbutton);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = et.getText().toString().trim();
                Toast.makeText(MainActivity.this, "question", Toast.LENGTH_LONG).show();
            }
        });

    }
}