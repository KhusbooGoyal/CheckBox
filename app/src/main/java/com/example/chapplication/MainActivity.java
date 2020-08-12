package com.example.chapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox mom;
    private CheckBox dad;
    private CheckBox grandpa;
    private Button btn;
    private TextView showtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mom = (CheckBox) findViewById(R.id.momID);
        dad = (CheckBox) findViewById(R.id.dadID);
        grandpa = (CheckBox) findViewById(R.id.grandpaID);

        showtext = (TextView) findViewById(R.id.resultID);
        btn = (Button) findViewById(R.id.ShowButtonID);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(mom.getText().toString() + " status is: " +
                        mom.isChecked() + "\n");
                stringBuilder.append(dad.getText().toString() + " status is: " +
                        dad.isChecked() + "\n");
                stringBuilder.append(grandpa.getText().toString() + " status is: " +
                        grandpa.isChecked() + "\n");

                showtext.setText(stringBuilder);
            }
        });
    }
}