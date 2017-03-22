package com.example.smaug.lab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActionModeTest extends AppCompatActivity implements ListView.OnItemLongClickListener {
    private List<Item> mItemList = new ArrayList<>();
    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_modetest);
        startSupportActionMode(mCallback);
        initItem();
        ActionmodeItemAdapter actionModeItemAdapter = new ActionmodeItemAdapter(ActionModeTest
                .this, R.layout.actionmode_item, mItemList);
        ListView listView = (ListView) findViewById(R.id.list_actionmode);
        listView.setAdapter(actionModeItemAdapter);
        listView.setOnItemLongClickListener(this);

    }

    private ActionMode.Callback mCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, android.view.Menu menu) {
            mode.setTitle(cnt + " selected");
            getMenuInflater().inflate(R.menu.actionmode, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, android.view.Menu menu) {
            mode.setTitle(cnt + " selected");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            mode.setTitle(cnt + " selected");
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
        }
    };

    private void initItem() {
        Item one = new Item("one", R.mipmap.ic_launcher);
        Item two = new Item("two", R.mipmap.ic_launcher);
        Item three = new Item("three", R.mipmap.ic_launcher);
        Item four = new Item("four", R.mipmap.ic_launcher);
        Item five = new Item("five", R.mipmap.ic_launcher);
        Item six = new Item("six", R.mipmap.ic_launcher);
        Item seven = new Item("seven", R.mipmap.ic_launcher);
        mItemList.add(one);
        mItemList.add(two);
        mItemList.add(three);
        mItemList.add(four);
        mItemList.add(five);
        mItemList.add(six);
        mItemList.add(seven);

    }


    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        view.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        cnt++;
        return false;
    }
}
