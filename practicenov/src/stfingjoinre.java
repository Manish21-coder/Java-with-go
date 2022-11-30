
import java.util.StringJoiner;
/**
 * @author MANISH KUMAR RAGHAV
 *
 */
public class stfingjoinre {
	
	public static void main(String[] args) {
		StringJoiner sc = new StringJoiner(",","[","]");
		sc.add("Manish kumar").add("is movies for delhi");
		System.out.println(sc);
	}

}
