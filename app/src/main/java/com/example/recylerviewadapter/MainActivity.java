package com.example.recylerviewadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerap;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExamplesItems> arrayList=new ArrayList<>();
        arrayList.add(new ExamplesItems(R.drawable.one,"Prakash"));
        arrayList.add(new ExamplesItems(R.drawable.two,"Prakash"));
        arrayList.add(new ExamplesItems(R.drawable.three,"dsnash"));
        arrayList.add(new ExamplesItems(R.drawable.four,"Padsfash"));
        arrayList.add(new ExamplesItems(R.drawable.five,"asdfsh"));
        arrayList.add(new ExamplesItems(R.drawable.six,"aggfsh"));
        arrayList.add(new ExamplesItems(R.drawable.seven,"fdgdakash"));
        arrayList.add(new ExamplesItems(R.drawable.eight,"Anuj"));
        arrayList.add(new ExamplesItems(R.drawable.nine,"Ujjaeal"));
        arrayList.add(new ExamplesItems(R.drawable.ten,"Antriksh"));
        arrayList.add(new ExamplesItems(R.drawable.eleven,"Sarve"));


        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerap=new AdapterRe(arrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerap);

    }


}
