public class ReversStringPractice{
public static void main(String []args){
String str = "thippeswamy j";
 String stre="";
 //int count=0;
for( int i=str.length()-1 ;i>=0; i--)
{
stre =stre+str.charAt(i);
}


System.out.println("The revered String is ="+stre);
}
}