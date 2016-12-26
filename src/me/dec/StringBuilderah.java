package me.dec;



public class StringBuilderah {
	// speed: 1D castmembers: x1: 9 y1: 18 z: 534
	public static String encode(String st){
		String string6 = st.replace("z1", "Nailed");
		String string7 = string6.replace("y1", "By");
		String string8 = string7.replace("x1", "ADeveloper");
		String string9 = string8.replace("0", "lolwasdeze");
		String string10 = string9.replace("121", "rekt");
		return string10;
	}
   //speed: 1D cast 1898 e 1898 2lolwasdeze16ers: A_Developer1: -rekt 2lolwasdezelolwasdeze11: lolwasdeze Nailed: lolwasdeze paradelength: -rekt
   // speed: 1D castmembers: x1: 9 y1: 18 z: 534
	public static String decode(String st) {

		String st2 = st.replace(",", ",");
		String string6 = st2.replaceAll("Nailed", "z1");
		String string7 = string6.replaceAll("By", "y1");
		String string8 = string7.replaceAll("ADeveloper", "x1");
		String string9 = string8.replaceAll("lolwasdeze", "0");
		String string10 = string9.replaceAll("rekt", "121");
		String string11 = string10.replaceAll("_", "");
		String string12 = string11.replaceAll("z1:", "");
		String string13 = string12.replaceAll("y1:", "");
		String string14 = string13.replaceAll("x1:", "");
		String string15 = string14.replaceAll("paradelength:", "");

		return string15;
	}

}
