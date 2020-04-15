package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;




public class MainActivity extends ListActivity {
    ListView listView;
    String[] items = { "Data-1", "Data-2", "Data-3", "Data-4", "Data-5",    "Data-6", "Data-7",
            "Data-8", "Data-9", "Data-10", "Data-11",    "Data-12", "Data-13", "Data-14", "Data-15" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //listView = findViewById(R.id.);
        CustomAdapter adapter = new CustomAdapter (this, R.layout.layout_item, items);
        setListAdapter(adapter);
    }
}

class CustomAdapter extends ArrayAdapter <String> {
    Context context;
    String[] items;
    public CustomAdapter(Context context, int layoutToBeInflated, String[] items) {
        super(context, R.layout.layout_item, items);
        this.context = context;
        this.items = items;
    }

   @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.layout_item, null);

       TextView full_name = (TextView) row.findViewById(R.id.text_fullname);

       full_name.setText(items[position]);

        return (row);
    }

}