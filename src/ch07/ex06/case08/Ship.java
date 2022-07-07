package ch07.ex06.case08;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	List<Container<?>> containers = new ArrayList<>();
	
	public void put(Container<?> container) {
		containers.add(container);
	}

}
