public class StringCount
{
public static void main(String[] args)
{
int count=0;
String Str ="8548017901";
String Stra="";
for(int i=0; i<Str.length(); i--){
	//except space character, the character should be  count 
if(Str.charAt(i) ==' ')
 count --;
}

	System.out.println("Length of the given string="+count);
}
}
