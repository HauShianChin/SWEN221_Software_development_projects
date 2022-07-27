package swen221.cards.util;

import static swen221.cards.core.Card.Rank.TWO;
import static swen221.cards.core.Card.Suit.HEARTS;

import java.awt.List;
import java.util.ArrayList;

import swen221.cards.core.Card;
import swen221.cards.core.Hand;
import swen221.cards.core.Player;
import swen221.cards.core.Player.Direction;
import swen221.cards.core.Trick;

/**
 * Implements a simple computer player who plays the highest card available when
 * the trick can still be won, otherwise discards the lowest card available. In
 * the special case that the player must win the trick (i.e. this is the last
 * card in the trick), then the player conservatively plays the least card
 * needed to win.
 * 
 * @author David J. Pearce
 * 
 */
public class SimpleComputerPlayer extends AbstractComputerPlayer {

	public SimpleComputerPlayer(Player player) {
		super(player);
	}

	@Override
	public Card getNextCard(Trick trick) {		
		
		Card nextCard = null;
		Card.Suit trumpSuit = trick.getTrumps(); 
		
		Hand playerHand = player.getHand(); //getting super player's hand
		
		//System.out.println(playedCards.toString());
		
		if(trumpSuit == null && trick.getCardsPlayed().isEmpty()) { 
			//in the case of a non existing trump card and non existing played cards		
			nextCard = playerHand.getHighestCard();
			return nextCard;
		}
		//trump doesn't exist but played cards exist
		else if(trumpSuit == null && !trick.getCardsPlayed().isEmpty()){
			if(playerHand.matches(trick.getCardsPlayed().get(0).suit()).size() != 0) {
				nextCard = playerHand.getLowestCardFromSuit(trick.getCardsPlayed().get(0).suit());
				
				return nextCard; 
			}
		}
		else if(!trick.getCardsPlayed().isEmpty()) {
			//follow exisitng suit is more important than trump suit
			nextCard = playerHand.getLowestCard();
			if(playerHand.matches(trick.getCardsPlayed().get(0).suit()).size() != 0) {
				//if player has a card that matches the following suit
				nextCard = playerHand.getLowestCardFromSuit(trick.getCardsPlayed().get(0).suit());
				return nextCard; 
			}
			return nextCard; 
		} 
		
		//if no trump cards are availble 
		else if(playerHand.matches(trumpSuit).isEmpty()) {
			//only prioritise suits if there's matching ranks
			for(Card c: playerHand) {
				if(nextCard == null) {
					nextCard = c; 
				}
				if(c.rank().ordinal() > nextCard.rank().ordinal()) {
					nextCard = c; 
				}
				else if(c.rank().ordinal() == nextCard.rank().ordinal() 
						&& c.suit().ordinal() > nextCard.suit().ordinal()) {
					nextCard = c;
				}
			}
			return nextCard; 
		}
		//AI decides if it can trump it or discard it
		else if(!playerHand.matches(trumpSuit).isEmpty() 
				&& !trick.getCardsPlayed().isEmpty()
				&& trumpSuit == trick.getCardsPlayed().get(0).suit()){
			
			boolean canTrump = false;
			for(int i = 0; i < trick.getCardsPlayed().size(); i++) {
				//if you can trump the current trick trump it it
				//if you cant trump the current trick discard it
				if(trick.getCardsPlayed().get(i).compareTo(playerHand.getHighestCardFromSuit(trumpSuit)) < 0) {
					canTrump = true;
					}
			}
			if(canTrump) {return playerHand.getHighestCardFromSuit(trumpSuit);}
			else {return playerHand.getLowestCard();}
			
		}
		for(Card cardsP: playerHand.matches(trumpSuit)) {//follow trump suit 		
			if(nextCard == null) {nextCard = cardsP;}
			else if (cardsP.compareTo(nextCard) > 0) { 
				//if assigning cardsP to nextCard if it's bigger
				nextCard = cardsP; 
			}
			
		}
		
		
		//System.out.print("next card to string " + nextCard.toString());
		return nextCard;
		
	}	
		

}
	
