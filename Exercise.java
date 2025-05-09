import java.util.ArrayList;
import java.util.List;
public class Exercise {



    public static void main(String[]args){

    }
    public String[] fizzBuzz(int n) {
        // write your code here
        List<String> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                answer.add("FizzBuzz");
            }
            else if(i%3==0){
                answer.add("Fizz");
                
            }
            else if(i%5==0){
                answer.add("Buzz");
            }
            else{
                 answer.add(Integer.toString(i));
            }
           

        } 
             return answer.toArray(new String[0]);
        
    }
   
}
