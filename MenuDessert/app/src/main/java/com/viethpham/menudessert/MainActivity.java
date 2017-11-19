package com.viethpham.menudessert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.viethpham.menudessert.model.DataItem;
import com.viethpham.menudessert.sample.SampleDataProvider;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private List<DataItem> dataItemList = SampleDataProvider.dataItemList; // Get all datas available for this MainActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DataItem item = new DataItem(null, "My menu item", "a category",
//                "a description", 1, 9.95, "apple_pie.jpg");

        tvOut = findViewById(R.id.out);
        tvOut.setText("");

        // sort the dataItemList based on the item name
        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });

        // display all item name on the app
        for (DataItem item : dataItemList)
        {
            tvOut.append(item.getItemName() + "\n");
        }
    }
}
