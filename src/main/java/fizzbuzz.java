public class fizzbuzz {
    public String fz(int n){
        if(n%3==0){
            return "Fizz";
        }else if(n%5==0){
            return "Buzz";
        }
        else {
            return n+"";
        }
    }
}
