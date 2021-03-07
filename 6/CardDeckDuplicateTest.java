import java.util.*;
class CardDeckDuplicateTest {

	static boolean checkDuplicates(CardDeck cs) {
		List<Card> cl = new ArrayList<Card>();
		boolean duplicate = false;
		for(int i=0; i<4*13; i++) {
			Card c = cs.deal();
			System.out.print(c);
			if((i+1)%13==0)
				System.out.println();
			if(cl.contains(c)) { 
				duplicate = true;
				break;
			}
			cl.add(c);
		}
		if(duplicate) {
			System.out.println("Duplicates found! Stop.");
		} else {
			System.out.println("OK: No duplicates found.");			
		}
		return duplicate;
	}
	public static void main(String[] args) {
		boolean passed = true;
		System.out.println("<< Init >>");
		CardDeck cs1 = new CardDeck();
		passed = passed && !checkDuplicates(cs1);
		System.out.println("<< Shuffle >>");
		CardDeck cs2 = new CardDeck();
		cs2.shuffle();
		passed = passed && !checkDuplicates(cs2);
		System.out.println();
		if(passed)
			System.out.println("PASSED!");
		else
			System.out.println("Try again..");
	}
}
