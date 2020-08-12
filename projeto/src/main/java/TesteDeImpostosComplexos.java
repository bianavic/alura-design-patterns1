public class TesteDeImpostosComplexos {

    public static void main(String[] args) {
        // DECORATOR padrao que visa juntar comportamentos separados
        // juntar comportamentos que estao separados
        Imposto iss = new ISS(new ICMS(new ICPP()));

        // COMPOR essas variacoes com um construtor
        //Imposto issComIcms = new ISSComICMS();
        //Imposto issComIcmsComIcpp = new ISSComICMSComICPP();

        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }
}
