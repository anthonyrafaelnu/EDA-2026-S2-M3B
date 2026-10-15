package parcial1;

public class Parcial1 {

    public static void main(String[] args) {
        int[] v = {2, 3, 5, 6, 9};
        
        System.out.println("Hay repetidos: " + hayRepetidos(v));
    }
    
    public static boolean hayRepetidos(int[] vec){
        for (int i = 0; i < vec.length; i++) {
            for (int j = i + 1; j < vec.length; j++) {
                if(vec[i] == vec[j]) return true;
            }
        }
        
        return false;
    }
    
    public static boolean hayRepetidosV2(int[] vec){
        boolean[] aux = new boolean[21];
        
        for (int i = 0; i < vec.length; i++) {
            if(aux[vec[i]] == true) return true;
            aux[vec[i]] = true;
        }
        
        return false;
    }
    
    public static int minimoDiagonal(int[][] mat){
        int minimo = mat[0][0];
        
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][i] < minimo){
                minimo = mat[i][i];
            }
        }
        
        return minimo;
    }

    public static int cantFilasAsc(int[][] mat){
        int cantAsc = 0;
        boolean esAsc = true;
        
        for (int i = 0; i < mat.length; i++) {
            esAsc = true;
            
            for (int j = 0; j < mat[i].length - 1 && esAsc; j++) {
                if(mat[i][j] > mat[i][j + 1]){
                    esAsc = false;
                }
            }
            
            if(esAsc){
                cantAsc++;
            }
        }
        
        return cantAsc;
    }

    public static boolean existeDosColsSumanLoMismo(int[][] mat){
        int cantColumnas = mat[0].length;
        int[] aux = new int[cantColumnas];
        
        for (int col = 0; col < cantColumnas; col++) {
            int sumaCol = 0;
            for (int fila = 0; fila < mat.length; fila++) {
                sumaCol += mat[fila][col];
            }
            aux[col] = sumaCol;
        }
        
        for (int i = 0; i < aux.length; i++) {
            for (int j = i + 1; j < aux.length; j++) {
                if(aux[i] == aux[j]){
                    return true;
                }
            }
        }
        
        return false;
    }
}
