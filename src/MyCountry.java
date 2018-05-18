import java.util.Scanner;
public class MyCountry {

	   public static void main (String arg[]) { // Class principale
		   
		   System.out.println ("Bienvenu dans mon application de signalisation d''incidents et catastrophes naturels");

		   Catastrophes incidents = new Catastrophes () ;//Instruction de type declaration + Affectation + instanciation
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("signaler un incident ou catastrophe naturel");
		    incidents.setNature(sc.nextLine());
		    
		     System.out.println("nature de l''incident");// INSTRUCTION D'afficharge
		     
		     incidents.setZone(sc.nextLine());
		     System.out.println("La zone de l''incident");
		     
		     incidents.setDescription(sc.nextLine());
		     System.out.println("description de la zone d''incident");
		      
		     String str = sc.nextLine();
		     
		        System.out.println("Merci pour votre humble contribution");
	   }
	   
}
