public class Finalizado implements EstadoDeUmOrcamento{

    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orcamentos finalizados nao recebem desconto extra");
    }

    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento ja finalizado");
    }

    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento ja finalizado");
    }

    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento ja finalizado");
    }
}
