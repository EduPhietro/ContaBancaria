package Model;

public class ContaBancaria {
    String titular;
    String num; // String type is used for this attribute because num can start with char 0;
    private double saldo;

    public ContaBancaria(
            String titular,
            String num
    ){
        this.titular = titular;
        this.num = num;
        this.saldo = 0.0;

    }

    // GETTER TO this.saldo
    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor){
        if (valor <=0) {
            throw  new IllegalArgumentException("You can't deposit a negative valor");
        }
        this.saldo  += valor;
    }

    public  void sacar(double valor){
        if (valor <=0) {
            throw  new IllegalArgumentException("You can't deposit a negative valor");
        }
        if (valor>this.saldo){
            throw new IllegalArgumentException("Your balance is insufficient");
        }
        this.saldo  -= valor;
    }

    public void exibirSaldo(){
        IO.println("======= SALDO DA CONTA =======");
        IO.println("Titular: " + this.titular);
        IO.println("Num. Conta: " + this.num);
        IO.println("Saldo: " + this.saldo);
        IO.println("==============================");
    }

}
