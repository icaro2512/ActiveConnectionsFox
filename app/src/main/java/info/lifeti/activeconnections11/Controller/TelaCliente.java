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

    public void clientInfos(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteInformacoes.class);
        startActivity(it);
    }

    public void clientEnde(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteLocalizacao.class);
        startActivity(it);
    }

    public void clientEmail(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteEmail.class);
        startActivity(it);
    }

    public void clientTel(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaClienteTelefone.class);
        startActivity(it);
    }

    public void backToClients(View v) {// tirei pq tem botão de voltar no android ja
        finish();
    }
}
