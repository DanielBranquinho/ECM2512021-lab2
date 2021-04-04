package Gomes.Branquinho.Daniel;

public class Cliente {
    private String nome;
    private String senha;
    private String email;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
