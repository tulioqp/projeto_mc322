package projeto_final;

public enum ExpiracaoDatas {
    
    PRESSAO(1, "Diário", "Pressão"),
    FREQUENCIACARDIACA(1, "Diário", "Frequência Cardíaca"),
    PESO(7, "Semanal", "Peso"),
    ALTURA(30, "Mensal", "Altura");

    private final int intervaloDias;
    private final String frequencia;
    private final String nome;

    ExpiracaoDatas(int intervaloDias, String frequencia, String nome) {
        this.intervaloDias = intervaloDias;
        this.frequencia = frequencia;
        this.nome = nome;
    }

    public int getIntervaloDias() {
        return intervaloDias;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public String getNome() {
        return nome;
    }
}