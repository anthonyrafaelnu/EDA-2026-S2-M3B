package tadpila;

public class TADPila {

    public static void main(String[] args) {
        Pila p = new Pila();
        
        p.push(3);
        p.push(6);
        p.push(2);
        p.push(8);
        
        p.mostrar();
        
        System.out.println("top: " + p.top());
    }
    
    public static boolean balanceoParentesis(String exp){
        if(exp.length() % 2 != 0) return false;
    }
    
}
