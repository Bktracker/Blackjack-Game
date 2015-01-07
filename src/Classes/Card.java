/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author BK
 */
public class Card implements Serializable {

    /**
     * Suit of card
     */
    private int suit;

    /**
     * Rank of card
     */
    private int rank;

    /**
     * Card icon
     */
    private String CardFaceIcon;

    /**
     * Value of card
     */
    private int value;

    /**
     * True - Card is faced up
     */
    private Boolean side;

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.suit != other.suit) {
            return false;
        }
        if (this.rank != other.rank) {
            return false;
        }
        if (!Objects.equals(this.side, other.side)) {
            return false;
        }
        if (!Objects.equals(this.CardFaceIcon, other.CardFaceIcon)) {
            return false;
        }
        if (this.value != other.value) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "\nCard{" + "suit=" + suit + ", rank=" + rank + ", side=" + side + ", CardFaceIcon=" + CardFaceIcon + ", value=" + value + "}";
    }

    /**
     *
     * @param suit
     * @param rank
     * @param side
     * @param CardFaceIcon
     * @param value
     */
    public Card(int suit, int rank, Boolean side, String CardFaceIcon, int value) {
        this.suit = suit;
        this.rank = rank;
        this.side = side;
        this.CardFaceIcon = CardFaceIcon;
        this.value = value;
    }

    /**
     *
     * @return
     */
    public int getSuit() {
        return suit;
    }

    /**
     *
     * @return
     */
    public Boolean isSide() {
        return side;
    }

    /**
     *
     * @return
     */
    public String getCardFaceIcon() {
        if (!this.isSide()) {
            return "/Package/images/Cards/resize to 90X135/Back.png";
        } else {
            return CardFaceIcon;
        }
    }

    /**
     *
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @param rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     *
     * @param suit
     */
    public void setSuit(int suit) {
        this.suit = suit;
    }

    /**
     *
     * @param side
     */
    public void setSide(Boolean side) {
        this.side = side;
    }

    /**
     *
     * @param CardFaceIcon
     */
    public void setCardFaceIcon(String CardFaceIcon) {
        this.CardFaceIcon = CardFaceIcon;
    }

    /**
     *
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }
}
