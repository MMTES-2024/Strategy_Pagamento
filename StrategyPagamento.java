/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex01.strategypagamento;

/**
 *
 * @author rafaelamoreira
 */
public class StrategyPagamento {

    public static void main(String[] args) {
        
        CarrinhoCompras carrinho = new CarrinhoCompras();

        // Definindo o método de pagamento como Cartão de Crédito
        carrinho.setMetodoDePagamento(new PagamentoCartaoCredito());
        carrinho.finalizarCompra(150.00); 
        // Alterando o método de pagamento para PayPal
        carrinho.setMetodoDePagamento(new PagamentoPayPal());
        carrinho.finalizarCompra(200.00); 
        // Alterando o método de pagamento para Criptomoeda
        carrinho.setMetodoDePagamento(new PagamentoCriptomoeda());
        carrinho.finalizarCompra(300.00); 
    }
}
