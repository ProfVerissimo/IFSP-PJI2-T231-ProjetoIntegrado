package Model.DAO;

public class ProdutoDAO {
   public double pesquisaProduto(String codProdutoPesquisa) {
	    String codProd1 = "p01";
		String codProd2 = "p02";
		String codProd3 = "p03";
		double preco = 0;
		if (codProdutoPesquisa.equals(codProd1) ) {
			preco = 501.00;
		} else {
			if (codProdutoPesquisa.equals(codProd2) ) {
				preco = 901.00;
			} else {
				if (codProdutoPesquisa.equals(codProd3) ) {
					preco = 1901.00;
				} else {
					preco = 0.00;
				}
			}
				
		}
		return preco;
   }
}
