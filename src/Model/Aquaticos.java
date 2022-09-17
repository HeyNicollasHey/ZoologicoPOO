package Model;

public class Aquaticos extends Animal{

    boolean possuiEscamas;
    boolean possuiDentes;
    boolean posuiBranqueas;

    public Aquaticos(String nome, String especie, String tipoDeAlimentacao,
                     int temperaturaAdequada, int peso, boolean riscoDeExtincao,
                     boolean possuiEscamas, boolean possuiDentes, boolean posuiBranqueas) {
        super(nome, especie, tipoDeAlimentacao, temperaturaAdequada, peso, riscoDeExtincao);
        this.possuiEscamas = possuiEscamas;
        this.possuiDentes = possuiDentes;
        this.posuiBranqueas = posuiBranqueas;
    }

    public boolean isPossuiEscamas() {
        return possuiEscamas;
    }

    public boolean isPossuiDentes() {
        return possuiDentes;
    }

    public boolean isPosuiBranqueas() {
        return posuiBranqueas;
    }

    public void setPossuiEscamas(boolean possuiEscamas) {
        this.possuiEscamas = possuiEscamas;
    }

    public void setPossuiDentes(boolean possuiDentes) {
        this.possuiDentes = possuiDentes;
    }

    public void setPosuiBranqueas(boolean posuiBranqueas) {
        this.posuiBranqueas = posuiBranqueas;
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
                "\n (Aquatico) Informacoes especificas do animal [ " +
                "\nPossui escamas?: " + possuiEscamas +
                "\nPossui dentes?: " + possuiDentes +
                "\nPossui branqueas?:" + posuiBranqueas + " ]";
    }
}
