 public class Boursier extends Etudiant{
    private  String type;
    private  int montant;
  
Boursier(){};
	Boursier( String type,int montant){
		this.type=type;
		this.montant=montant;
		 
		 
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}
 
	


	
	

}
