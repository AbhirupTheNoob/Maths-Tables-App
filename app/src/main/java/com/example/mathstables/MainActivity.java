package com.example.mathstables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextNumber;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editTextNumber=findViewById(R.id.editTextNumber);
        textView2=findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String s=editTextNumber.getText().toString();
            int input=Integer.parseInt(s);
            String result="";
            for(int i=1;i<=20;i++)
            {
                result+=input+" "+"X"+" "+i+" "+"="+" "+(input*i)+"\n";
                textView2.setText(result);
            }

            }
        });

    }
}