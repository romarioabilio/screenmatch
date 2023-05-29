package Models.CalculadoraTempoReal;


import Models.Titulo;

public class Calculadora {
    private int tempoTotal;



    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

//  public void inclui(Filme f){
//     tempoTotal += f.getDuracaoEmMinutos();
//  }
//  public void inclui(Serie s){
//     tempoTotal += s.getDuracaoEmMinutos();
// }
    //USANDO POLIMORFISMO
    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
