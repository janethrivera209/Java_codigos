import javax.swing.JOptionPane;//imporando paquete
public class Factorial {//creando clase
    public static void main(String [] ejercicio){
        long suma;
        int valor, g;
        byte r;
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog("ingresa un valor entero"));
            suma = valor;
            r=1;
            r++;
            for (g=valor-1; g>1; g--){
                suma = suma * g;
                System.out.println(suma+".");
            }
            //Mensaje "si quieres ejecutar el programa nuevamente presiona 1"
            r=Byte.parseByte (JOptionPane.showInputDialog("si quieres ejecutar el programa nuevamente presiona 1"));
        }while(r==1);
        }
    }