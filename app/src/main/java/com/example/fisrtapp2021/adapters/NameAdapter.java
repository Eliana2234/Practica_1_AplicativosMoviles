package com.example.fisrtapp2021.adapters;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fisrtapp2021.MapActivity;
import com.example.fisrtapp2021.R;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder> {

    public List<String> data;

    public NameAdapter(List<String> data) {
        this.data = data;
    }


    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_name, parent, false);

        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {//Para iteractuar
        TextView tv = holder.itemView.findViewById(R.id.tvName);
        String value = data.get(position);
        tv.setText(value);

        Button btnClick = holder.itemView.findViewById(R.id.btnLlamar);
        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(holder.itemView.getContext(),value,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", value, null));
                intent.putExtra("value",value);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {//Cuantos elementos tiene tu adaptador
        return data.size();
    }

    class NameViewHolder extends RecyclerView.ViewHolder {
        public NameViewHolder(View itemView){
            super(itemView);
        }
    }
}
