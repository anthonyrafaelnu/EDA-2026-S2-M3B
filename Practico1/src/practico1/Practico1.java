package practico1;

public class Practico1 {

    public static void main(String[] args) {
        //imprimirImpares();
        
        //int a = 5;
        //int b = a++;
        
        //System.out.println("a: " + a);
        //System.out.println("b: " + b);
        
        // a = 4, b = 1: 2 pares, promedio: 2,5
        int a = 4;
        int b = 1;
        //promYCantPares(a, b);
        nImpares(5);
    }
    
    private static void imprimirImpares(){
        for(int i = 1; i <= 50; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    
    private static void imprimirImparesV2(){
        for(int i = 1; i <= 50; i+=2){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    private static void promYCantPares(int a, int b){
        double prom = ((double)a + b) / 2;
        
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        int cantPares = 0;
        
        for (int i = min; i <= max; i++) {
            if(i%2 == 0){
                cantPares++;
            }
        }
        
        System.out.println("Promedio: " + prom);
        System.out.println("Cant pares: " + cantPares);
    }
    
    // n = 5: 1 3 5 7 9
    private static void nImpares(int n){
        
        int numImpar = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(numImpar + " ");
            numImpar += 2;
        }
        
        System.out.println("");
    }
}
