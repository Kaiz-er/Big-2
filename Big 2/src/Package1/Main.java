package Package1;
import java.util.*;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	final int max_players = 4;
	static int numOfCards = 52;
	static int numPlayers = 0;
	static LinkedList<Card> deck = new LinkedList<Card>();
	static ArrayList<Card> player1 = new ArrayList<Card>();
	static ArrayList<Card> player2 = new ArrayList<Card>();
	static ArrayList<Card> player3 = new ArrayList<Card>();
	static ArrayList<Card> player4 = new ArrayList<Card>();

	
	public static void main(String[] args) {
		displayWelcomeScreen();
		initDeck();
		shuffleDeck();
		numPlayers = getNumberOfPlayers();	
		printPlayerHand(1);
		printPlayerHand(2);
		printPlayerHand(3);
		printPlayerHand(4);

	}
	
	public static void displayWelcomeScreen() {
		System.out.println("Welcome to the JasZer TITTY");
		System.out.println("Maximum number of players: 4");
		System.out.println("Have fun!");
	}
	
	public static void printPlayerHand(int i)
	{
		if(i == 1)
		{
			System.out.println("Player 1");
			for(int e = 0; e < player1.size(); e++)
			{
				System.out.print(player1.get(e).getSuite() + "-" + player1.get(e).getNumber() + " ,");
			}
			System.out.println("\n" + player1.size());
		}
		if(i == 2)
		{
			System.out.println("Player 2");
			for(int r = 0; r < player2.size(); r++)
			{
				System.out.print(player2.get(r).getSuite() + "-" + player2.get(r).getNumber() + " ,");
			}
			System.out.println("\n" + player2.size());
		}
		if(i == 3)
		{
			System.out.println("Player 3");
			for(int f = 0; f < player1.size(); f++)
			{
				System.out.print(player3.get(f).getSuite() + "-" + player3.get(f).getNumber() + " ,");
			}
			System.out.println("\n" + player3.size());
		}
		if(i == 4)
		{
			System.out.println("Player 4");
			for(int c = 0; c < player4.size(); c++)
			{
				System.out.print(player4.get(c).getSuite() + "-" + player4.get(c).getNumber() + " ,");
			}
			System.out.println("\n" + player1.size());
		}
	}
	
	public static int getNumberOfPlayers() {
		int numOfPlayers = 0;
		do {
		System.out.print("Please enter the number of players: ");
		numOfPlayers = input.nextInt();
		if(numOfPlayers > 4 || numOfPlayers <= 0)
		{
			System.out.println("Please enter a valid number of players! Max size: 4");
		}
		if(numOfPlayers == 3)
		{
			numOfCards--;
		}
		distributeCards(numOfPlayers);
		}while(numOfPlayers > 4 || numOfPlayers <= 0);
		return numOfPlayers;
	}
	
	public static void initDeck() //Initializes the deck and all of it's cards
	{
		Card Spade1 = new Card("Spade", "1");
		Card Spade2 = new Card("Spade", "2");
		Card Spade3 = new Card("Spade", "3");
		Card Spade4 = new Card("Spade", "4");
		Card Spade5 = new Card("Spade", "5");
		Card Spade6 = new Card("Spade", "6");
		Card Spade7 = new Card("Spade", "7");
		Card Spade8 = new Card("Spade", "8");
		Card Spade9 = new Card("Spade", "9");
		Card Spade10 = new Card("Spade", "10");
		Card SpadeJ = new Card("Spade", "J");
		Card SpadeQ = new Card("Spade", "Q");
		Card SpadeK = new Card("Spade", "K");
		Card Heart1 = new Card("Heart", "1");
		Card Heart2 = new Card("Heart", "2");
		Card Heart3 = new Card("Heart", "3");
		Card Heart4 = new Card("Heart", "4");
		Card Heart5 = new Card("Heart", "5");
		Card Heart6 = new Card("Heart", "6");
		Card Heart7 = new Card("Heart", "7");
		Card Heart8 = new Card("Heart", "8");
		Card Heart9 = new Card("Heart", "9");
		Card Heart10 = new Card("Heart", "10");
		Card HeartJ = new Card("Heart", "J");
		Card HeartQ = new Card("Heart", "Q");
		Card HeartK = new Card("Heart", "K");
		Card Clover1 = new Card("Clover", "1");
		Card Clover2 = new Card("Clover", "2");
		Card Clover3 = new Card("Clover", "3");
		Card Clover4 = new Card("Clover", "4");
		Card Clover5 = new Card("Clover", "5");
		Card Clover6 = new Card("Clover", "6");
		Card Clover7 = new Card("Clover", "7");
		Card Clover8 = new Card("Clover", "8");
		Card Clover9 = new Card("Clover", "9");
		Card Clover10 = new Card("Clover", "10");
		Card CloverJ = new Card("Clover", "J");
		Card CloverQ = new Card("Clover", "Q");
		Card CloverK = new Card("Clover", "K");
		Card Diamond1 = new Card("Diamond", "1");
		Card Diamond2 = new Card("Diamond", "2");
		Card Diamond3 = new Card("Diamond", "3");
		Card Diamond4 = new Card("Diamond", "4");
		Card Diamond5 = new Card("Diamond", "5");
		Card Diamond6 = new Card("Diamond", "6");
		Card Diamond7 = new Card("Diamond", "7");
		Card Diamond8 = new Card("Diamond", "8");
		Card Diamond9 = new Card("Diamond", "9");
		Card Diamond10 = new Card("Diamond", "10");
		Card DiamondJ = new Card("Diamond", "J");
		Card DiamondQ = new Card("Diamond", "Q");
		Card DiamondK = new Card("Diamond", "K");
		deck.add(Spade1);
		deck.add(Spade2);
		deck.add(Spade3);
		deck.add(Spade4);
		deck.add(Spade5);
		deck.add(Spade6);
		deck.add(Spade7);
		deck.add(Spade8);
		deck.add(Spade9);
		deck.add(Spade10);
		deck.add(SpadeJ);
		deck.add(SpadeQ);
		deck.add(SpadeK);
		deck.add(Heart1);
		deck.add(Heart2);
		deck.add(Heart3);
		deck.add(Heart4);
		deck.add(Heart5);
		deck.add(Heart6);
		deck.add(Heart7);
		deck.add(Heart8);
		deck.add(Heart9);
		deck.add(Heart10);
		deck.add(HeartJ);
		deck.add(HeartQ);
		deck.add(HeartK);
		deck.add(Clover1);
		deck.add(Clover2);
		deck.add(Clover3);
		deck.add(Clover4);
		deck.add(Clover5);
		deck.add(Clover6);
		deck.add(Clover7);
		deck.add(Clover8);
		deck.add(Clover9);
		deck.add(Clover10);
		deck.add(CloverJ);
		deck.add(CloverQ);
		deck.add(CloverK);
		deck.add(Diamond1);
		deck.add(Diamond2);
		deck.add(Diamond3);
		deck.add(Diamond4);
		deck.add(Diamond5);
		deck.add(Diamond6);
		deck.add(Diamond7);
		deck.add(Diamond8);
		deck.add(Diamond9);
		deck.add(Diamond10);
		deck.add(DiamondJ);
		deck.add(DiamondQ);
		deck.add(DiamondK);
	}
	
	public static void shuffleDeck()
	{
		Collections.shuffle(deck);
	}
	
	public static void distributeCards(int numOfPlayers)
	{
		if(numOfPlayers == 2)
		{
			for(int i = 0; i < 52; i++)
			{
				player1.add(deck.get(i));
				i++;
				player2.add(deck.get(i));
			}
		}
		if(numOfPlayers == 3)
		{
			for(int i = 0; i < 51; i++)
			{
				player1.add(deck.get(i));
				i++;
				player2.add(deck.get(i));
				i++;
				player3.add(deck.get(i));
			}
		}
		if(numOfPlayers == 4)
		{
			for(int i = 0; i < 52; i++)
			{
				player1.add(deck.get(i));
				i++;
				player2.add(deck.get(i));
				i++;
				player3.add(deck.get(i));
				i++;
				player4.add(deck.get(i));
			}
		}
		
		
	}

	
	
	}

