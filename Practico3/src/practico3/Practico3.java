package practico3;

public class Practico3 {

    public static void main(String[] args) {
        int[] array = {6,3,5,1,8,7,2,4};
        
        int[] arrayOrdenado = {2, 4, 6, 7, 8, 12, 21};
        
        //System.out.println("Array: " + mostrarv2(array));
        //System.out.println("Promedio: " + promedio(array));
        System.out.println("Valores impares: " + muestroValoresImpares(array));
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
        PRE: Recibo un array de enteros, no vacío y desordenado
        POS: Retorno true si existe el elemento, false en caso contrario
    */
    public static boolean buscarVec(int[] v, int elemento){
        for (int i = 0; i < v.length; i++) {
            if(v[i] == elemento) return true;
        }
        return false;
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
}
