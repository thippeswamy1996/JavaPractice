public class Reversest{
 public static void main(String[] args){
  String str="Hello";
  String reversedstr="";
  
  for(int i=str.length()-1; i>=0; i--){
  reversedstr += str.charAt(i);
  }
  System.out.println(reversedstr);
  }
}
  