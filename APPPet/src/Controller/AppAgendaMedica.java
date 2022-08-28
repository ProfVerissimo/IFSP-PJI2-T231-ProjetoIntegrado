package Controller;
import view.Tela;
import model.Pets.*;
public class AppAgendaMedica {
	public static void main(String[] args) {
		Tela telaEntrada = new Tela();
		telaEntrada.boasvindas();
		
		String codigoP = telaEntrada.obtemCodproduto();
		
		
		TrataPet pet = new TrataPet();
		
		String nome = pet.verificaExistenciaPet(codigoP);
		
		telaEntrada.informaNomeRaca(nome);
	}

}
