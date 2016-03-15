package info.lifeti.activeconnections11.Model;

public class Pessoa {
    private Integer pesId;
    private String pesStatus;
    private String pesDtHrInclusao;
    private String pesDtSaida;
    private String pesDtHrVolta;
    private Usuario usu;

    public Pessoa(){
    }
    public Integer getPesId() {
        return pesId;
    }

    public void setPesId(Integer pesId) {
        this.pesId = pesId;
    }

    public String getPesStatus() {
        return pesStatus;
    }

    public void setPesStatus(String pesStatus) {
        this.pesStatus = pesStatus;
    }

    public String getPesDtHrInclusao() {
        return pesDtHrInclusao;
    }

    public void setPesDtHrInclusao(String pesDtHrInclusao) {
        this.pesDtHrInclusao = pesDtHrInclusao;
    }

    public String getPesDtSaida() {
        return pesDtSaida;
    }

    public void setPesDtSaida(String pesDtSaida) {
        this.pesDtSaida = pesDtSaida;
    }

    public String getPesDtHrVolta() {
        return pesDtHrVolta;
    }

    public void setPesDtHrVolta(String pesDtHrVolta) {
        this.pesDtHrVolta = pesDtHrVolta;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
}
