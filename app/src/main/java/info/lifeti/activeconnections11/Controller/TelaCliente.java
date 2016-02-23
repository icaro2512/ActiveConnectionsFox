package info.lifeti.activeconnections11.Controller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import info.lifeti.activeconnections11.R;

public class TelaCliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente);
    }
    /*
    public void clientInfos(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteInformacoes.class);
        startActivity(it);
    }

    public void voltaClients(View v) {// tirei pq tem botão de voltar no android ja
        final Context context = this;
        Intent it = new Intent(context, TelaClientes.class);
        startActivity(it);
    }*/
}
