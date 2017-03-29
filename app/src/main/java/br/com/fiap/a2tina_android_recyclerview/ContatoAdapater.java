package br.com.fiap.a2tina_android_recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by logonrm on 29/03/2017.
 */

public class ContatoAdapater extends RecyclerView.Adapter<ContatoAdapater.ContatoViewHolder>{

    private Context context;
    private List<Contato> contatos;

    public ContatoAdapater(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public ContatoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
        //Reposavel por criar e instanciar o viewholder
    }

    @Override
    public void onBindViewHolder(ContatoViewHolder holder, int position) {
    //Para cada item que tem na lista, e coloco no viewholder
    }

    @Override
    public int getItemCount() {
        return 0;
        //Quantidade de itens que vao ser renderizados na lista
    }

    public static class ContatoViewHolder extends RecyclerView.ViewHolder {
        public ContatoViewHolder(View itemView) {
            super(itemView);
        }
    }
}
