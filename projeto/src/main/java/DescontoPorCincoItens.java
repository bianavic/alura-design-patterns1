public class DescontoPorCincoItens implements Desconto{

    private Desconto proximo;

    public double desconto(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        } else {
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
