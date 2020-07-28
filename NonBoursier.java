public class NonBoursier extends Etudiant{
    private  String adresse;
    private  int aide;
  
    NonBoursier(){};
	NonBoursier( String adresse,int aide){
		this.adresse=adresse;
		this.aide=aide;
		 
		 
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getAide() {
		return aide;
	}

	public void setAide(int aide) {
		this.aide = aide;
	}
 
	


	
	

}
