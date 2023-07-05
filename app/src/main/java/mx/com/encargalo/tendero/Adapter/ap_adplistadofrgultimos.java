package mx.com.encargalo.tendero.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.Entidad.LastFavoritos;

public class ap_adplistadofrgultimos extends RecyclerView.Adapter<ap_adplistadofrgultimos.ViewHolder> implements View.OnClickListener {

    LayoutInflater ap_inflater;
    ArrayList<LastFavoritos> ap_model;

    private View.OnClickListener ap_listener;

    public ap_adplistadofrgultimos(Context context, ArrayList<LastFavoritos> model){
        this.ap_inflater =LayoutInflater.from(context);
        this.ap_model =model;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = ap_inflater.inflate(R.layout.ap_mfitemcardultimos, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.ap_listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ap_adplistadofrgultimos.ViewHolder holder, int position) {
        String titulo = ap_model.get(position).getAp_strtitulo();
        holder.titulo.setText(String.valueOf(titulo));

    }

    @Override
    public int getItemCount() {
        return ap_model.size();
    }

    @Override
    public void onClick(View view) {
        if(ap_listener !=null){
            ap_listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.ap_catxtnombrecurso);
        }
    }
}
