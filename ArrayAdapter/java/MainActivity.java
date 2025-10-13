package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listview.R;
import com.example.listview.pink;
import com.example.listview.pinkflower;
import com.example.listview.rose;
import com.example.listview.tulips;

public class MainActivity extends AppCompatActivity {
    String flowerlist []={"pink","rose","tulips","pinkflower"};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.activity_main2,R.id.txt1,flowerlist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Log.i("ListView","Item is clicked @position" +position);
                if(position==0)
                {
                    startActivity(new Intent(MainActivity.this, pink.class));

                }
                else if(position==1)
                {
                    startActivity(new Intent(MainActivity.this, tulips.class));

                }
                else if(position==2)
                {
                    startActivity(new Intent(MainActivity.this,rose.class));

                }
                else if(position==3)
                {
                    startActivity(new Intent(MainActivity.this, pinkflower.class));

                }

            }
        });
    }
}
