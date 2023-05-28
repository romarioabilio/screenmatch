package Models;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Madagascar";
        filme.duracaoEmMinutos = 165;
        filme.anoDeLancamento = 2005;
       // filme.incluidoNoPlano = true;
        //filme.totalDeAvaliacoes = 1334;
       // filme.somaDasAvaliacoes = 4.9;
        filme.exibiFichaTecnica();
        filme.avalia(1.0);
        filme.avalia(8.9);
        filme.avalia(9.5);

    }
}
