package info.lifeti.activeconnections11.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import info.lifeti.activeconnections11.Model.Cidade;
import info.lifeti.activeconnections11.Model.Cliente;
import info.lifeti.activeconnections11.Model.Juridica;
import info.lifeti.activeconnections11.Model.Pessoa;
import info.lifeti.activeconnections11.R;

public class TelaClienteInformacoes extends AppCompatActivity {
    EditText jurNomeFantasia,jurRazaoSocial,jurCnpj,jurIE,jurIM,jurDataFund,cliRamo,jurIBGE,cliEnquad,cliObs;
    String addClienteURL = "http://lifeti.netau.net/prospeccao/addCliente.php";
    Cliente clt;
    Context cljp;
    Integer STATUS;
    Date data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cliente_informacoes);

        STATUS = (Integer)getIntent().getSerializableExtra("STATUS");

        jurNomeFantasia = (EditText) findViewById(R.id.tClientNome);
        jurRazaoSocial = (EditText) findViewById(R.id.tClientEmp);
        jurCnpj = (EditText) findViewById(R.id.tClientCnpj);
        jurIE = (EditText) findViewById(R.id.tClientIE);
        jurIM = (EditText) findViewById(R.id.tClientIM);
        jurDataFund = (EditText) findViewById(R.id.tClientDTFund);
        cliRamo = (EditText) findViewById(R.id.tClientRamo);
        jurIBGE = (EditText) findViewById(R.id.tClientCMIbge);
        cliEnquad = (EditText) findViewById(R.id.tClientEquad);
        cliObs = (EditText) findViewById(R.id.tClientObs);

        cljp = this;
    }

    public void limparInfoCliente(View View)
    {
        limparEditText(jurNomeFantasia,jurRazaoSocial,jurCnpj,jurIE,jurIM,jurDataFund,cliRamo,jurIBGE,cliEnquad,cliObs);

    }

    private void limparEditText(EditText... e) {
        int i = 0;
        while (e.length > i) {
            e[i].setText("");
            i++;
        }
    }

    public void salvarInfoCliente(View View)
    {
        if (jurNomeFantasia.length() <= 4){
            Toast.makeText(this, "Nome Fantasia Precisa ter no minimo 5 caracteres", Toast.LENGTH_LONG).show();
            return ;
        }
        if (jurRazaoSocial.length() <= 4){
            Toast.makeText(this, "Razao Social Precisa ter no minimo 5 caracteres", Toast.LENGTH_LONG).show();
            return ;
        }
        if (jurCnpj.length() != 14){
            Toast.makeText(this, "CNPJ Precisa ter exatamente 14 caracteres", Toast.LENGTH_LONG).show();
            return ;
        }
        if (jurIE.length() != 12){
            Toast.makeText(this, "IE Precisa ter exatamente 12 caracteres", Toast.LENGTH_LONG).show();
            return ;
        }
        String dataTexto = new String(String.valueOf(jurDataFund.getText()));
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            format.setLenient(false);
            data = format.parse(dataTexto);
        } catch (ParseException e) {
            Toast.makeText(this, "Data inválida", Toast.LENGTH_LONG).show();
            return ;
        }
        if (cliRamo.length() <= 4){
            Toast.makeText(this, "Ramo Precisa ter no minimo 5 caracteres", Toast.LENGTH_LONG).show();
            return ;
        }
        if (jurIM.length() != 12){
            Toast.makeText(this, "IM Precisa ter exatamente 12 caracteres", Toast.LENGTH_LONG).show();
            return ;
        }
        if (jurIBGE.length() != 12){
            Toast.makeText(this, "IBGE Precisa ter exatamente 12 caracteres", Toast.LENGTH_LONG).show();
            return ;
        }
        if (cliEnquad.length() <= 4){
            Toast.makeText(this, "Enquadramento Precisa ter no minimo 5 caracteres", Toast.LENGTH_LONG).show();
            return ;
        }
        clt = new Cliente();
        clt.setJur(new Juridica());
        clt.getJur().setPes(new Pessoa());
        clt.getJur().setCid(new Cidade());

        clt.getJur().setJurNomeFantasia(jurNomeFantasia.getText().toString());
        clt.getJur().setJurRazaoSocial(jurRazaoSocial.getText().toString());
        clt.getJur().setJurCnpj(jurCnpj.getText().toString());
        clt.getJur().setJurInscricaoEstadual(jurIE.getText().toString());
        clt.getJur().setJurInscricaoMunicipal(jurIM.getText().toString());
        clt.getJur().setJurDtFundacao(jurDataFund.getText().toString());
        clt.setCliRamo(cliRamo.getText().toString());
        clt.setCliEnquadramento(cliEnquad.getText().toString());
        clt.setCliObservacoes(cliObs.getText().toString());

        clt.getJur().getCid().setCidCodIbge(jurIBGE.getText().toString());

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS", 1);
        it.putExtra("CLIENTE", clt);
        startActivity(it);

        finish();
    }


    public void bSairClientInfoSair(View v) {

        Intent it = new Intent(this, TelaCliente.class);
        it.putExtra("STATUS", STATUS);
        startActivity(it);
        finish();
    }
}
