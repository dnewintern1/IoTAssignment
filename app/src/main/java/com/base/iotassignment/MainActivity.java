package com.base.iotassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.textView1);
        TextView PriceTextView = findViewById(R.id.PriceTextView);

        float rupee = 299 ;
        float Price = 0;
        String x = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(rupee);
        String y = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(Price);




        textView1.setText(String.format("%.6s", x));
        PriceTextView.setText(String.format("%.2s", y));

    }
}