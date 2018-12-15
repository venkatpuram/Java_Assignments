
public class Complex {

	private double real;
	private double imaginary;
	
	public Complex(){
		
	}
	
	public Complex(double real,double imaginary){
		this.setReal(real);
		this.setImaginary(imaginary);
	}
	
	public static Complex sum(Complex complex,Complex complex1)
	{
		Complex result=new Complex();
		result.setReal(complex.getReal()+complex1.getReal());
		result.setImaginary(complex.getImaginary()+complex1.getImaginary());
		return result;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}
}
