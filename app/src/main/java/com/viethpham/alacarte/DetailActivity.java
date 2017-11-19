package com.viethpham.alacarte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.viethpham.alacarte.model.DataItem;
import com.viethpham.alacarte.sample.SampleDataProvider;

public class DetailActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DataItem item = getIntent().getParcelableExtra(DataItemAdapter.ITEM_KEY);
        if (item != null)
        {
            Toast.makeText(this, "Received item " + item.getItemName(), Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Did not receive any data", Toast.LENGTH_SHORT).show();
        }
    }
}
