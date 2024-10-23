/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.strategypagamento;

/**
 *
 * @author rafaelamoreira
 */
public class PagamentoCartaoCredito implements Pagamento{
     @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Cartão de Crédito.");
    }
}
