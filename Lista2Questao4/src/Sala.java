public class Sala {
  private PortaSala PortaEntrada;
  private float MetragemQuadrada;
  private Porta PortaAuxiliar;

  public float getMetragemQuadrada() {
    return MetragemQuadrada;
  }

  public PortaSala getPortaEntrada() {
    return PortaEntrada;
  }

  public Porta getPortaAuxiliar() {
    return PortaAuxiliar;
  }

  public void setMetragemQuadrada(float metragemQuadrada) {
    MetragemQuadrada = metragemQuadrada;
  }

  public void setPortaEntrada(PortaSala portaEntrada) {
    PortaEntrada = portaEntrada;
  }

  public void setPortaAuxiliar(Porta portaAuxiliar) {
    PortaAuxiliar = portaAuxiliar;
  }
}
