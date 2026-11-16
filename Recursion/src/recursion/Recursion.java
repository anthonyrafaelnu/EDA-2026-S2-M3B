package recursion;

public class Recursion {

    public static void main(String[] args) {
        //System.out.println(potencia(2,4));
        //mostrarDesc(4);
        //int[] array = {1, 2, 3, 4};
        //System.out.println("");
        int[][] mat = {{1, 2, 3}, 
                       {4, 5, 6}, 
                       {7, 8, 9}};
        
        diagonalPrincipal(mat);
    }
    
    /*
    PRE: base y exp son naturales, mayores a 0
    */
    public static int potencia(int base, int exp){
        if(exp == 1){ // Caso base (CB)
            return base;
        }else{
            return base * potencia(base, exp - 1);
        }
    }
    
    /*
        Muestra los números desde 1 hasta n de forma ascendente
    */
    public static void mostrarAsc(int n){
        if(n == 1){
            System.out.print(1 + " ");
        }else{
            mostrarAsc(n - 1);
            System.out.print(n + " ");
        }
    }
    
    /*
        Muestra los números desde n hasta 1 de forma descendente
    */
    public static void mostrarDesc(int n){
        if(n == 1){
            System.out.print(1 + " ");
        }else{
            System.out.print(n + " ");
            mostrarDesc(n - 1);
        }
    }
    
    /*
    POS: Retorna la suma de todos los elementos del vector
    */
    public static int sumaVector(int[] v){
        return sumaVectorAux(v, 0);
    }
    
    public static int sumaVectorAux(int[] v, int posV){
        if(posV == v.length - 1){
            return v[posV];
        }else{
            return v[posV] + sumaVectorAux(v, posV + 1);
        }
    }
    
    /*
    POS: Retorna el máximo valor del vector
    */
    public static int maximoValorVec(int[] v){
        return maximoValorVecAux(v, 1, v[0]);
    }
    
    public static int maximoValorVecAux(int[] v, int posV, int max){
        if(posV == v.length){
            return max;
        }else{
            if(v[posV] > max){
                max = v[posV];
            }
            
            return maximoValorVecAux(v, posV + 1, max);
        }
    }
    
    public static void diagonalPrincipal(int mat[][]){
        diagonalPrincipalAux(mat, 0);
    }
    
    public static void diagonalPrincipalAux(int mat[][], int pos){
        if(pos == mat.length - 1){
            System.out.println(mat[pos][pos] + " ");
        }else{
            System.out.println(mat[pos][pos] + " ");
            diagonalPrincipalAux(mat, pos + 1);
        }
    }
}
