import java.util.*;
public class Resistor_Color_Codes{
	public static void main(String[] args) {
		System.out.println(decodeResistorColors("yellow violet red gold")); 
	}//4.7k ohms, 5%
	public static String decodeResistorColors(String bands) {
		String[] colors = bands.split(" ");
		int ohms = findIndex(colors[0])*10;
		ohms += findIndex(colors[1]);
		ohms *= Math.pow(10,findIndex(colors[2]));
		int p = (colors.length < 4) ? 20 :
				( (findIndex(colors[3]) == 10) ? 5 : 10 );
		String str = (ohms >= 1000000) ? ( (ohms%1000000==0) ? ohms/1000000+"M ohms"
				: (double)ohms/1000000+"M ohms" ) : ( (ohms >= 1000) ? ( (ohms%1000==0) ? ohms/1000+"k ohms"
				: (double)ohms/1000+"k ohms") : ohms+" ohms");
		return str+", "+p+"%";
	}
	public static int findIndex (String color) {
		String[] code = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white", "gold"};
		return Arrays.asList(code).indexOf(color);
	}
}