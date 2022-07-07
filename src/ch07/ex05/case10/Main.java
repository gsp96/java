package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<AutoBot> corps = new ArrayList();
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(AutoBot autoBot: corps) {
			autoBot.run();
			autoBot.fight();
			
			if(autoBot instanceof Bumblebee) ((Bumblebee)autoBot).guard();
			if(autoBot instanceof Prime) ((Prime)autoBot).command();
		}
	}
}