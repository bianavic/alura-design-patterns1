public class TesteDaNotaFiscal {

    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Fabi Ltda")
        .comCnpj("12.345.678/0001-12")
        .comItem(new ItemDaNota("item 1", 200.0))
        .comItem(new ItemDaNota("item 2", 300.0))
        .comItem(new ItemDaNota("item 3", 400.0))
        .comObservacoes("observacoes")
        .naDataAtual();
        // ...

        NotaFiscal nf = builder.constroi();
        //ItemDaNota in = builder.constroi();

        System.out.println(nf.getValorBruto());
    }
}
