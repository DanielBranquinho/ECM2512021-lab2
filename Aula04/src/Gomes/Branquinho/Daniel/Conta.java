package Gomes.Branquinho.Daniel;

public class Conta {
    //Atributos
    String titular;
    String cpf;
    int numero;
    double saldo;

    //Metodos
    void  visualizarsaldo(){
        System.out.println("Valor do saldo: R$" +this.saldo);
    };
    boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return  true;
        }
        return false;
    };
    void depositar(double valor){
//        this.saldo = this.saldo + valor;
        this.saldo += valor;
    };
    void transferirdinheiro(Conta destino, double valor){
        if(this.sacar(valor) == true){

        }
    };


}
