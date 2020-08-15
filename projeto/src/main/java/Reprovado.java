public class Reprovado implements EstadoDeUmOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orcamentos reprovados nao recebem desconto extra");

    }

    public void aprova(Orcamento orcamento) {

        throw new RuntimeException("Orcamentos reprovados nao podem ser aprovados");
    }

    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento já esta reprovado");

    }

    // orcamento reprovado pode ser finalizado
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();

    }
}
