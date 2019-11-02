package util;

public class ConversorMoedas{
	
	public static final double IOF = 0.06;
	
	public static double TotIOF(double TotUS$, double US$) {		
		return  TotUS$ * US$  *  IOF;
	}
	
	public static double TotCompra(double TotUS$, double US$ ) {
		return TotUS$ * US$;
	}
}	

	
	
	
	
 
	

