package boletin.pkg21;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class OrdenarAlfabeticamente {
  
    private final String[] palabras = new String[10];
    
    public void cargarArray(){
        for(int i=0;i<palabras.length;i++){
            palabras[i]=JOptionPane.showInputDialog("Palabra");
        }
    }
    
    public void ordenarPalabras(){
        Arrays.sort(palabras);
    }
    
    public void guardarFichero(){
        ordenarPalabras();
        PrintWriter escritor=null;
        try{
            escritor = new PrintWriter(new File("/home/local/DANIELCASTELAO/slagogonzalez/Documentos/Prog/Boletines 2ª/Boletín 21/Boletin 21/src/boletin/pkg21/words.txt"));
            for(int i=0;i<palabras.length;i++){
               
               // escritor.println(i+1 + " " + palabras[i]);
                escritor.println(palabras[i]);
            }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"NOT FOUND");
        }finally{
            escritor.close();
        }
    }
}

