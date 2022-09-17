package Model;

public class Animal {
    String nome;
    String especie;
    String tipoDeAlimentacao;
    int peso;
    int temperaturaAdequada;
    boolean riscoDeExtincao;

    public Animal(String nome, String especie, String tipoDeAlimentacao, int temperaturaAdequada,
                  int peso, boolean riscoDeExtincao){
        this.nome = nome;
        this.especie = especie;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
        this.peso = peso;
        this.riscoDeExtincao = riscoDeExtincao;
        this.temperaturaAdequada = temperaturaAdequada;
    }

    public Animal() {

    }

    public String getNome() {
        return nome;
    }

    public int getTemperaturaAdequada() {
        return temperaturaAdequada;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipoDeAlimentacao() {
        return tipoDeAlimentacao;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isRiscoDeExtincao() {
        return riscoDeExtincao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTemperaturaAdequada(int temperaturaAdequada) {
        this.temperaturaAdequada = temperaturaAdequada;
    }

    public void setRiscoDeExtincao(boolean riscoDeExtincao) {
        this.riscoDeExtincao = riscoDeExtincao;
    }

    @Override
    public String toString() {
        return "\n " +
                "\nInformacoes gerais [" +
                "\nNome: " + nome + "\nEspecie: " + especie +
                "\nTipo de alimentacao: " + tipoDeAlimentacao +
                "\nPeso: " + peso + "\nTemperatura adequada: " + temperaturaAdequada +
                "\nRisco de extincao?: " + riscoDeExtincao + " ]";
    }
}
