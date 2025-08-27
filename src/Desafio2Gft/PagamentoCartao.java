package Desafio2Gft;

public class PagamentoCartao extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via cartao...");
    }
}

