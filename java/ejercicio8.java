public class ejercicio8{
    public static void main(String[] args){
        String num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        int len_num = num.length();
        int gratest_product = 0;
        int actual_product;
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0;

        for(int i = 0, j; i < len_num - 12; i++){
            j = i+1;
            int index1 = Integer.parseInt("" + num.charAt(i));
            int index2 = Integer.parseInt("" + num.charAt(j++));
            int index3 = Integer.parseInt("" + num.charAt(j++));
            int index4 = Integer.parseInt("" + num.charAt(j++));
            int index5 = Integer.parseInt("" + num.charAt(j++));
            int index6 = Integer.parseInt("" + num.charAt(j++));
            int index7 = Integer.parseInt("" + num.charAt(j++));
            int index8 = Integer.parseInt("" + num.charAt(j++));
            int index9 = Integer.parseInt("" + num.charAt(j++));
            int index10 = Integer.parseInt("" + num.charAt(j++));
            int index11 = Integer.parseInt("" + num.charAt(j++));
            int index12 = Integer.parseInt("" + num.charAt(j++));
            int index13 = Integer.parseInt("" + num.charAt(j));

            actual_product = index1*index2*index3*index4*index5*index6*index7*index8*index9*index10*index11*index12*index13;
            if(actual_product > gratest_product){
                gratest_product = actual_product;
            }
        }

        for(int j = 0; j < len_num - 3; j++){
            
        }

        System.out.print(gratest_product);
    }
}