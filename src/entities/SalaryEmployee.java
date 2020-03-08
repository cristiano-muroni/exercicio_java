package entities;

public class SalaryEmployee {
	String name;
	double grossSalary;
	final public static double tax = 1000.00; // imposto cobrado em relação ao salário
	
	public void increaseSalary (double percentage){ // incrementando o salário, de acordo com a porcentagem de aumento
		
		  grossSalary *= percentage;
	}
	public double netSalary() { // salário liquido
		return grossSalary -= tax;
	}
	
	public String toString() {
		return " nome: "
				+ name
				+ ", "
				+"salário liquido: "
				+ String.format("%.2f",netSalary() )
				+ " descontando o imposto de: "
				+ String.format(".2f", tax)
				+ ", "
				+"salário bruto"
				+ String.format("%.2f", grossSalary);
	}
	
	

}
