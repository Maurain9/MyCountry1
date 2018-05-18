public class Catastrophes {
	
	// Declaration des différentes proprietes
	
	private String nature;
	private String zone;
	private String description;
	
	 public Catastrophes() {
		 
	 }
		 
		 public String getNature() {  //getter pour propriete 'nature'
			 return nature;
	 }
		 
		 // Utilisation des getter et setter
		 
		 public void setNature(String nature) {  // setter pour propriete 'nature'
			 this.nature = nature;
		 }
		 
		 public String getZone() { //getter pour propriete 'ZONE'
			 return zone;
		 }
		 
		 public void setZone(String zone) { // setter pour propriete 'zone'
			 this.zone = zone;
		}
		 
		 public String getDescription() { //getter pour propriete 'description'
			 return description;
			 
		 }
		 
		 public void setDescription(String description) { // setter pour propriete 'description'
			 this.description = description;
		 }

}
