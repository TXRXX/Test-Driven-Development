public class fizzbuzz {
    public String fz(int n) {
        if(n>100||n<1){
            return "Invalid Value";
        }
        else if (n<=100 && n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n<=100 && n % 3 == 0) {
            return "Fizz";
        } else if (n<=100 && n % 5 == 0) {
            return "Buzz";
        }
        else{
            return n + "";
        }
    }

}
