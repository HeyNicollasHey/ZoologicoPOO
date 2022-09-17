package Model;

public class Terrestres extends Animal{

    boolean quadrupede;
    boolean possuiPelos;
    boolean possuiGarras;

    public Terrestres(
            boolean quadrupede, boolean possuiPelos, boolean possuiGarras, String nome,
            String especie, String tipoDeAlimentacao, int peso,
            int temperaturaAdequada, boolean riscoDeExtincao)
    {
        super(nome, especie, tipoDeAlimentacao, peso, temperaturaAdequada, riscoDeExtincao);
        this.quadrupede = quadrupede;
        this.possuiPelos = possuiPelos;
        this.possuiGarras = possuiGarras;
    }

    public boolean isQuadrupede() {
        return quadrupede;
    }

    public boolean isPossuiPelos() {
        return possuiPelos;
    }

    public boolean isPossuiGarras() {
        return possuiGarras;
    }

    public void setQuadrupede(boolean quadrupede) {
        this.quadrupede = quadrupede;
    }

    public void setPossuiPelos(boolean possuiPelos) {
        this.possuiPelos = possuiPelos;
    }

    public void setPossuiGarras(boolean possuiGarras) {
        this.possuiGarras = possuiGarras;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getTemperaturaAdequada() {
        return super.getTemperaturaAdequada();
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public String getTipoDeAlimentacao() {
        return super.getTipoDeAlimentacao();
    }

    @Override
    public int getPeso() {
        return super.getPeso();
    }

    @Override
    public boolean isRiscoDeExtincao() {
        return super.isRiscoDeExtincao();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        super.setTipoDeAlimentacao(tipoDeAlimentacao);
    }

    @Override
    public void setPeso(int peso) {
        super.setPeso(peso);
    }

    @Override
    public void setTemperaturaAdequada(int temperaturaAdequada) {
        super.setTemperaturaAdequada(temperaturaAdequada);
    }

    @Override
    public void setRiscoDeExtincao(boolean riscoDeExtincao) {
        super.setRiscoDeExtincao(riscoDeExtincao);
    }

    @Override
    public String toString() {
    return "\n-------------------------------------------------------------------" +
                super.toString() +
                "\n (Terrestre) Informacoes especificas do animal [" +
                "\nQuadrupede?: " + quadrupede +
                "\nPossui pelos?: " + possuiPelos +
                "\nPossui garras?: " + possuiGarras + " ]";
    }
}

