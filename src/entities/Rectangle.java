package entities;

public class Rectangle {
	public double alt;
	public double larg;
	
    public double area() {
    	return alt * larg;
    }
    
    public String toString() {
    	return "A area do ret�ngulo �: "+String.format("%.2f", area());
    }
}

