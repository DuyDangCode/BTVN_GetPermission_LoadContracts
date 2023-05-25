package com.example.contacts;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListContracsHolder extends RecyclerView.ViewHolder {
    TextView id;
    TextView name;
    TextView phone;
    public ListContracsHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.id);
        name = itemView.findViewById(R.id.name);
        phone = itemView.findViewById(R.id.phone);
    }
}
