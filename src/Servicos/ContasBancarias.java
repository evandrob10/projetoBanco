package Servicos;

public class ContasBancarias {
	private String numeroConta;
	private String tipo;
	private Double saldo;
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		tipo = tipo;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void depositarDinheiro(Double deposito) {
		this.saldo = deposito;
	}
	public String retirarDinheiro(Double retirada) {
		if(saldo > retirada) {
			this.saldo = saldo - retirada;
			return String.format("Você sacou: %.2f%nSeu novo saldo é: %.2f", retirada,saldo);
		}else {
			return String.format("Saldo insuficiente!%nSaldo atual da conta é: ", saldo);
		}
	}
	public String toString() {
		return String.format("Numero da Conta: %s%nTipo da Conta: %s%nSaldo em conta: %.2f", numeroConta,tipo,saldo);
	}	
}
