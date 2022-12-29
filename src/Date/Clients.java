package Date;
import java.util.ArrayList;
import java.util.List;

// importação modulo conta:
import Servicos.ContasBancarias;

public class Clients {
	private String name;
	private String cpf;
	private List<ContasBancarias> Contas = new ArrayList();
	
	
	public Clients (String name, String cpf) {
		this.name = name;
		this.cpf  = cpf;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getCpf () {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return String.format("Nome: %s%nCpf: %s", name,cpf);
	}

}
