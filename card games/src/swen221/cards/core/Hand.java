package swen221.cards.core;

import java.io.Serializable;
import java.util.*;

/**
 * Represents a hand of cards held by a player. As the current round proceeds,
 * the number of cards in the hand will decrease. When the round is over, new
 * cards will be delt and added to this hand.
 * 
 * @author David J. Pearce
 * 
 */
public class Hand implements Cloneable, Iterable<Card>, Serializable {//needs to be Serializable in order to be deep cloned
	private SortedSet<Card> cards = new TreeSet<Card>();
	

	public Iterator<Card> iterator() {
		return cards.iterator();
	}
	
	/**
	 * Check with a given card is contained in this hand, or not.
	 * 
	 * @param card
	 * @return
	 */
	public boolean contains(Card card) {
		return cards.contains(card);
	}
	
	/**
	 * Return all cards in this hand which match the given suit.
	 * @param suit
	 * @return
	 */
	public Set<Card> matches(Card.Suit suit) {
		HashSet<Card> r = new HashSet<Card>();
		for(Card c : cards) {
			if(c.suit() == suit) {
				r.add(c);
			}
		}
		return r;
	}
	/**
	 * get the card to be discard in the case of not 
	 * being able to find a trumping card
	 * @return card
	 */
	public Card getLowestCard() {
		Card card = null; 
		for(Card c: cards) {
			if(card == null) {
				card = c; 
			}
			else if(c.compareTo(card) < 0) {
				card = c; 
			}
		}
		return card; 
	}
	/**
	 * getting the lowest card from the suit in the hand
	 * @param cs card from said suit
	 * @return lowest card from said suit
	 */
	public Card getLowestCardFromSuit(Card.Suit cs) {
		Card card = null; 
		List<Card> cardsFromSaidSuit = new ArrayList<>(this.matches(cs));
		for(Card c: cardsFromSaidSuit) {
			if(card == null) {
				card = c; 
			}
			else if(c.compareTo(card) < 0) {
				card = c; 
			}
		}
		
		return card; 
	}
	
	/**
	 * get the highest card in a player's hand in the case of
	 * not having an existing trump card. 
	 * @return card
	 */
	public Card getHighestCard() {
	
		Card card = null; 
		for(Card c: cards) {
			if(card == null) {
				card = c; 
			}
			else if(c.compareTo(card) > 0) {
				card = c; 
			}
		}
		//System.out.println("highest card " + card.toString());
		return card; 
	}
	
	/**
	 * getting the highest card from the suit in the hand
	 * @param cs card from said suit
	 * @return lowest card from said suit
	 */
	public Card getHighestCardFromSuit(Card.Suit cs) {
		Card card = null; 
		List<Card> cardsFromSaidSuit = new ArrayList<>(this.matches(cs));
		for(Card c: cardsFromSaidSuit) {
			if(card == null) {
				card = c; 
			}
			else if(c.compareTo(card) > 0) {
				card = c; 
			}
		}
		
		return card; 
	}
	
	/**
	 * Add a card to the hand.
	 */
	public void add(Card card) {		
		cards.add(card);
	}
	
	/**
	 * Remove a card from the hand.
	 */
	public void remove(Card card) {		
		cards.remove(card);
	}
	
	/**
	 * Get number of cards in this hand.
	 * 
	 * @return
	 */
	public int size() {
		return cards.size();
	}
	
	/**
	 * Remove all cards from this hand.
	 */
	public void clear() {
		cards.clear();
	}	
}
