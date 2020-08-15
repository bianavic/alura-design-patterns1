public interface EstadoDeUmOrcamento {

    // implementar TRANSICAO de estados
    void aplicaDescontoExtra(Orcamento orcamento);

    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);

}
