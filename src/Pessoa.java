public class Pessoa {
  private int idade;
  private String nome;
  private int ano;
  private int mes;
  private int dia;

  public int getDiasDeVida(){
    int anoAtual = 2025;
    int mesAtual = 8;
    int diaAtual = 15;

    int anosVividos = anoAtual - ano;
    int mesesVividos = 0;
    int diasVividos = 0;

    if(mesAtual > mes){
      anosVividos--;
      mesesVividos = 12 - mes + mesAtual;
    }
    diasVividos = (anosVividos * 365) + 
    (mesesVividos * 30);

    return diasVividos;
  }
 
  public int getIdade(){
    return idade;
  }
 
  public void setIdade(int _idade){
    idade = _idade;
  } 
 
  public String getNome(){
    return nome;
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
}
