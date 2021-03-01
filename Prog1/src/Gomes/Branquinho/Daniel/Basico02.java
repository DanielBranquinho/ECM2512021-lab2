package Gomes.Branquinho.Daniel;

public class Basico02 {
    //Estruturas decisão
    public static void main(String[] args) {
        int ano = 2021;
        //Estrutura de decisão simples
        /*
        if (ano % 2 == 0){
            System.out.println("Ano Par");
        }
        if (ano %2 != 0){
            System.out.println("Ano Impar");
        }
        ------------------------------------------------*/
        //Estrutura de decisão composta
        if(ano % 2 == 0){
            System.out.printf("Ano Par!");
        } else {
            System.out.println("Ano Impar!");
        }

        switch (ano) {
            case 2020:
                System.out.println("Vixi");
                break;
            case 1996:
                System.out.println("Pokemon");
                break;
            default:
                System.out.println("Segue");
                break;
        }
    }
}
