package com.jsv.android.famazon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] drawerItemList;
    private ListView myDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerItemList = getResources().getStringArray(R.array.items);
        myDrawer = (ListView) findViewById(R.id.my_drawer);
        myDrawer.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_item, drawerItemList));
    }
}
