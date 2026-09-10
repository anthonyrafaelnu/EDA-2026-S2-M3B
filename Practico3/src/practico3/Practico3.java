package practico3;

public class Practico3 {

    public static void main(String[] args) {
        int[] array = {6,3,5,1,8,7,2,4};
        
        int[] arrayOrdenado = {2, 4, 6, 7, 8, 12, 21};
        
        //System.out.println("Array: " + mostrarv2(array));
        //System.out.println("Promedio: " + promedio(array));
        //System.out.println("Valores impares: " + muestroValoresImpares(array));
        System.out.println(muestroPosPares(array));
        //System.out.println("Pertenece: " + buscarVecV2(arrayOrdenado, 22));
    }
    
    /*
        PRE: -
        POS: Retorna un string con los valores del vector,
             en el mismo orden que aparecen en el array y
             separados por un " - ".
             El último número no debe tener un " - " a la derecha.
    */
    public static String mostrarv(int[] v){ // O(n)
        String ret = v[0] + ""; // O(1)
        
        for (int i = 1; i < v.length; i++) { // O(n)
            ret += " - " + v[i];
        }
        
        return ret; // O(1)
    }
    
    public static String mostrarv2(int[] v){
        String ret = "";
        
        for (int i = 0; i < v.length - 1; i++) {
            ret += v[i] + " - ";
        }
        
        ret += v[v.length - 1];
        return ret;
    }
    
    /*
        PRE: -
        POS: Retorna el promedio de los datos de v
    */
    public static double promedio(int []v){
        double suma = 0;
        int cantDatos = v.length;
        
        for (int i = 0; i < cantDatos; i++) {
            suma += v[i];
        }
        
        return suma/cantDatos;
    }
    
    public static String muestroValoresImpares(int v[]){
        String ret = "";
        
        for (int i = 0; i < v.length; i++) {
            if(v[i] % 2 != 0){
               ret += v[i] + " "; 
            }
        }
        
        return ret;
    }
    
    /*
        PRE: -
        POS: Retorna un string que muestra los datos en las posiciones pares de array
    */
    public static String muestroPosPares(int v[]){ // O(n)
        String ret = ""; // O(1)
        
        for (int i = 0; i < v.length; i+=2) { // O(n/2)
            ret += v[i] + " ";
        }
        
        return ret; // O(1)
    }
    
    public static String muestroPosParesV2(int v[]){
        String ret = "";
        
        for (int i = 0; i < v.length; i++) {
            if(i % 2 == 0){
                ret += v[i] + " ";
            }
        }
        
        return ret;
    }
    
    /*
        PRE: Recibo un array desordenado
        POS: Retorno el elemento más grande de ese array
    */
    public static int maxVec(int[] v){
        int max = v[0];
        
        for (int i = 1; i < v.length; i++) {
            if(v[i] > max){
                max = v[i];
            }
        }
        
        return max;
    }
    
    /*
        PRE: Recibo un array ordenado asc
        POS: Retorno el elemento más grande de ese array
    */
    public static int maxVecV2(int[] v){
        return v[v.length - 1];
    }
    
    /*
        PRE: -
        POS: Retorna true si el array es simétrico, false en caso contrario.
    */
    public static boolean esSimetrico(int[] v){
        for (int i = 0; i < v.length / 2; i++) {
            if(v[i] != v[v.length - 1 - i]) return false;
        }
        return true;
    }
    
    public static boolean esSimetricoV2(int[] v){
        int inicio = 0;
        int fin = v.length - 1;
        
        while(inicio < fin){
            if(v[inicio] != v[fin]) return false;
            
            inicio++;
            fin--;
        }
        
        return true;
    }
    
    /*
    PRE: Recibo un array de enteross y dos posiciones válidas, 
         donde posDesde <= posHasta.
    POS: Retorno la posición donde se encuentra el mínimo entre esas
         dos posiciones, inclusive.
    */
    public static int posMinVec(int []v,int posDesde, int posHasta){
        int min = v[posDesde];
        int posMin = posDesde;
        
        for (int i = posDesde + 1; i <= posHasta; i++) {
            if(v[i] < min){
                min = v[i];
                posMin = i;
            }
        }
        
        return posMin;
    }
    
    /*
        PRE: Recibo un array de enteros, no vacío y ordenado asc
        POS: Retorno true si existe el elemento, false en caso contrario
    */
    public static boolean buscarVecV2(int[] v, int elemento){
        int inicio = 0;
        int fin = v.length - 1;
        
        while(inicio <= fin){
            int medio = (inicio + fin) / 2;
            
            if(v[medio] == elemento){
                return true;
            } else if(elemento > v[medio]){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        }
        
        return false;
    }
    
    public static void ordenarVec(int[] v){ // O(n^2)
        for (int i = 0; i < v.length; i++) {
            int posMin = posMinVec(v, i, v.length - 1);
            
            // swap
            int aux = v[i];
            v[i] = v[posMin];
            v[posMin] = aux;
        }
    }
}
