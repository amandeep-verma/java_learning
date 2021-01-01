package mar12.hw;
// markerpen extending pen class and adding info method to another method
public class MarkerPen3 extends Pen3 {
	String type = "permanent";

	void DispInfo() {
		Info();
		System.out.println("type is " + type);
	}

}
