package com.viethpham.alacarte;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.viethpham.alacarte.model.DataItem;

import java.util.List;

public class DataItemAdapter extends ArrayAdapter<DataItem>
{
    List<DataItem> dataItemList;
    LayoutInflater layoutInflater;

    public DataItemAdapter(Context context, List<DataItem> objects)
    {
        super(context, R.layout.list_item, objects);

        dataItemList = objects;
        layoutInflater = LayoutInflater.from(context);
    }

    /**
     * Each time the arrayAdapter encounters a new data item and want to display the data, it looks for getView method
     * @param position: is the position of the current data item in the data set - dataItemList
     * @param convertView: a reference to a layout, might or might not be null depends on
     *                   the adapter is recycling a view for a list row(not null) or first time running(null).
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item, parent, false);
        }

        TextView tvName = convertView.findViewById(R.id.itemNameText);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        DataItem item = dataItemList.get(position);

        tvName.setText(item.getItemName());
        imageView.setImageResource(R.drawable.apple_pie);

        return convertView;
    }
}
