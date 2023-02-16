package eva1_5_circulo;
//importamos el paquete de JAVA JOptionPane para que funcione el experimento 
import javax.swing.JOptionPane;
public class EVA1_5_CIRCULO {
    public static void main(String[] args) {
        circulo operaciones = new circulo();
        operaciones.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor del radio: ")));
        operaciones.setResulp(operaciones.getRadio()*2*Math.PI);
        operaciones.setArea(Math.PI*Math.pow(operaciones.getRadio(), 2));
        operaciones.mostrarDatos();
    }
    
}
