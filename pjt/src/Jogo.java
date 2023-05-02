import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private List<Personagem> personagens = new ArrayList<>();
    public Jogo() {
    }

    public void criarPersonagem(String nomePersonagem, String nomeCidade, String uf, String arma) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Personagem personagem = new Personagem(nomePersonagem, cidade, arma);
        this.personagens.add(personagem);
    }

    public List<String> obterPersonagens() {
        List<String> saida = new ArrayList<>();
        for (Personagem personagem : personagens) {
            saida.add(personagem.obterPersonagem());
        }

        return saida;
    }

}
