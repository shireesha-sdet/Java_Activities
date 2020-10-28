package actJava;

public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Sec = 1000000000;
		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
		System.out.println("Age on Mercury: " + Sec / EarthSeconds / MercurySeconds);
        System.out.println("Age on Venus: " + Sec / EarthSeconds / VenusSeconds);
        System.out.println("Age on Earth: " + Sec / EarthSeconds);
        System.out.println("Age on Mars: " + Sec / EarthSeconds / MarsSeconds);
        System.out.println("Age on Jupiter: " + Sec / EarthSeconds / JupiterSeconds);
        System.out.println("Age on Saturn: " + Sec / EarthSeconds / SaturnSeconds);
        System.out.println("Age on Uranus: " + Sec / EarthSeconds / UranusSeconds);
        System.out.println("Age on Neptune: " + Sec / EarthSeconds / NeptuneSeconds);

	}

}
