import java.util.*;
public class Resistor_Color_Codes_Part2{
	public static void main(String[] args) {
		System.out.println(encodeResistorColors("4.7k ohms")); 
	}//yellow violet red gold
	public static String encodeResistorColors(String ohmsString) {
		String[] code = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};
		float ohmsNum = Float.parseFloat(ohmsString.replaceAll("([kM])? ohms",""));
		ohmsNum *= (ohmsString.contains("M")) ? 1000000 : ( (ohmsString.contains("k")) ? 1000 : 1 );
		int length = (int) (Math.log10(ohmsNum) + 1)-2;
		int ohm3 = (int) (ohmsNum/Math.pow(10, length));
		int ohm2 = ohm3 % 10;
		int ohm1 = ohm3/10;
		String color1 = code[ohm1]+" ";
		String color2 = code[ohm2]+" ";
		String color3 = code[length];
		return color1+color2+color3+" gold";
	}
}
/*
"4.7k ohms"      "yellow violet red gold"
"10 ohms"        "brown black black gold"
"100 ohms"       "brown black brown gold"
"220 ohms"       "red red brown gold"
"330 ohms"       "orange orange brown gold"
"470 ohms"       "yellow violet brown gold"
"680 ohms"       "blue gray brown gold"
"1k ohms"        "brown black red gold"
"10k ohms"       "brown black orange gold"
"22k ohms"       "red red orange gold"
"47k ohms"       "yellow violet orange gold"
"100k ohms"      "brown black yellow gold"
"330k ohms"      "orange orange yellow gold"
"2M ohms"        "red black green gold"
*/