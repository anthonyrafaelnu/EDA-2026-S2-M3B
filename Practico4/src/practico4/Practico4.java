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

}
