public abstract class TemplateDeImpostoCondicional implements Imposto {

    // criamos um metodo que funciona como um template /
    // um molde para as classes filhas

    public double calcula(Orcamento orcamento) {

        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract double minimaTaxacao(Orcamento orcamento);

}
