public class Cozinha {
  private PortaCozinha Porta;
  private boolean Americana;
  private float MetragemQuadrada;

  public void setPorta(PortaCozinha porta) {
    Porta = porta;
  }

  public void setAmericana(boolean americana) {
    Americana = americana;
  }

  public void setMetragemQuadrada(float metragemQuadrada) {
    MetragemQuadrada = metragemQuadrada;
  }

  public PortaCozinha getPorta() {
    return Porta;
  }
  
  public boolean isAmericana() {
    return Americana;
  }

  public float getMetragemQuadrada() {
    return MetragemQuadrada;
  }
}
