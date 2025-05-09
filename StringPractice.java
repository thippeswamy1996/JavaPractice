public class StringPractice{
public static void main(String []args){
java.lang.String str = "thippeswamy j";
 int count=0;
for( int i =0;i<str.length(); i++)
{
if(str.charAt(i)!=' ')
    {
        count++;
        }


}

}
System.out.println("The number of character in the given string "+count);
}