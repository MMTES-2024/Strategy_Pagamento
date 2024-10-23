/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.strategypagamento;

/**
 *
 * @author rafaelamoreira
 */
public class CarrinhoCompras {

    private Pagamento metodoDePagamento;

    // Define a estratégia de pagamento a ser usada
    public void setMetodoDePagamento(Pagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    // Processa o pagamento usando a estratégia definida
    public void finalizarCompra(double valor) {
        if (metodoDePagamento == null) {
            System.out.println("Nenhum método de pagamento foi selecionado.");
        } else {
            metodoDePagamento.processarPagamento(valor);
        }
    }
}
