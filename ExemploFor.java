package for_array;

public class ExemploFor {

	public static void main(String[] args) {
		String frutas[] = {"Banana", "Uva", "Maçã", "Melão", "Limão"};
		String paisesVenceramCopa[] = {"Brasil", "França", "Argentina", "Espanha"};
		
		for(int i=0;i<frutas.length;i++) {
			System.out.println("A fruta presente no indice " + i + " é " + frutas[i]);
		}
		System.out.println("\n");
		for(String venceramCopa : paisesVenceramCopa){
			System.out.println("Esses são os paises que venceram a copa: " + venceramCopa);
		}
	}

}
