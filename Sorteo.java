import javax.swing.JOptionPane;//importando paquete
public class Sorteo {//creando clase
    public static void main (String [] Ejerciciosorteo){//metodo principal
        byte x;
        x=Byte.parseByte (JOptionPane.showInputDialog("teclee el numero que corresponda a su seleccion \n"+ "1.Bola Roja 2.Bola Verde 3.Bola blanca"));
        double v;
        v=Double.parseDouble (JOptionPane. showInputDialog("ingrese el valor total de tu compra"));
        switch (x){
            case 1://50%
                v*=0.05;
                break;
            case 2://25%
                v*=0.75;
                break;
            case 3://5%
                v*=0.95;
                break;
            default:
                JOptionPane.showMessageDialog
                        (null,"valor no valido, ingresa el numero que se te indica");
                return;
        }
        JOptionPane.showMessageDialog
                (null,"la cantidad a pagar es" + v);
                        
        }
    }