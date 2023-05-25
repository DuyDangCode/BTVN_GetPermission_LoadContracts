package com.example.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListContractsAdapter extends RecyclerView.Adapter<ListContracsHolder> {

    List<PersonModel> l;
    Context context;

    @NonNull
    @Override
    public ListContracsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);

        // Inflate the layout

        View photoView
                = inflater
                .inflate(R.layout.list_contracts,
                        parent, false);

        ListContracsHolder viewHolder
                = new ListContracsHolder(photoView);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListContracsHolder holder, int position) {
        holder.id.setText(l.get(position).id);
        holder.name.setText(l.get(position).name);
        holder.phone.setText(l.get(position).phone);
    }

    public ListContractsAdapter(List<PersonModel> l, Context context) {
        this.l = l;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return l.size();
    }





}
