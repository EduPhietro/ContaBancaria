import Model.ContaBancaria;

public class Main{
    public  static  void main(String[] args){
        ContaBancaria joaoSilva = new ContaBancaria("João Silva", "001");
        ContaBancaria joanaDarc = new ContaBancaria("Joana D'Arc", "002" );

        joaoSilva.exibirSaldo();
        joanaDarc.exibirSaldo();
    }
}