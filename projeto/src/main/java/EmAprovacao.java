// separar responsabilidades em outras classes
public class EmAprovacao {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.05;
    }
}
