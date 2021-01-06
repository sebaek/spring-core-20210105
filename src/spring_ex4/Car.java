package spring_ex4;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public Tire getTire() {
		return tire;
	}
}
