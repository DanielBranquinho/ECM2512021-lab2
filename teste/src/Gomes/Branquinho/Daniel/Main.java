package Gomes.Branquinho.Daniel;

public class Main {

    public static void main(String[] args) {
    //Cria uma referencia para um objeto Conta
        Conta c1;
    //Instancia um objeto conta
        c1 = new Conta();

        //Manipular os atributos
        c1.titular = "Daniel";
        c1.saldo = 199.99;
        c1.numero = 1234;

        c1.visualizarsaldo();

        Conta c2 = new Conta();
        c2.saldo = 400;
        c2.titular = "Izuku Midoriya";
        c2.visualizarsaldo();

        c1.depositar(100);
        c1.visualizarsaldo();

        if(c2.sacar(200)){
            System.out.printf("Deu Bom!");
        }else {
            System.out.printf("Deu Ruim!");
        }
        c2.visualizarsaldo();
    }
}


