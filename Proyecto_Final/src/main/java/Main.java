import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String usuario = "Hacker";
        String contraseña = "welcometothejungle";
        int intentos = 3;
        JOptionPane.showMessageDialog(null, "INGRESAR USUARIO Y CONTRASEÑA");
        do {
            String usuarioInput = JOptionPane.showInputDialog("INGRESAR USUSARIO");
            String contraseñaInput = JOptionPane.showInputDialog("INGRESAR CONTRASEÑA");
            if (usuario.equals(usuarioInput) && contraseña.equals(contraseñaInput)){
                JOptionPane.showMessageDialog(null,"BIENVENIDO HACKERCITO !!");
                break;
            } else {
                intentos = intentos - 1;
                if (intentos == 1){
                    JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTO");
                } else if ( intentos == 0) {
                    JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTO \n " + "SE LE ACABARON LOS INTENTOS");
                } else {
                    JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTO");
                }
            }
        } while (intentos!=0);

        }
    }

