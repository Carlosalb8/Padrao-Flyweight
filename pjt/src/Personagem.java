public class Personagem {
    private String nome;
    private Cidade cidadeNatal;
    private String arma;

    public Personagem(String nome, Cidade cidadeNatal, String arma) {
        this.nome = nome;
        this.cidadeNatal = cidadeNatal;
        this.arma = arma;
    }

    public String obterPersonagem() {
        return "Personagem{nome='" + nome + "', cidadeNatal='" + cidadeNatal.getNome() + "', uf='" + cidadeNatal.getUf() + "', arma='" + arma + "'}";
    }

}
