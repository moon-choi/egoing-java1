//import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoHomeInput {

	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Enter an ID");
//		String bright = JOptionPane.showInputDialog("Enter an ID");
		String id = args[0]; //run configurations 의 arguments 탭에 세팅됀 값. 
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id); // import 됀 것. Elevator는 데이터 타입.
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + "/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + "/ Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + "/moodLamp");
		moodLamp.setBright(Integer.parseInt(bright));
		moodLamp.on();
		
	}

}
