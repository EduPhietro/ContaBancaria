package Service;

import Model.ContaBancaria;

public class TransferenciaService {

    /*
     * Realiza a transferência de um valor entre duas contas bancárias.
     *
     * @param origem  Conta da qual o valor será retirado.
     * @param destino Conta que receberá o valor transferido.
     * @param valor   Valor que será transferido.
     *
     * @return true caso a transferência seja realizada com sucesso;
     *         false caso a conta de origem não possua saldo suficiente.
     */
    public boolean transferir(
            ContaBancaria origem,
            ContaBancaria destino,
            double valor
    ) {

        // Verifica se a conta de origem possui saldo suficiente
        // para realizar a transferência.
        if (origem.getSaldo() >= valor) {

            // Realiza o saque na conta de origem e armazena
            // o valor efetivamente retirado.
            double valorTransferencia = origem.sacar(valor);

            // Deposita o valor retirado na conta de destino.
            destino.depositar(valorTransferencia);

            // Indica que a transferência foi concluída com sucesso.
            return true;
        }

        // Caso o saldo da conta de origem seja insuficiente,
        // nenhuma movimentação é realizada.
        return false;
    }
}