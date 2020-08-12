public abstract class TemplateDeImpostoCondicional extends Imposto {

    // criamos um metodo que funciona como um template /
    // um molde para as classes filhas

    public double calcula(Orcamento orcamento) {

        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento) + calculoOutroImposto(orcamento);
        } else {
            return minimaTaxacao(orcamento) + calculoOutroImposto(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract double minimaTaxacao(Orcamento orcamento);

}
