package com.example.uh10rpl1maulanazakkypahlevi18;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class datamenuadapter extends RecyclerView.Adapter<datamenuadapter.MahasiswaViewHolder> {
    private ArrayList<datamenu> dataMenu;

    public datamenuadapter(ArrayList<datamenu> dataMenu) {
        this.dataMenu = dataMenu;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_main, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtnamapengajar.setText(dataMenu.get(position).getNamalengkap());
        holder.txtnamapelajaran.setText(dataMenu.get(position).getUmur());
        holder.txtjumlahorang.setText(dataMenu.get(position).getHobi());
        holder.txttanggal.setText(dataMenu.get(position).getWaifu());
    }

    @Override
    public int getItemCount() {
        return (dataMenu != null) ? dataMenu.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtnamapengajar, txtnamapelajaran, txtjumlahorang, txttanggal;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtnamapengajar = (TextView) itemView.findViewById(R.id.txt_nama);
            txtnamapelajaran = (TextView) itemView.findViewById(R.id.txt_umur);
            txtjumlahorang = (TextView) itemView.findViewById(R.id.txt_hobi);
            txttanggal = (TextView) itemView.findViewById(R.id.txt_waifu);
        }
    }
}
