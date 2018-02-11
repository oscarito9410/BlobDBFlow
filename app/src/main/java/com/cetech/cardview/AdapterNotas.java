package com.cetech.cardview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by oemy9 on 10/02/2018.
 */

public class AdapterNotas extends RecyclerView.Adapter <AdapterNotas.ViewHolder> {

    private Context mContext;
    private LayoutInflater mInflater;
    private String DATE_FORMAT = "dd/MM/yyyy";
    private SimpleDateFormat mDateFormat = new SimpleDateFormat(DATE_FORMAT);
    private List <NotaTable> listNotas;

    public AdapterNotas (Context mContext, List <NotaTable> listNotas) {
        this.mContext = mContext;
        this.mInflater = LayoutInflater.from(mContext);
        this.listNotas = listNotas;
    }

    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        return new ViewHolder(mInflater.inflate(R.layout.item_nota, parent, false));
    }

    @Override
    public void onBindViewHolder (ViewHolder holder, int position) {
        holder.setData(listNotas.get(position));
    }

    @Override
    public int getItemCount () {
        return listNotas.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivFoto;
        private TextView tvFecha;
        private TextView tvNota;

        public ViewHolder (View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.cardView_image);
            tvNota = itemView.findViewById(R.id.tv_nota);
            tvFecha = itemView.findViewById(R.id.tv_fecha);
        }

        public void setData (NotaTable n) {
            if (n.getFecha() != null && n.getImagen() != null) {
                Bitmap bitmap = BitmapFactory.decodeByteArray(n.getImagen().getBlob(), 0, n.getImagen().getBlob().length);
                ivFoto.setImageBitmap(bitmap);
                tvNota.setText(n.getTitulo().concat(String.valueOf(n.getId())));
                tvFecha.setText(mDateFormat.format(n.getFecha()));
            }
        }

    }
}

