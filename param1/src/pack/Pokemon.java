package pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pokemon {
	
	public static final int PRICE_PIKACHU = 6;
	public static final int PRICE_SQUIRTLE = 5;
	public static final int PRICE_CHARMANDER = 5;
	public static final String PIKACHU = "Pikachu";
	public static final String SQUIRTLE = "Squirtle";
	public static final String CHARMANDER = "Charmander";

	public static void main(String args[]) {
		
		for(int example = 1; example<9; example++){
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			double Total = 0;
			
			switch(example){
				case 1:
					hm.put(PIKACHU, 1);
					break;
				case 2:
					hm.put(PIKACHU, 2);
					break;
				case 3:
					hm.put(PIKACHU, 1);
					hm.put(SQUIRTLE, 1);
					break;
				case 4:
					hm.put(PIKACHU, 2);
					hm.put(SQUIRTLE, 2);
					break;
				case 5:
					hm.put(PIKACHU, 3);
					hm.put(SQUIRTLE, 3);
					break;
				case 6:
					hm.put(PIKACHU, 2);
					hm.put(SQUIRTLE, 1);
					break;
				case 7:
					hm.put(PIKACHU, 1);
					hm.put(SQUIRTLE, 1);
					hm.put(CHARMANDER,1);
					break;
				case 8:
					hm.put(PIKACHU, 2);
					hm.put(SQUIRTLE, 1);
					hm.put(CHARMANDER,1);
					break;
			}
			
			Iterator iterator = hm.entrySet().iterator();
			while (iterator.hasNext()) {
				double totaltemp = 0;
				if(hm.size() == 1){
					for (Map.Entry m : hm.entrySet()) {
						if(m.getKey().equals(PIKACHU)){
							totaltemp = totaltemp + PRICE_PIKACHU;
							hm.put(PIKACHU, (int)m.getValue() - 1);
						}
						if(m.getKey().equals(SQUIRTLE)){
							totaltemp = totaltemp + PRICE_SQUIRTLE;
							hm.put(SQUIRTLE, (int)m.getValue() - 1);
						}
						if(m.getKey().equals(CHARMANDER)){
							totaltemp = totaltemp + PRICE_CHARMANDER;
							hm.put(CHARMANDER, (int)m.getValue() - 1);
						}
					}
					Total = Total + totaltemp;
				}
				
				if(hm.size() == 2){
					for (Map.Entry m : hm.entrySet()) {
						if(m.getKey().equals(PIKACHU)){
							totaltemp = totaltemp + PRICE_PIKACHU;
							hm.put(PIKACHU, (int)m.getValue() - 1);
						}
						if(m.getKey().equals(SQUIRTLE)){
							totaltemp = totaltemp + PRICE_SQUIRTLE;
							hm.put(SQUIRTLE, (int)m.getValue() - 1);
						}
						if(m.getKey().equals(CHARMANDER)){
							totaltemp = totaltemp + PRICE_CHARMANDER;
							hm.put(CHARMANDER, (int)m.getValue() - 1);
						}
					}
					double discount = totaltemp * 0.10;
					Total = Total + (totaltemp - discount);
				}
				
				if(hm.size() == 3){
					for (Map.Entry m : hm.entrySet()) {
						if(m.getKey().equals(PIKACHU)){
							totaltemp = totaltemp + PRICE_PIKACHU;
							hm.put(PIKACHU, (int)m.getValue() - 1);
						}
						if(m.getKey().equals(SQUIRTLE)){
							totaltemp = totaltemp + PRICE_SQUIRTLE;
							hm.put(SQUIRTLE, (int)m.getValue() - 1);
						}
						if(m.getKey().equals(CHARMANDER)){
							totaltemp = totaltemp + PRICE_CHARMANDER;
							hm.put(CHARMANDER, (int)m.getValue() - 1);
						}
					}
					double discount = totaltemp * 0.20;
					Total = Total + (totaltemp - discount);
				
				}
				for(Iterator<Map.Entry<String,Integer>> it = hm.entrySet().iterator(); it.hasNext();){
				     Map.Entry<String, Integer> entry = it.next();
				     if(entry.getValue().equals(0)){
				    	 	it.remove();
						}
				}
				
				if(hm.isEmpty()){
					break;
				}
			}
			System.out.println("Final Total for example#" + example + " is: " + Total);
		}
	}
}
