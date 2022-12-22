package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private TextView tv2;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        tv2 = findViewById(R.id.textView2);
        et = findViewById(R.id.editTextPersonName);

        //b.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View view) {

        //  Toast.makeText(MainActivity.this, "converting to miles", Toast.LENGTH_SHORT).show();
        //String text = et.getText().toString();
        //double km = Double.parseDouble(text);
        //double miles = 0.621371 * km;
        //tv2.setText(miles + " miles");

        //}
        //});
    }
        public void calculate(View v){
            Toast.makeText(MainActivity.this, "converting to miles", Toast.LENGTH_SHORT).show();

            String text = et.getText().toString();
            double km = Double.parseDouble(text);
            double miles = 0.621371 * km;
            tv2.setText(miles + " miles");
        }

}