// separar responsabilidades em outras classes
public class EmAprovacao implements EstadoDeUmOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.05;
    }

    // implementar TRANSICAO de estados

    // orcamento em aprovacao pode ser aprovado
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    // orcamento em aprovacao pode ser reprovado
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamentos em aprovacao nao podem ir direto para finalizado");
    }
}
