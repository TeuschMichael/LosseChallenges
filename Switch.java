public class Switch {

	public static void main(String[] args) {
	String browser = "IE";
	
	switch (browser) {
		case "Edge":
		System.out.println("Je gebruikt Edge");
		break;
		case "Chrome":
		System.out.println("Je gebruikt een moderne browser");
		break;
		case "Firefox" :
		System.out.println("Je gebruikt een moderne browser");
		break;
		case "Opera" :
		System.out.println("Je gebruikt een moderne browser");
		break;
		case "IE" :
		System.out.println("Waarom gebruik je Internet Explorer?");
		break;
		default :
		System.out.println("Je gebruikt een niet onderstuende browser");
		}
	}
}