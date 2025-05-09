public class GenerateFloydTriangle{
public  static void FloydTriangle(int rows){
int num=1;
for(int i=1; i<=rows; i++){
for(int j=1;j<i; j++){
System.out.println(num+ "");
num++;
}
System.out.println();
}
}
public static void main(String[] orgs){
FloydTriangle(5);
System.out.println("this is my first floyed triangle program");
}
}