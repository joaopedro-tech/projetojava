public class Carro {
  private String modelo;
  private String marca;
  private int ano;

  public void exibirInfo(){
    String info = String.format("Marca: %s, Modelo: %s, Ano: %d", marca, modelo, ano);
    System.out.println(info);
  }
  
  public String getModelo(){
    return modelo;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getMarca(){
    return marca;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public int getAno(){
    return ano;
  }

  public void setAno(int ano){
    this.ano = ano;
  }
}
