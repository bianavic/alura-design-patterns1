public class TesteAcoes {

    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());

        NotaFiscal nf = builder.paraEmpresa("Fabi Ltda").comCnpj("123")
                .comItem(new ItemDaNota("nome", 100)).comObservacoes("observacoes")
                .naDataAtual().constroi();

        System.out.println(nf.getValorBruto());
    }
}
