import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    protected double valor;
    private final List<Item> itens;

    private int estadoAtual;
    // criar constante
    public static final int EM_APROVACAO = 1;
    public static final int APROVADO = 2;
    // ...

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void aplicaDescontoExtra() {

        // COMO representar um estado = ORCAMENTO ESTA EM APROVACAO = no objeto?
        // if (ORCAMENTO ESTA EM APROVACAO) valor = valor - (valor * 0.05);
        // if (estadoAtual == EM_APROVACAO) valor = valor - (valor * 0.05);

        if (estadoAtual == EM_APROVACAO) valor = valor - (valor * 0.05);
        else if (estadoAtual == APROVADO) valor = valor - (valor * 0.02);
        else throw new RuntimeException("Somente orcamento em aprovacao ou aprovados recebem desconto extra");

    }
}
