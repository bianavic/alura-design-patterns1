// separar responsabilidades em outras classes
public class EmAprovacao implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.05;
        if(!descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.05;
            descontoAplicado = true;
        }
        else {
            throw new RuntimeException("Desconto já aplicado!");
        }
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
