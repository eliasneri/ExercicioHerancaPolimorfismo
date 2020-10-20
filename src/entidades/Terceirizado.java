package entidades;

public class Terceirizado extends Funcionario {

	private Double despesaAdicional;

	
	public Terceirizado() {
		super();
	}
	
	public Terceirizado(String nome, Integer horas, Double valorHora, Double despesaAdicional) {
		super(nome, horas, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getAdicional() {
		return despesaAdicional;
	}

	public void setAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}
	
	
}
