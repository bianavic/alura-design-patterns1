public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;

    public double desconto(Orcamento orcamento) {
        if (orcamento.getValor() > 500.0) {
            return orcamento.getValor() * 0.07;
        }
        else {
            return proximo.desconta(orcamento);
        }
    }

    public double desconta(Orcamento orcamento) {
        return 0;
    }

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
