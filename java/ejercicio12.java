public class ejercicio12 {
    public static void main(String[] args){
        TriangularNumbers factor = new TriangularNumbers();
        System.out.println(factor.check_factors_triangulars());
    }
}

class TriangularNumbers{
    int check_num_factors(int num){
       int num_factors = 0;
       for(int i = 1; i < Math.floor(num) + 1; i++) {
            if(num % i == 0){
                num_factors++;
            }
       }
       return num_factors;
    }

    int check_factors_triangulars(){
        boolean flag = false;
        int triangular_number = 0;
        int count = 1000;
        while(!flag){
            triangular_number = (count*(count+1))/2;
            count++;
            if(check_num_factors(triangular_number) >= 500){
                flag = true;
            }
        }
        return triangular_number;
    }
} 