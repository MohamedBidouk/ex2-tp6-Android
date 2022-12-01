package com.example.exercice3updatedrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends
        RecyclerView.Adapter<Adapter.MyViewHolder>
{
    private List<Movie> myList;
    public Adapter(List<Movie> x) {
        this.myList = x;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(v);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView n, g, y;
        public MyViewHolder(View view) {
            super(view);
            n= view.findViewById(R.id.name);
            g= view.findViewById(R.id.genre);
            y= view.findViewById(R.id.year);
        }
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie s= myList.get(position);
        holder.n.setText(s.getName());
        holder.g.setText(s.getGenre());
        holder.y.setText(s.getYear());
    }
    @Override
    public int getItemCount() {
        return myList.size();
    }
}
