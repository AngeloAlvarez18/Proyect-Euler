public class ejercicio10 {
    public static void main(String[] args){
        Prime prrimo = new Prime();

        System.out.println(prrimo.sum_of_primes(2000000));
    }
}

class Prime{

    boolean is_prime(long a){
        if (a <= 2){
            return true;
        }
        for(long i = 2; i < Math.ceil(Math.sqrt(a)) + 1; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    
    long sum_of_primes(long max){
        long total_sum = 0;
        for(long i = 2; i < max; i++){
            if(is_prime(i)){
                total_sum += i;
            }
        }
        return total_sum;
    }
}
