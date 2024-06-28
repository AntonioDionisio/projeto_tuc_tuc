class Veiculo {
    private String tipo;
    private String patrimonio;
    private String docVeiculo;

    public String veiculoCadastrado() {
        // Lógica para cadastrar o veículo
        return "Veículo cadastrado com sucesso!";
    }

    public String veiculoDisponivel() {
        // Lógica para verificar se o veículo está disponível
        return "Veículo disponível para uso.";
    }

    public String veiculoManutencao() {
        // Lógica para agendar manutenção do veículo
        return "Veículo agendado para manutenção.";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getDocVeiculo() {
        return docVeiculo;
    }

    public void setDocVeiculo(String docVeiculo) {
        this.docVeiculo = docVeiculo;
    }
}

