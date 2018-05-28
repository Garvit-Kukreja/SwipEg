package com.example.android.swipeg;


import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



class CenterAdapter extends RecyclerView.Adapter<CenterAdapter.CenterViewHolder> {
    private String []data;
    public CenterAdapter(String[] data)
    {
        this.data=data;
    }
    @Override
    public CenterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
        return new CenterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CenterViewHolder holder, int position) {
        String title=data[position];
        holder.textView.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }



    public class CenterViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public CenterViewHolder(View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.TxtId);
        }
    }

}



