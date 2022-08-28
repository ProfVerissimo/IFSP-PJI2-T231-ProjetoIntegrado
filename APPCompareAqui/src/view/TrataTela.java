package view;

import javax.swing.JOptionPane;

public class TrataTela {
  public void  entraSistema() {
	  JOptionPane.showMessageDialog(null,
				"\nBem-Vindo\nSistema x");
  }
  public String  obtemProduto() {
	  String codProd = JOptionPane.showInputDialog("Digite cod produto");
	  return codProd;
  }
  public void informaPreco(String mensagem) {
	  JOptionPane.showMessageDialog(null,mensagem);
  }
}
