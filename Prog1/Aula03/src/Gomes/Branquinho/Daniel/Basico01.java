package Gomes.Branquinho.Daniel;

public class Basico01 {
    //Tipos primitivos
    public static void main(String[] args) {
        int hp;
        boolean megaEvolui;
        float atk; //Ponto flutuante no java é, por padrão, double.
        double satk;
        String nome;

        //Atribuições
        hp = 100;
        megaEvolui = true;
        atk = 50.0f; //f no final, para forçar um float
        satk = 55.0;
        nome = "Gengar";

        System.out.println("Nome:"+nome);
        System.out.println("Mega Evolui?:"+megaEvolui);
        System.out.println("ATK:"+atk+" Atk Especial:"+satk);
    }
}
