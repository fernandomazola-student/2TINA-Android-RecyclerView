package br.com.fiap.a2tina_android_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvContatos;
    List<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contatos = GeraContato.listaContatos();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        ContatoAdapater adapater = new ContatoAdapater(this, contatos);


        rvContatos = (RecyclerView) findViewById(R.id.rvContatos);
        rvContatos.setHasFixedSize(true);
        rvContatos.setAdapter(adapater);
        rvContatos.setLayoutManager(layoutManager);
    }


}
