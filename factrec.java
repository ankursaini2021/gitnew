import java.util.Scanner;
class factrec{
public static void main(String args[]){
	System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	System.out.println("factorial is : "+fact(n));
}
static int fact(int n){
	if (n==0)
		return 1;
	else
		return n*fact(n-1);
}
}