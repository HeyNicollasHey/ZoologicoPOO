package Model;

public class Aereos extends Animal{

    boolean possuiPenas;
    boolean possuiBico;
    boolean poeOvos;

    public Aereos(boolean possuiPenas, boolean possuiBico, boolean poeOvos, String nome,
                  String especie, String tipoDeAlimentacao, int peso,
                  int temperaturaAdequada, boolean riscoDeExtincao){
        super(nome, especie, tipoDeAlimentacao, peso, temperaturaAdequada, riscoDeExtincao);
        this.possuiPenas = possuiPenas;
        this.possuiBico = possuiBico;
        this.poeOvos = poeOvos;
    }
    public boolean isPossuiPenas(){
        return possuiPenas;
    }

    public boolean isPossuiBico(){
        return possuiBico;
    }

    public boolean isPoeOvos(){
        return poeOvos;
    }

    public void setPossuiPenas(){
        this.possuiPenas = possuiPenas;
    }

    public void setPossuiBico(){
        this.possuiBico = possuiBico;
    }

    public void setPoeOvos(){
        this.poeOvos = poeOvos;
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
        return
                "\n-------------------------------------------------------------------" +
                        super.toString() +
                "\n(Aereo) Informacoes especificas do animal [" +
                "\nPossui penas?: " + possuiPenas +
                "\nPossui bico?: " + possuiBico +
                "\nPoe ovos?: " + poeOvos + "]";
    }
}
