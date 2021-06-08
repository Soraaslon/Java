
public class Exer_2_deverdade {

	public static void main(String[] args) {
		
	// intValue, doubleValue e equals	
		
Integer hi = new Integer (15);
Integer you = new Integer (15);
Double hello = new Double (17.5);


int oi = hi.intValue();
double ola = hello.doubleValue();
System.out.println(oi);
System.out.println(ola);


System.out.println(you.equals(hi));
you = 43;
if (hi.equals(you)) { 
	System.out.println("blz");
}else
	System.out.println("não ta blz");

// valueOf

oi = 53;
hi = Integer.valueOf(oi);
System.out.println(hi);

// Parse Int e Double

String s = "12.34";
Double d = Double.parseDouble (s);
System.out.println(d);

String tatu = "54";
int rei = Integer.parseInt(tatu);
System.out.println(rei);

 
String ole = tatu.toString();
System.out.println(ole.toString());

}


}

