package datapath;

public class Mux {
	public static String stringMutiplexor(String a, String b, String control) {
		if (control.equals("0")) {
			return a;
		} else {
			return b;
		}
	}
}
