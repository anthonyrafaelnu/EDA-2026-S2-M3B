package practico4;

public class Practico4 {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        
        //mostrarMatriz(mat);
        //mostrarDiagonalPrincipalV2(mat);
        //mostrarDiagonalInversa(mat);
        //mostrarColumna(mat, 2);
        mostrarColumnas(mat);
    }
    
    public static void mostrarMatriz(int[][] mat){ //O(n*m)
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarDiagonalPrincipal(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i == j){
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
    
    public static void mostrarDiagonalPrincipalV2(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);
        }
    }
    
    public static void mostrarDiagonalInversa(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][mat.length - 1 - i]);
        }
    }

    public static int maximoMatriz(int[][] mat){
        //int maximo = Integer.MIN_VALUE;
        int maximo = mat[0][0];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] > maximo){
                    maximo = mat[i][j];
                }
            }
        }
        
        return maximo;
    }
    
    public static void mostrarColumnas(int[][] mat){
        for (int col = 0; col < mat[0].length; col++) {
            for (int fila = 0; fila < mat.length; fila++) {
                System.out.println(mat[fila][col]);
            }
            System.out.println("");
        }
    }
    
    public static void mostrarColumna(int[][] mat, int columna){
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][columna]);
        }
    }
    
    public static void mostrarFila(int[][] mat, int fila){
        for (int i = 0; i < mat[fila].length; i++) {
            System.out.println(mat[fila][i]);
        }
    }
    
    public static void mostrarFilasImpares(int[][] mat){ // O(n*m)
        for (int i = 1; i < mat.length; i+=2) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static boolean buscarElementoEnMatriz(int[][] mat, int elemento){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == elemento) return true;
            }
        }
        return false;
    }
    
    public static boolean buscarEnColumna(int[][] mat, int columna, int elemento){
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][columna] == elemento) return true;
        }
        return false;
    }
    
    public static void mostrarSumaCol(int[][] mat){
        int sumaCol = 0;
        
        for (int col = 0; col < mat[0].length; col++) {
            sumaCol = 0;
            for (int fila = 0; fila < mat.length; fila++) {
                sumaCol += mat[fila][col];
            }
            System.out.print(sumaCol + " ");
        }
    }
    
    /*  FUNCIÓN AUXILIAR
        PRE: -
        POS: Retorna la suma de una fila
    */
    public static int sumaFila(int[] vec){
        int suma = 0;
        for (int i = 0; i < vec.length; i++) {
            suma += vec[i];
        }
        return suma;
    }
    
    public static int filaMayorSuma(int[][] mat){ //O(n*m)
        int mayorSuma = sumaFila(mat[0]);
        int fila = 0;
        
        for (int i = 1; i < mat.length; i++) {
            int sumaFila = sumaFila(mat[i]);
            if(sumaFila > mayorSuma){
                mayorSuma = sumaFila;
                fila = i;
            }
        }
        
        return fila;
    }
    
    /*  FUNCIÓN AUXILIAR
        PRE: -
        POS: Retorna true si el array es simétrico, false en caso contrario.
    */
    public static boolean esSimetrico(int[] v){
        for (int i = 0; i < v.length / 2; i++) {
            if(v[i] != v[v.length - 1 - i]) return false;
        }
        return true;
    }
    
    public static int esPalindroma (int[][] mat){
        for (int i = 0; i < mat.length; i++) { //O(n*m)
            if(esSimetrico(mat[i])){
                return i;
            }
        }
        return -1;
    }

}
