package Game;

public class Card {
	
	private String suit;
	private String value;
	private int rank;
	 //Constructor for cards, if the value is numeric sets the rank to the number, if not the rank is set for "ace", "King", "Queen", "Jack" accordingly. 
	public Card(String suit, String value) {
		
		this.suit=suit;
		this.value=value;
		if(!value.equals("King")&& !value.equals("Queen")&&!value.equals("Jack")&&!value.equals("Ace")){
			this.rank= Integer.parseInt(value);	
		}
		else {
			if(value.equals("King")) {
				this.rank=13;
			}
			if(value.equals("Queen")) {
				this.rank=12;
			}
			if(value.equals("Jack")) {
				this.rank=11;
			}
			if(value.equals("Ace")) {
				this.rank=14;
			}
		}
		
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	//Displays card, does not return anything.
	public void showCard() {
		String str= "Card: "+this.value+" of"+this.suit;
		System.out.println(str);
	}
	public String getImageFileName() {
	    String fileName = "";

	    // Check suit and value combinations
	    if (this.suit.equals("Clubs")) {
	        switch (this.value) {
	            case "Ace":
	                fileName = "ace_of_clubs";
	                break;
	            case "King":
	                fileName = "king_of_clubs";
	                break;
	            case "Queen":
	                fileName = "queen_of_clubs";
	                break;
	            case "Jack":
	                fileName = "jack_of_clubs";
	                break;
	            case "10":
	                fileName = "10_of_clubs";
	                break;
	            case "9":
	                fileName = "9_of_clubs";
	                break;
	            case "8":
	                fileName = "8_of_clubs";
	                break;
	            case "7":
	                fileName = "7_of_clubs";
	                break;
	            case "6":
	                fileName = "6_of_clubs";
	                break;
	            case "5":
	                fileName = "5_of_clubs";
	                break;
	            case "4":
	                fileName = "4_of_clubs";
	                break;
	            case "3":
	                fileName = "3_of_clubs";
	                break;
	            case "2":
	                fileName = "2_of_clubs";
	                break;
	            // Add cases for 2 through 8 if needed
	            default:
	                fileName = "default_card_image";
	                break;
	        }
	    } else if (this.suit.equals("diamonds")) {
	        switch (this.value) {
	            case "Ace":
	                fileName = "ace_diamonds";
	                break;
	            case "King":
	                fileName = "king_of_diamonds";
	                break;
	            case "Queen":
	                fileName = "queen_of_diamonds";
	                break;
	            case "Jack":
	                fileName = "jack_of_diamonds";
	                break;
	            case "10":
	                fileName = "10_of_diamonds";
	                break;
	            case "9":
	                fileName = "9_of_diamonds";
	                break;
	            case "8":
	                fileName = "8_of_diamonds";
	                break;
	            case "7":
	                fileName = "7_of_diamonds";
	                break;
	            case "6":
	                fileName = "6_of_diamonds";
	                break;
	            case "5":
	                fileName = "5_of_diamonds";
	                break;
	            case "4":
	                fileName = "4_of_diamonds";
	                break;
	            case "3":
	                fileName = "3_of_diamonds";
	                break;
	            case "2":
	                fileName = "2_of_diamonds";
	                break;
	            // Add cases for 2 through 8 if needed
	            default:
	                fileName = "default_card_image";
	                break;
	        }
	    } else if (this.suit.equals("hearts")) {
	        switch (this.value) {
	            case "Ace":
	                fileName = "ace_hearts";
	                break;
	            case "King":
	                fileName = "king_of_hearts";
	                break;
	            case "Queen":
	                fileName = "queen_of_hearts";
	                break;
	            case "Jack":
	                fileName = "jack_of_hearts";
	                break;
	            case "10":
	                fileName = "10_of_hearts";
	                break;
	            case "9":
	                fileName = "9_of_hearts";
	                break;
	            case "8":
	                fileName = "8_of_hearts";
	                break;
	            case "7":
	                fileName = "7_of_hearts";
	                break;
	            case "6":
	                fileName = "6_of_hearts";
	                break;
	            case "5":
	                fileName = "5_of_hearts";
	                break;
	            case "4":
	                fileName = "4_of_hearts";
	                break;
	            case "3":
	                fileName = "3_of_hearts";
	                break;
	            case "2":
	                fileName = "2_of_hearts";
	                break;
	            
	            default:
	                fileName = "default_card_image";
	                break;
	        }
	    } else if (this.suit.equals("spades")) {
	        switch (this.value) {
	            case "Ace":
	                fileName = "ace_spades";
	                break;
	            case "King":
	                fileName = "king_of_spades";
	                break;
	            case "Queen":
	                fileName = "queen_of_spades";
	                break;
	            case "Jack":
	                fileName = "jack_of_spades";
	                break;
	            case "10":
	                fileName = "10_of_spades";
	                break;
	            case "9":
	                fileName = "9_of_spades";
	                break;
	            case "8":
	                fileName = "8_of_spades";
	                break;
	            case "7":
	                fileName = "7_of_spades";
	                break;
	            case "6":
	                fileName = "6_of_spades";
	                break;
	            case "5":
	                fileName = "5_of_spades";
	                break;
	            case "4":
	                fileName = "4_of_spades";
	                break;
	            case "3":
	                fileName = "3_of_spades";
	                break;
	            case "2":
	                fileName = "2_of_spades";
	                break;
	                
	            // Add cases for 2 through 8 if needed
	            default:
	                fileName = "default_card_image";
	                break;
	        }
	    }

	    return fileName;
	}
	
}
