package br.com.fiap.a2tina_android_recyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        //Reposavel por criar e instanciar o viewholder
        View v = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_contato, parent, false);
        ContatoViewHolder contatoViewHolder = new ContatoViewHolder(v);

        return null;

    }

    @Override
    public void onBindViewHolder(ContatoViewHolder holder, int position) {
    //Para cada item que tem na lista, e coloco no viewholder // Pegar os dados do contatos que vamos receber
        Contato contato = this.contatos.get(position);
        holder.imgContato.setImageResource(contato.getImagem());
        holder.txtNome.setText(contato.getNome());
        holder.txtStatus.setText(contato.getStatus());
    }

    @Override
    public int getItemCount() {
        return this.contatos.size();
        //Quantidade de itens que vao ser renderizados na lista
    }

    public static class ContatoViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imgContato;
        TextView txtNome;
        TextView txtStatus;

        public ContatoViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView;
            imgContato = (ImageView) itemView.findViewById(R.id.imgContato);
            txtNome =  (TextView) itemView.findViewById(R.id.txtNome);
            txtStatus = (TextView) itemView.findViewById(R.id.txtStatus);
        }
    }
}
