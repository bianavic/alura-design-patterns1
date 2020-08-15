public class Aprovado implements EstadoDeUmOrcamento{

    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.02;
    }

    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento ja esta aprovado");
    }

    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamentos aprovados nao podem ser reprovados");
    }

    // orcamento aprovado pode ser finalizado
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
