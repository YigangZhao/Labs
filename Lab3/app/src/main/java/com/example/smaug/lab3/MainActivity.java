package com.example.smaug.lab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Item> mItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItem();
        ItemAdapter itemAdapter = new ItemAdapter(MainActivity.this, R.layout.item, mItemList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(itemAdapter);
        
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long
                    id) {
                view.setBackgroundResource(R.color.DarkRed);
                Toast.makeText(MainActivity.this, mItemList.get(position).getName(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    private void initItem() {
        Item Tiger = new Item("Tiger", R.drawable.tiger);
        Item Lion = new Item("Lion", R.drawable.lion);
        Item Dog = new Item("Dog", R.drawable.dog);
        Item Cat = new Item("Cat", R.drawable.cat);
        Item Elephant = new Item("Elephant", R.drawable.elephant);
        Item Monkey = new Item("Monkey", R.drawable.monkey);
        mItemList.add(Tiger);
        mItemList.add(Lion);
        mItemList.add(Dog);
        mItemList.add(Cat);
        mItemList.add(Elephant);
        mItemList.add(Monkey);

    }
}
