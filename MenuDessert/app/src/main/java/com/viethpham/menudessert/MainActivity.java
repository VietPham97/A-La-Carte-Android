package com.viethpham.menudessert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.viethpham.menudessert.model.DataItem;
import com.viethpham.menudessert.sample.SampleDataProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataItem> dataItemList = SampleDataProvider.dataItemList; // Get all datas available for this MainActivity
    List<String> itemNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // display all item name on the app
        for (DataItem item : dataItemList)
        {
            itemNames.add(item.getItemName());
        }
        Collections.sort(itemNames);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, itemNames);

        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);
    }
}
