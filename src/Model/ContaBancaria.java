package Model;

public class ContaBancaria {

    private String titular;
    private String num;
    private double saldo;

    /*
     * O número da conta é armazenado como String,
     * pois pode começar com zero.
     */
    public ContaBancaria(String titular, String num) {
        this.titular = titular;
        this.num = num;
        this.saldo = 0.0;
    }

    // Retorna o saldo atual da conta.
    public double getSaldo() {
        return this.saldo;
    }

    // Deposita um valor na conta.
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor do depósito deve ser maior que zero."
            );
        }

        this.saldo += valor;
    }

    // Realiza um saque da conta.
    public double sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor do saque deve ser maior que zero."
            );
        }

        if (valor > this.saldo) {
            throw new IllegalArgumentException(
                    "Saldo insuficiente."
            );
        }

        this.saldo -= valor;

        return valor;
    }

    // Exibe os dados da conta e o saldo atual.
    public void exibirSaldo() {
        IO.println("======= SALDO DA CONTA =======");
        IO.println("Titular: " + this.titular);
        IO.println("Num. Conta: " + this.num);
        IO.println("Saldo: " + this.saldo);
        IO.println("==============================");
    }
}