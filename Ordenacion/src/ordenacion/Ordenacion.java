package ordenacion;

import java.util.Arrays;

public class Ordenacion {

    public static void main(String[] args) {
        int[] a = {34, 11, 5, 1, 3, 90};
        int[] b = {1, 3, 5, 11, 34, 90};
        
        //bubbleSortV2(b);
        insertionSort(a);
        
        System.out.println(Arrays.toString(a));
    }
    
    public static void bubbleSort(int[] array){
        
        int pasadas = 0;
        int intercambios = 0;
        
        for (int i = 0; i < array.length - 1; i++) {
            pasadas++;
            for (int j = 0; j < array.length - 1 - i; j++) {
                
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambios++;
                }
                
            }
        }
        
        System.out.println("Pasadas: " + pasadas + ", Intercambios: " + intercambios);
    }
    
    public static void bubbleSortV2(int[] array){
        
        int pasadas = 0;
        int intercambios = 0;
        boolean estaOrdenado = false;
        
        for (int i = 0; i < array.length - 1 && !estaOrdenado; i++) {
            pasadas++;
            estaOrdenado = true;
            
            for (int j = 0; j < array.length - 1 - i; j++) {
                
                if(array[j] > array[j + 1]){
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    intercambios++;
                    estaOrdenado = false;
                }
                
            }
        }
        
        System.out.println("Pasadas: " + pasadas + ", Intercambios: " + intercambios);
    }
    
    public static void selectionSort(int[] array){
        
        int pasadas = 0;
        int intercambios = 0;
        
        for (int i = 0; i < array.length - 1; i++) {
            pasadas++;
            int posMin = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[posMin]){
                    posMin = j;
                }
            }
            
            if(posMin != i){
                int aux = array[i];
                array[i] = array[posMin];
                array[posMin] = aux;
                intercambios++;
            }
        }
        
        System.out.println("Pasadas: " + pasadas + ", Intercambios: " + intercambios);
    }
    
    public static void selectionSortV2(int[] array){
        
        int pasadas = 0;
        int intercambios = 0;
        boolean estaOrdenado = false;
        
        for (int i = 0; i < array.length - 1 && !estaOrdenado; i++) {
            pasadas++;
            int posMin = i;
            estaOrdenado = true;
            
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[posMin]){
                    posMin = j;
                }
                if(array[j] < array[j - 1]){
                    estaOrdenado = false;
                }
            }
            
            if(posMin != i){
                int aux = array[i];
                array[i] = array[posMin];
                array[posMin] = aux;
                intercambios++;
            }
        }
        
        System.out.println("Pasadas: " + pasadas + ", Intercambios: " + intercambios);
    }
    
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            
            int insert = array[i];
            int j = i - 1;
            
            while(j >= 0 && insert < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = insert;
        }
    }
}