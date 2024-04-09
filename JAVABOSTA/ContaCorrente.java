package JAVABOSTA;

public class ContaCorrente extends ContaBancaria {
    // Construtor
    public ContaCorrente(int numeroConta, double saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    // Método para simular rendimento em CDB com liquidez diária
    public double calcularRendimento() {
        // Simulação do rendimento
        return getSaldo() * 0.01; // Por exemplo, 1% ao ano
    }
}