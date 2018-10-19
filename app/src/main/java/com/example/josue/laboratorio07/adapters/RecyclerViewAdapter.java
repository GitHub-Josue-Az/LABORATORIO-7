package com.example.josue.laboratorio07.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.josue.laboratorio07.R;
import com.example.josue.laboratorio07.models.Empresa;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre, direccion, telefono;
        private ImageView logoEmpresa;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.tvNombre);
            direccion = (TextView) itemView.findViewById(R.id.tvDireccion);
            telefono = (TextView) itemView.findViewById(R.id.tvTelefono);
            logoEmpresa = (ImageView) itemView.findViewById(R.id.imgEmpresa);
        }
    }
    //Procedemos a crear una variable tipo List para almacenar todos los datos mostrados en cada item
    public List<Empresa> listaEmpresas;

    //Luego creamos el método constructor de dicho adaptador, el cual recibirá como parámetro la lista creada
    public RecyclerViewAdapter(List<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    //El método OnCreateViewHolder se encarga de inflar el contenido de un nuevo item para la lista
    //"Inflar" es el procedimiento que se realiza para hacer uso de un layout dentro de otro layout
    //En este caso, nuestro layout "item_empresa" tiene como destino ser parte del layout "activity_empresa"
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.i_emp, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    //El método onBindViewHolder es el que realiza las modificaciones del contenido para cada item
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(listaEmpresas.get(position).getNombre());
        holder.direccion.setText(listaEmpresas.get(position).getDireccion());
        holder.telefono.setText(listaEmpresas.get(position).getTelefono());
        holder.logoEmpresa.setImageResource(listaEmpresas.get(position).getLogo());
    }

    //El método getItemCount permite determinar al adaptador la cantidad de elementos que se procesarán
    @Override
    public int getItemCount() {
        return listaEmpresas.size();
    }
}