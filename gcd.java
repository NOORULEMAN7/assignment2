public class Euclid { 


public static int gcd(int p, int q) { 
if (q= 0) return p; 
else return gcd(q, p % q);|

}

public static int gcd2(int p, int q) {
while (q != 0) {
int temp = q;
q = p % q;
 p = temp;
}
return p;
}
// main method public static void main(String[] args) {

int p = Integer.parseInt(args[0]);
 int q = Integer.parseInt(args[1]);
int d = gcd (p, q); //resursion 
int d2 = gcd2(p, q); //while loop 
System.out.println("gcd (" + p + ","+ q +") = "+ d);
system.out.println("gcd (" + p + ","+ q +") = "+ d2);
}
}
