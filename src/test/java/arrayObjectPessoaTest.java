import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class arrayObjectPessoaTest extends TestCase {

    @Test
    public void testImprimePessoas() {
        Pessoa[] pessoas = new Pessoa[] {
                new Pessoa("Xandão", 25),
                new Pessoa("Goku", 60),
                new Pessoa("Scarpelly", 20),
                new Pessoa("Dante", 35),
                new Pessoa("Jorge", 120),
        };

        arrayObjectPessoa.imprimePessoas(pessoas);
    }

    @Test
    public void testPessoaMaisVelha() {  //Teste da Pessoa mais Velha
        Pessoa[] pessoas = new Pessoa[] {
                new Pessoa("Xandão", 25),
                new Pessoa("Goku", 60),
                new Pessoa("Scarpelly", 20),
                new Pessoa("Dante", 35),
                new Pessoa("Jorge", 120),
        };

        Pessoa maisVelha = pessoas[0];
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoa;
            }
        }

        assertEquals("Jorge", maisVelha.getNome());
        assertEquals(120, maisVelha.getIdade());
    }

    @Test
    public void testPessoaMaisNova() {
        Pessoa[] pessoas = new Pessoa[] {
                new Pessoa("Xandão", 25),
                new Pessoa("Goku", 60),
                new Pessoa("Scarpelly", 20),
                new Pessoa("Dante", 35),
                new Pessoa("Jorge", 120),
        };

        Pessoa maisNova = pessoas[0];
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < maisNova.getIdade()) {
                maisNova = pessoa;
            }
        }

        assertEquals("Scarpelly", maisNova.getNome());
        assertEquals(20, maisNova.getIdade());
    }

    @Test
    public void testePessoaComMesmaIdade() { //Duas pessoas com a mesma idade
        Pessoa[] pessoas = new Pessoa[] {
                new Pessoa("Xandão", 25),
                new Pessoa("Goku", 60),
                new Pessoa("Scarpelly", 25),
                new Pessoa("Dante", 35),
                new Pessoa("Jorge", 120),
        };
        Pessoa maisNova = pessoas[0];
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < maisNova.getIdade()) {
                maisNova = pessoa;
            }
        }

        assertEquals("Xandão", maisNova.getNome());
        assertEquals(25, maisNova.getIdade());
    }
}
