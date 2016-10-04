package del1;

import del1.Dice;
import desktop_resources.GUI;

public class DiceCup {

	Dice d1 = new Dice();
	Dice d2 = new Dice();
	
	/**
	 * rollDiceCup, rolls two dice adds the facevalues together and returns the value.
	 * @return
	 */
	public int rollDiceCup(){
		int v1 = d1.roll();
		int v2 = d2.roll();
		GUI.setDice(v1, v2);
		if (v1==v2 && v1+v2 !=2){
			int v3 = d1.roll();
			int v4 = d2.roll();
				if (v1+v2+v3+v4 == 24)
					System.out.println("WINNER WINNIER CHICKEN DINNER");
			return v1+v2+v3+v4;
		}
		return v1+v2;
	}


}

