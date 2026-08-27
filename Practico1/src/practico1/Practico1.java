package practico1;

public class Practico1 {

    public static void main(String[] args) {
        //imprimirImpares();
        
        //int a = 5;
        //int b = a++;
        
        //System.out.println("a: " + a);
        //System.out.println("b: " + b);
        
        // a = 4, b = 1: 2 pares, promedio: 2,5
        //int a = 4;
        //int b = 1;
        //promYCantPares(a, b);
        //nImpares(5);
        
//        for (int i = 0; i < 3; i++) { //O(n^2)
//            for (int j = 0; j < 2; j++) {
//                System.out.print(j + " ");
//            }
//        }

        //imprimirNumero(1523);
        //System.out.println("Es palíndromo: " + esPalindromo("ABCCDA"));
        //fibonacci(7); //0 1 1 2 3 5 8
        
        trianguloNFilas(4);
    }
    
    private static void imprimirImpares(){ //O(2*n + 1) = O(n)
        for(int i = 1; i <= 50; i++){ //O(2*n)
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(""); //O(1)
    }
    
    private static void imprimirImparesV2(){ //O(n/2 + 1) = O(n * 1/2) = O(n)
        for(int i = 1; i <= 50; i+=2){ //O(n/2)
            System.out.print(i + " ");
        }
        System.out.println(""); //O(1)
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
    private static void nImpares(int n){ // O(n)
        
        int numImpar = 1; //O(1)
        
        for (int i = 0; i < n; i++) { //O(2n)
            System.out.print(numImpar + " ");
            numImpar += 2;
        }
        
        System.out.println(""); //O(1)
    }
    
    private static void imprimirNumero(int n){
        //String num = String.valueOf(n);
        String num = n + "";
        
        for (int i = 0; i < num.length(); i++) {
            System.out.print(num.charAt(i) + " ");
        }
        
        System.out.println("");
    }
    
    // ABCCBA
    private static boolean esPalindromo(String palabra){
        for (int i = 0; i < palabra.length() / 2; i++) {
            if(palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)){
                return false;
            }
        }
        
        return true;
    }
    
    private static boolean esPalindromoV2(String palabra){
        boolean esPalindromo = true;
        
        for (int i = 0; i < palabra.length() / 2 && esPalindromo; i++) {
            if(palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)){
                esPalindromo = false;
            }
        }
        
        return esPalindromo;
    }

    private static void fibonacci(int n){
        
        int a = 0;
        int b = 1;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a +  " ");
            sum = a + b; //5
            a = b; //3
            b = sum; //5
        }
    }
    
    public static void trianguloNFilas(int n){ // O(n^2)
        for (int i = 0; i < n; i++) { // Niveles
            for (int j = 0; j <= i; j++) { // *
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
