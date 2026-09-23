import Model.ContaBancaria;
import Service.TransferenciaService;

public class Main {

    public static void main(String[] args) {

        // Criando as contas bancárias
        ContaBancaria joaoSilva = new ContaBancaria("João Silva", "001");
        ContaBancaria joanaDarc = new ContaBancaria("Joana D'Arc", "002");

        // Exibindo os saldos iniciais
        joaoSilva.exibirSaldo();
        joanaDarc.exibirSaldo();

        // Realizando depósitos
        joaoSilva.depositar(1000.50);
        joanaDarc.depositar(1500.65);

        // Realizando saques
        joaoSilva.sacar(900);
        joanaDarc.sacar(1400);

        // Exibindo os saldos após os saques
        joaoSilva.exibirSaldo();
        joanaDarc.exibirSaldo();

        // Tentando sacar um valor maior que o saldo disponível
        try {
            joaoSilva.sacar(900);
        } catch (IllegalArgumentException e) {
            IO.println("Não foi possível realizar o saque.");
            IO.println("Motivo: " + e.getMessage());
        }

        joaoSilva.exibirSaldo();

        // Criando o serviço de transferência
        TransferenciaService transferenciaService = new TransferenciaService();

        // Realizando transferência entre contas
        transferenciaService.transferir(
                joaoSilva,
                joanaDarc,
                100
        );

        // Exibindo os saldos após a transferência
        joaoSilva.exibirSaldo();
        joanaDarc.exibirSaldo();
    }
}