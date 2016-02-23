package info.lifeti.activeconnections11.Controller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import info.lifeti.activeconnections11.R;

public class TelaClientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_clientes);
    }

    public void clientOptions(View v) {
        final Context context = this;
        Intent it = new Intent(context, TelaCliente.class);
        startActivity(it);
    }

    public void fechar(View v) {
        //TESTE
        this.onDestroy();
    }
}
