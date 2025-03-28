import javax.swing.JOptionPane;//importando clase
public class Suma {//creando clase
    public static void main(String[] ejercicio2){
        long suma;
        int valor, g;
        byte r;
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog("ingresa un valor entero"));
            suma = valor;
            r=1;
            r++;
            for (g =valor-2; g>=0;g=g-2){
                suma+=g;
                suma = suma * (g + 1 );
                System.out.println(suma+".");
            }
            //Mensaje "si quieres ejecutar el programa nuevamente presionar 1"
            r=Byte.parseByte (JOptionPane.showInputDialog("si quieres ejecutar el programa nuevamente presiona 1"));
        }while(r==1);
        }
    }
      
