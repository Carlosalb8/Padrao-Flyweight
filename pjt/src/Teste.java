import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Teste {
    @Test
    public void testCriarPersonagem() {
        Jogo jogo = new Jogo();
        jogo.criarPersonagem("João", "São Paulo", "SP", "Espada");
        List<String> personagens = jogo.obterPersonagens();
        assertEquals(1, personagens.size());
        assertTrue(personagens.contains("Personagem{nome='João', cidadeNatal='São Paulo', uf='SP', arma='Espada'}"));
    }
    @Test
    public void testCriarPersonagensEmCidadesDiferentes() {
        Jogo jogo = new Jogo();
        jogo.criarPersonagem("João", "São Paulo", "SP", "Espada");
        jogo.criarPersonagem("Maria", "Rio de Janeiro", "RJ", "Arco");
        List<String> personagens = jogo.obterPersonagens();
        assertEquals(2, personagens.size());
        assertTrue(personagens.contains("Personagem{nome='João', cidadeNatal='São Paulo', uf='SP', arma='Espada'}"));
        assertTrue(personagens.contains("Personagem{nome='Maria', cidadeNatal='Rio de Janeiro', uf='RJ', arma='Arco'}"));
    }

    @Test
    public void testObterPersonagens() {
        Jogo jogo = new Jogo();
        jogo.criarPersonagem("João", "São Paulo", "SP", "Espada");
        jogo.criarPersonagem("Maria", "Rio de Janeiro", "RJ", "Arco");
        jogo.criarPersonagem("Pedro", "Belo Horizonte", "MG", "Machado");
        List<String> personagens = jogo.obterPersonagens();
        assertEquals(3, personagens.size());
        assertTrue(personagens.contains("Personagem{nome='João', cidadeNatal='São Paulo', uf='SP', arma='Espada'}"));
        assertTrue(personagens.contains("Personagem{nome='Maria', cidadeNatal='Rio de Janeiro', uf='RJ', arma='Arco'}"));
        assertTrue(personagens.contains("Personagem{nome='Pedro', cidadeNatal='Belo Horizonte', uf='MG', arma='Machado'}"));
    }

    @Test
    public void testCidadeUnica() {
        Jogo jogo = new Jogo();
        jogo.criarPersonagem("João", "São Paulo", "SP", "Espada");
        jogo.criarPersonagem("Maria", "São Paulo", "SP", "Arco");
        jogo.criarPersonagem("Pedro", "São Paulo", "SP", "Machado");
        assertEquals(1, CidadeFactory.getTotalCidades());
    }


}

