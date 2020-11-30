public class Card {

    // Creating 2 fields - Value and Name
    private int value;
    private String name;

    public Card(int tempValue, String suit) {

    	value = tempValue;
    	
    	if (tempValue == 11) {
    		name = "J" + " of " + suit;
    	} else if (tempValue == 12) {
    		name = "Q" + " of " + suit;
    	} else if (tempValue == 13) {
    		name = "K" + " of " + suit;
    	} else if(tempValue == 14) {
    		name = "Ace" + " of " + suit;
    	} else {
    		name = Integer.toString(tempValue) + " of " + suit;
    	}
    }

    // method
    public void describe() {
        System.out.println(name);
    }
    
    // setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
   
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
