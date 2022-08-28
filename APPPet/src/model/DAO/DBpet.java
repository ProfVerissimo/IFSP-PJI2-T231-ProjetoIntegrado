package model.DAO;

public class DBpet {
String codPet1 = "c01";
String codPet2 = "c02";
String codPet3 = "c03";

//int id  []= {6734, 4832,433,1234};
public String acessaDBpet(String codPet) {
	String nomePet;
	if (codPet.equals(codPet1)) {
		nomePet = "Cachorro da raça fofinho";
	} else {
		if (codPet.equals(codPet2)) {
			nomePet = "Cachorro da raça DO CAO";
		} 	else {
			if (codPet.equals(codPet3)) {
				nomePet = "Cachorro da raça PINSCHER";
			} else {
				nomePet = "raça INVALIDA";
			}
		}
		
	}
	return nomePet;
}
}
