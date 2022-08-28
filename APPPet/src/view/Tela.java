package view;
import javax.swing.JOptionPane;
public class Tela {
public void boasvindas() {
	JOptionPane.showMessageDialog(null,
			"\nBem-Vindo\nSistema x");
}	
  public String obtemCodproduto() {
	//System.out.println("Bem vindo ao sistema....");
	String codProd = JOptionPane.showInputDialog("Digite oC od produto");
	 
	 return codProd;
  } 
	 
  public void informaNomeRaca(String nome) {
	  JOptionPane.showMessageDialog(null,"A raca do seu cao é: "+nome);
  }
}
