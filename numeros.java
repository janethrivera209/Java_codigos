import javax.swing.JOptionPane;

public class numeros {
    public static void main (String [] args){
        int valor1;
        valor1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor 1"));
        int valor2;
        valor2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor 2"));
   if (valor1>valor2){
        System.out.print("El numero mayor es :" +valor1);
    }   
   else{
       if (valor1<valor2) {
           System.out.print("El numero mayor es:" +valor2);
       }
       else{
           if (valor1==valor2) {
               System.out.print("Ambos valores son iguales, por favor intentalo de nuevo");
           }
       }
   }
    }
    
}
