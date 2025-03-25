import javax.swing.JOptionPane;

public class ejercicio6 {
    public static void main (String [] args) {
        System.out.println("Numero par o impar");
        int N;
        N=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
        int A=2;
        int residuo=N%A;
        if (residuo==0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar ");
        }
    } 
    
}
