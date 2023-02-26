package javaSuperKeyword;

class Bike {
	int maxSpeed = 220;
}

class Honda extends Bike {
	int maxSpeed = 350;

	void displayMaxSpeed(int maxSpeed) {
		System.out.println("Bike class maxspeed : " + super.maxSpeed);
		System.out.println("Honda class maxspeed : " + this.maxSpeed);
		System.out.println("Honda class local maxspeed : " + maxSpeed);
	}
}

public class SuperKeyword2 {

	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.displayMaxSpeed(300);
	}

}
