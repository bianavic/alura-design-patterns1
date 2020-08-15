<<<<<<< HEAD
public class Aprovado implements EstadoDeUmOrcamento{

    private boolean descontoAplicado = false;
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.02;
            descontoAplicado = true;
        }
        else {
            throw new RuntimeException("Desconto já aplicado!");
        }
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
=======
public class Aprovado {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.02;
>>>>>>> 1ae39516013dc73d3c4dc9ffd5479082b9b37f54
    }
}
