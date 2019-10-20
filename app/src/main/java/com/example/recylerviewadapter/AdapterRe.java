package com.example.recylerviewadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRe extends RecyclerView.Adapter<AdapterRe.Adapter> {

    private ArrayList<ExamplesItems>mexample;
    public static class Adapter extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;
        public Adapter(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageid);
            textView=itemView.findViewById(R.id.textid);
        }
    }

    public AdapterRe(ArrayList<ExamplesItems>examplesItems){
        mexample=examplesItems;
    }

    @NonNull
    @Override
    public Adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.exapmle_item,parent,false);
        Adapter adapter=new Adapter(view);
        return  adapter;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter holder, int position) {
        ExamplesItems current=mexample.get(position);
        holder.imageView.setImageResource(current.getImageno());
        holder.textView.setText(current.getText());
    }

    @Override
    public int getItemCount() {
        return mexample.size();
    }


}
