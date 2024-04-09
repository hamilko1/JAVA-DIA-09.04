package JAVABOSTA;

// Classe ContaPoupanca
public class ContaPoupanca extends ContaBancaria {
    // Construtor
    public ContaPoupanca(int numeroConta, double saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    // Método para simular rendimento da poupança
    public double calcularRendimento() {
        // Simulação do rendimento
        return getSaldo() * 0.03; // Por exemplo, 3% ao ano
    }
}
