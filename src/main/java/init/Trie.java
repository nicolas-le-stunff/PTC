package init;

public class Trie {

	
public int[][] partition(int[] liste, Integer taille) throws Exception {
	
	
			
		if(taille == null) {
			throw new Exception("Impossible de diviser par 0 ou null");
		}else if(taille == 0){
			throw new Exception("Impossible de diviser par 0 ou null");
		}
		if(liste == null) {
			throw new Exception ("Impossible de diviser une liste null");
			
		}
		
		
		int listeLenght = liste.length; 
		
		if(listeLenght< taille) {
			throw new Exception ("La taille doit être inférieur à la longueur de la liste");
		}
		
		// Longueur maximum du tableau en comptant la possibilitée de nombre impaire
		int listSize = (listeLenght/taille) + (listeLenght%taille); 
		
		
		// Init du tableau 
		int[][]result = new int[listSize][taille];
		
		
		int itterator1 = 0 ;
		int itterator2 = 0 ;
		
		for (int i = 0;i<listeLenght;i++) {
			// Si l'itterateur est < à la taille, récuperation de la valeur liste[i] et incrément de itterator2
			if(itterator2 < taille) {
				result[itterator1][itterator2] = liste[i];
				itterator2++;
			}else {
			// Sinon, on passe à la ligne suivante en réinitalisant l'itterator2 et incrémentant l'itterator1
				
				itterator1++;
				itterator2=0;
				result[itterator1][itterator2] = liste[i];
				itterator2++;
			}		
		}
		
		return result;
		
		
	}
	
}
