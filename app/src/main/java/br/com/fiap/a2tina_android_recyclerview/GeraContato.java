package br.com.fiap.a2tina_android_recyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 29/03/2017.
 */

public class GeraContato {
    public static List<Contato> listaContatos(){
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Fernando Mazola", "11 971310854", "Olá", R.drawable.ic_account_circle_black_24dp));
        contatos.add(new Contato("Daniela Kiuman", "11 971310854", "Olá", R.drawable.ic_account_circle_black_24dp));
        return contatos;
    }
}
