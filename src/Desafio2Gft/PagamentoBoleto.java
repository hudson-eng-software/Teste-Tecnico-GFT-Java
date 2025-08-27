package Desafio2Gft;

public class PagamentoBoleto extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Gerando boleto bancario...");
    }
}

