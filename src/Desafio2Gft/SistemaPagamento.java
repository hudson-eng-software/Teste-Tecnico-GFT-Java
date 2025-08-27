package Desafio2Gft;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamento {
    public static void main(String[] args) {

        List<Pagamento> listaPagamentos = new ArrayList<>();


        listaPagamentos.add(new PagamentoCartao());
        listaPagamentos.add(new PagamentoBoleto());
        listaPagamentos.add(new PagamentoCartao());


        for (Pagamento pagamento : listaPagamentos) {
            pagamento.processarPagamento();
        }
    }
}

