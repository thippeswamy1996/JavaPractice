public class CountOfString{
public static void main(String[] args){
String str1="8548017901";
int count=0;
for(int  i=0; i<str1.length(); i++)
{
if(str1.charAt(i)!=' '){
	count++;
}

}
System.out.println("Count of character in the given string "+count);
}
}