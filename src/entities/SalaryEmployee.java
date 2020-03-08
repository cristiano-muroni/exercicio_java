package entities;

public class SalaryEmployee {
	String name;
	double grossSalary;
	final public static double tax = 1000.00; // imposto cobrado em rela��o ao sal�rio
	
	public void increaseSalary (double percentage){ // incrementando o sal�rio, de acordo com a porcentagem de aumento
		
		  grossSalary *= percentage;
	}
	public double netSalary() { // sal�rio liquido
		return grossSalary -= tax;
	}
	
	public String toString() {
		return " nome: "
				+ name
				+ ", "
				+"sal�rio liquido: "
				+ String.format("%.2f",netSalary() )
				+ " descontando o imposto de: "
				+ String.format(".2f", tax)
				+ ", "
				+"sal�rio bruto"
				+ String.format("%.2f", grossSalary);
	}
	
	

}
