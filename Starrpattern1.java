public class Starrpattern1{
	public static void fibo(int n) {
		int a=0, b=1, f=0;
		for(int i=0; i<10 ; i++){
			System.out.println(a);
			f=a+b;
			a=b;
			b=f;
		}
	}
public static void main(String [] orgs){
int i ;
int j;
for( i=1;i<=5;i++){
for( j=1;j<=i; j++){
	System.out.print("* ");
}
System.out.println();
}

fibo(20);

}
}
