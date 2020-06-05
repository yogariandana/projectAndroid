package com.example.club;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu> menus;
    private Button btn;

    public MenuAdapter(Context mcontext, ArrayList<Menu> club){
        context= mcontext;
        menus=club;

    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false);

        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menubaru= menus.get(position);
        String gambarbaru = menubaru.getImg();
        String ket = menubaru.getKet();
        String nama = menubaru.getNama();

        holder.tvnamadata.setText(nama);
        holder.tvdesdata.setText(ket);
        Glide
                .with(context)
                .load(gambarbaru)
                .centerCrop()
                .into(holder.imdata);

    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public ImageView imdata;
        public TextView tvdesdata;
        public TextView tvnamadata;
        public TextView tvketerangandata;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imdata= itemView.findViewById(R.id.img_menu);
            tvdesdata= itemView.findViewById(R.id.tv_des);
            tvnamadata= itemView.findViewById(R.id.tv_nama);
            tvketerangandata= itemView.findViewById(R.id.tv_ket);

            btn = itemView.findViewById(R.id.btn_details);
            btn.setOnClickListener( new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent = new Intent(context, DetailsActivity.class);
                    intent.putExtra(DetailsActivity.nama, menus.get(getAdapterPosition()).getNama());
                    intent.putExtra(DetailsActivity.deskripsi, menus.get(getAdapterPosition()).getDes());
                    intent.putExtra(DetailsActivity.keterangan, menus.get(getAdapterPosition()).getKet());
                    intent.putExtra(DetailsActivity.gambar, menus.get(getAdapterPosition()).getImg());
                    context.startActivity(intent);
                }

            });
        }
    }

}
