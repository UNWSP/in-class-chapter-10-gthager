
public class DemoHorses {
	public static void main(String[] args) {
		Horse horse1 = new Horse("Moon", "White", 1989);
		RaceHorse horse2 = new RaceHorse("Secretariat", "Brown", 1970, 21);
		System.out.println("Name: " + horse1.getName() + " Color: " + horse1.getColor() + " Year: " + horse1.getBirthYear());
		System.out.println("Name: " + horse2.getName() + " Color: " + horse2.getColor() + " Year: " + horse2.getBirthYear() + " Races: " + horse2.getRaces());
	}
}
