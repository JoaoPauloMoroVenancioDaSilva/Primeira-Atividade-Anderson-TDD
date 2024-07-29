public class arrayObjectPessoa {
    public static void imprimePessoas(Pessoa[] pessoas) {
        if (pessoas == null || pessoas.length == 0) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        Pessoa maisVelha = pessoas[0];
        Pessoa maisNova = pessoas[0];

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoa;
            }
            if (pessoa.getIdade() < maisNova.getIdade()) {
                maisNova = pessoa;
            }
        }

        System.out.println("Pessoa mais velha: " + maisVelha.getNome() + ", " + maisVelha.getIdade() + " anos");
        System.out.println("Pessoa mais nova: " + maisNova.getNome() + ", " + maisNova.getIdade() + " anos");
    }

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[] {
                new Pessoa("Xandão", 28),
                new Pessoa("Muay Thai pra Cachorro", 30),
                new Pessoa("Serjão", 45),
                new Pessoa("Scarpelly Jr.", 12),
                new Pessoa("Amigo do Cariani que parece o Kratos", 50),
                new Pessoa("Kleitinho", 2000)
        };

        imprimePessoas(pessoas);
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

