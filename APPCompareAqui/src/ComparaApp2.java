import javax.swing.JOptionPane;

public class ComparaApp2 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"\nBem-Vindo\nSistema x");
	
		String codProd = JOptionPane.showInputDialog("Digite cod produto");
		 
		
		String codProd1 = "p01";
		String codProd2 = "p02";
		String codProd3 = "p03";
		double preco = 0;
		
		if (codProd.equals(codProd1) ) {
			preco = 501.00;
		} else {
			if (codProd.equals(codProd2) ) {
				preco = 901.00;
			} else {
				if (codProd.equals(codProd3) ) {
					preco = 1901.00;
				} else {
					preco = 0.00;
				}
			}
				
		}
		 JOptionPane.showMessageDialog(null,"O melhor preco : "+preco);
	}

	  }	 



