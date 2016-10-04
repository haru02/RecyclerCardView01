package com.kimhyojung.android.chap12_customview_recyclercardview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardDatas datas = new CardDatas();
        ArrayList<CardDatas> arr = new ArrayList<CardDatas>();
        for(int i=1;i<=100;i++){
            datas.name="파이리";
            datas.str="Poketmon";
            datas.image1=R.mipmap.fire;
            datas.image2=R.mipmap.pikachu;
            arr.add(datas);
        }
        MyRecycleCardAdapter adapter = new MyRecycleCardAdapter(arr, R.layout.activity_cardview, this);
        RecyclerView rv = (RecyclerView)findViewById(R.id.recyclerCardView);
        rv.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        rv.setLayoutManager(manager);
    }
}
