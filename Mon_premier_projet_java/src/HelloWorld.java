import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World !");	
//		String chaine = "abcdefgh";
//		int num = 8;
//		System.out.println(chaine + num * 3);
//		if(num < 7) {
//			System.out.println("Guillaume");
//		}
//		else {
//			System.out.println("Briac");
//		}
//		String[] apprenants = new String[4];
//		apprenants [0] = "Ibrahim";
//		apprenants [1] = "Kevin";
//		apprenants [2] = "Yasmine";
//		apprenants [3] = "Soumaya";
//		for (int i = 0; i < apprenants.length; i++) {
//			System.out.println(apprenants[i]);	
//		}
//		String[] apprenant = new String[4];
//		apprenant [0] = "Ibrahim";
//		apprenant [1] = "Kevin";
//		apprenant [2] = "Yasmine";
//		apprenant [3] = "Soumaya";
//		for (String Unapprenant:apprenant) {
//			System.out.println(Unapprenant);	
//		}
//		
//		int [] note = new int [4];
//		note[0] = 5; 
//		note[1] = 9;
//		note[2] = 12;
//		note[3] = 15;
//		for (int i = 0; i < note.length; i++) {
//			if (note[i] <= 5) {
//			System.out.println("Nul");
//		}
//			else if (note[i] <= 9) {
//			System.out.println("Passable");
//		}
//			else if (note[i] <= 13) {
//			System.out.println("Encourageant");
//		}
//			else if (note[i] >= 14) {
//			System.out.println("Félicitations");
//		}
//		}
//		
//		Personne powerRanger = new Personne("Bobby", "Kotick", "Homme", 45, 104, 156);
//		System.out.println(powerRanger.getFirstname());
//		powerRanger.setFirstname("Robert");
//		System.out.println(powerRanger.getLastname());
//		System.out.println(powerRanger.getSex());
//		System.out.println(powerRanger.getAge());
//		System.out.println(powerRanger.getWeight());
//		System.out.println(powerRanger.getHeight());	
//	
//		Apprenant ForceBleue = new Apprenant("Vanisaker", "Briac", 1, "POEI Capge");
//		Apprenant ForceRouge = new Apprenant("Bouhaik", "Yasmine", 3, "POEI Capge");
//		Apprenant ForceRose = new Apprenant("Patou", "Benoit", 2, "POEI Capge");
//		
//		Apprenant[] LesApprenants = new Apprenant[3]; 
//		LesApprenants[0] = ForceBleue;
//		LesApprenants[1] = ForceRouge;
//		LesApprenants[2] = ForceRose;
//		for(int i = 0; i < LesApprenants.length; i++) {
//			if (LesApprenants[i].getNiveau() == 3) {
//				System.out.println(LesApprenants[i].getNom() + " " + LesApprenants[i].getPrenom());
//			}
//		}

//		Création d'une liste vide
		
        ArrayList<Produit> TicketCaisses = new ArrayList<Produit>();
        
//		Instanciation de la class scanner depuis l'import
        
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Voulez-vous saisir un produit ? (O / N)");
        String reponse = sc.nextLine();
        
//		Début de le fonction  
        
        while (reponse.toUpperCase().equals("O")){
            System.out.println("Description de la commande :");
            String description = sc.next();

            System.out.println("Quantité :");
            int quantite = sc.nextInt();

            System.out.println("Prix unitaire :");
            double prixUnitaire = sc.nextDouble();
            
//    	Instanciation de mon objet produit
//    	Ajout des paramètres de produit à ma liste vide TicketCaisses
            
            Produit produit = new Produit(description, quantite, prixUnitaire);
            TicketCaisses.add(produit);
            
//    	Relance de la boucle ou non 
            
            System.out.println("Voulez-vous saisir un autre produit ? (O / N)");
            reponse = sc.next();
            if(!reponse.toUpperCase().equals("O")) break; 
        }
        
        System.out.println("<------Votre Ticket de caisse------>");
        
//		Affichage de ma liste TicketCaisses
        
//		Initialisation variable prixTotal
        
        double prixTotal = 0;
        
        for (Produit produit: TicketCaisses) {
//        	System.out.println("Produit\t\t\tQuantité\t\t\tPrix");
        	System.out.println("Produit:");
        	System.out.println(produit.getDescription());
        	System.out.println("Quantité:");
        	System.out.println(produit.getQuantite());
        	System.out.println("Prix unitaire:");
        	System.out.println(produit.getPrixUnitaire());
        	prixTotal = prixTotal + (produit.getQuantite()*produit.getPrixUnitaire());
//        	System.out.println(MessageFormat.format("{0} {1} {2}", produit.getDescription(), produit.getQuantite(), produit.getPrixUnitaire()));
        }
        
    	System.out.println("Prix total:" + " " + prixTotal);
    	
        System.out.println("<------Merci de votre visite chez Mounir------>");        
	}
}