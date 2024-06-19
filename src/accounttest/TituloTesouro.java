/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest;

/**
 *
 * @author Aluno
 */
public class TituloTesouro {
    

    private int prazo;
    private double taxaJuros;

    public TituloTesouro(int prazo) {
        this.prazo = prazo;
        this.taxaJuros = calcularTaxaJuros(prazo);
    }

    private double calcularTaxaJuros(int prazo) {
        if (prazo >= 0 && prazo <= 11) {
            return 0.5;
        } else if (prazo >= 12 && prazo <= 23) {
            return 1.0;
        } else if (prazo >= 24 && prazo <= 35) {
            return 1.5;
        } else if (prazo >= 36 && prazo <= 47) {
            return 2.0;
        } else if (prazo >= 48 && prazo <= 60) {
            return 2.5;
        } else {
            System.out.println("Prazo inválido.");
            return 0.0;
        }
    }

    public void imprimirDetalhesTitulo() {
        System.out.println("Detalhes do Título do Tesouro:");
        System.out.println("Prazo: " + prazo + " meses");
        System.out.println("Taxa de juros: " + taxaJuros + "% ao mês");
    }

    public static void main(String[] args) {
        // Teste da classe TituloTesouro
        TituloTesouro titulo = new TituloTesouro(24);
        titulo.imprimirDetalhesTitulo();
    }
}
