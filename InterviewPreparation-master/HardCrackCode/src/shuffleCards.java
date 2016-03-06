
import java.util.*;


public class shuffleCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int rand(int lower, int higher){
		return lower + (int)(Math.random() * (higher - lower + 1));
	}
	
	public static int[] shuffleArrayRecursively(int[] cards, int i){
		if( i == 0){
			return cards;
		}
		
		
		shuffleArrayRecursively(cards, i - 1);
		int k = rand(0,i);
		
		
		//Swap element k and i//
		int temp = cards[i];
		cards[i] = cards[k];
		cards[k] = temp;
		
		//
		return cards;
	}
	
	public static void shuffleArrayIterative(int[] cards){
		for(int i = 0; i < cards.length; i++){
			int k = rand(0,i);
			int temp = cards[i];
			cards[i] = cards[k];
			cards[k] = temp;
			
		}
		
	}

}
