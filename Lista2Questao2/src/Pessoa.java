import java.util.Date;

public class Pessoa {
  private String nome;
  private String empresa;
  private Date dataEntrada = null;
  private Date dataSaida = null;

  Pessoa(String nome, String empresa, Date dataEntrada, Date dataSaida) {
    this.nome = nome;
    this.empresa = empresa;
    this.dataEntrada = dataEntrada;
    this.dataSaida = dataSaida;
  }

  Pessoa(String nome, String empresa, Date dataEntrada) {
    this.nome = nome;
    this.empresa = empresa;
    this.dataEntrada = dataEntrada;
  }

  public void setDataEntrada(Date dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  public void setDataSaida(Date dataSaida) {
    this.dataSaida = dataSaida;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Date getDataEntrada() {
    return dataEntrada;
  }
  
  public Date getDataSaida() {
    return dataSaida;
  }

  public String getEmpresa() {
    return empresa;
  }

  public String getNome() {
    return nome;
  }
}
