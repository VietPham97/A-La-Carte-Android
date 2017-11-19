package com.viethpham.menudessert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.viethpham.menudessert.model.DataItem;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataItem item = new DataItem(null, "My menu item", "a category",
                "a description", 1, 9.95, "apple_pie.jpg");

        tvOut = findViewById(R.id.out);
        tvOut.setText(item.toString());
    }
}
