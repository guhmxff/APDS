public class Quarto {
  private PortaQuarto Porta;
  private boolean Banheiro;
  private float MetragemQuadrada;

  public PortaQuarto getPorta() {
    return Porta;
  }

  public boolean isBanheiro() {
    return Banheiro;
  }

  public float getMetragemQuadrada() {
    return MetragemQuadrada;
  }

  public void setPorta(PortaQuarto porta) {
    Porta = porta;
  }

  public void setBanheiro(boolean banheiro) {
    Banheiro = banheiro;
  }

  public void setMetragemQuadrada(float metragemQuadrada) {
    MetragemQuadrada = metragemQuadrada;
  }
}
