package calculator;

public class calcolatrice {
	
	public static double somma(double a, double b) {
		double c;
		double cArrotondato;
		c = a+b;
		cArrotondato = Math.round(c*100.0)/100.0;
		return(cArrotondato);
	}
	
	public static double moltiplicazione(double a, double b) {
		double c;
		double cArrotondato;
		c = a*b;
		cArrotondato = Math.round(c*10000.0)/10000.0;
		return(cArrotondato);
		
	}
	
	public static double sottrazione(double a, double b) {
		double c;
		double cArrotondato;
	
		c= a-b;
		cArrotondato = Math.round(c*100.0)/100.0;
		return(cArrotondato);		
	}
	
	public static double divisione(double a, double b) throws Exception {
		double c = 0;
		double cArrotondato;
		
		if(b!=0) {
			c= a/b;
			cArrotondato = Math.round(c*100.0)/100.0;
			}
		else
			throw new Exception( "DIVISIONE IMPOSSIBILE");
		return(cArrotondato);
		
		
	}
	
	public static void main(String args[]) throws Exception {
		double a = Math.random  ();
		double b = Math.random();
		double aArrotondato;
		double bArrotondato;
		aArrotondato = Math.round(a*100.0)/100.0;
		bArrotondato= Math.round(b*100.0)/100.0;
		System.out.println(aArrotondato + " e " + bArrotondato);
		System.out.println("Somma: " + somma(aArrotondato,bArrotondato));
		System.out.println("Sottrazione: " + sottrazione(aArrotondato,bArrotondato));
		System.out.println("Moltiplicazione: " + moltiplicazione(aArrotondato,bArrotondato));
		System.out.println("Divisione: " + divisione(aArrotondato,bArrotondato));
		
	}
}
