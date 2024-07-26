package placement.training.day1;

public class Prime {
    public static boolean isPrime(int n){
        if(n<=0){
            return false;
        }

        boolean ans = true;
        for (int i = 2; i <= Math.sqrt((double) n); i++) {
            if(n % (i)==0) {
                ans = false;
                break;
            }
        }
        return  ans;
    }
}
