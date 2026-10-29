package Automovel;

public class Main {
	
	public static void main (String[] args) {
		
		Automovel a1 = new Automovel();
		Automovel a2 = new Automovel();
		Automovel a3 = new Automovel();
		Automovel a4 = new Automovel();
		Automovel a5 = new Automovel();
		
		a1.setCor(" Vermelho ");
		a1.setMarca(" Ferrari ");
		a1.setModelo(" 488 GTB ");
		a1.setAnoFabricacao( 2018 );
		
		a2.setCor(" Azul ");
		a2.setMarca(" Ford ");
		a2.setModelo(" Mustang GT ");
		a2.setAnoFabricacao(2020);
		
		a3.setCor(" Preto ");
		a3.setMarca(" BMW ");
		a3.setModelo(" X5 ");
		a3.setAnoFabricacao(2019);
		
		a4.setCor(" Branco ");
		a4.setMarca(" Toyota ");
		a4.setModelo(" Corolla Altis ");
		a4.setAnoFabricacao(2021);
		
		a5.setCor(" Prata ");
		a5.setMarca(" Mercedes-Benz ");
		a5.setModelo(" C-Class ");
		a5.setAnoFabricacao(2022);
	
	System.out.println(" Automóvel 1: " + a1.getMarca() + " - "+ a1.getModelo() + " - " + a1.getCor() + " - Ano " +  a1.getAnoFabricacao());
	System.out.println(" Automóvel 2: " + a2.getMarca() + " - "+ a2.getModelo() + " - " + a2.getCor() + " - Ano " +  a2.getAnoFabricacao());
	System.out.println(" Automóvel 3: " + a3.getMarca() + " - "+ a3.getModelo() + " - " + a3.getCor() + " - Ano " +  a3.getAnoFabricacao());	
	System.out.println(" Automóvel 4: " + a4.getMarca() + " - "+ a4.getModelo() + " - " + a4.getCor() + " - Ano " +  a4.getAnoFabricacao());
	System.out.println(" Automóvel 5: " + a5.getMarca() + " - "+ a5.getModelo() + " - " + a5.getCor() + " - Ano " +  a5.getAnoFabricacao());
		
		
	}

}
