package model.Pets;

import model.DAO.DBpet;

public class TrataPet {
   public String verificaExistenciaPet(String codPet) {
	   boolean existePet=false;
	   DBpet dbPet = new DBpet();
	   
	   String nomeRaca = dbPet.acessaDBpet(codPet);
	   
	   
	   return nomeRaca;
   }
}
