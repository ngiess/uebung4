package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x=true, y=true, a=true, b=true, c=true;
		int input=11;
		//Eigenschaften
		if (input==10 || input==11) {
			x=true;}
		else x=false;
		if (input==11 || input==1) {
			y=true;}
		else y=false;
		if (x==true && y==true) {
			a=true;}
		else a=false;
		if (x==true || x!=y) {
			b=true;}
		else b=false;
		if (x==true && y==false || x==false && y==false) {
			c=true;}
		else c=false;
			System.out.print("x= "+x+", y= "+y+", a= "+a+", b= "+b+", c= "+c);
		}
	}
