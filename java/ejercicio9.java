public class ejercicio9{
    public static void main(String[] args){
        Triplet test = new Triplet();
        test.find_triplets(10000);
    }
}

class Triplet{
    
    boolean is_triplet(int a, int b, int c){
        if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a){
            return true;
        }
        return false;
    }

    void find_triplets(int max){
        for(long i = 0; i < max-2; i++){
            for(long j = i+1; j < max-1; j++){
                for(long k = j +1; k < max; k++){
                    if(i*i + j*j == k*k){
                        if(i+j+k == 1000){
                            System.out.println(i + ", " + j + ", " + k + " = 1000");
                            System.out.println("and the product abc is: " + i*j*k);
                            return;
                        }
                    }
                }
            }
        }
    }
}