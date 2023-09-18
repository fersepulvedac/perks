import java.io.*;
import java.util.ArrayList;

public class BaseDeDatos {
    
    public ArrayList cargaDatos(){
        File lista = new File("Perks.txt");
        ArrayList<String> rellenoPerk = new ArrayList<>();
        try{
            if (!lista.exists()){
                lista.createNewFile();
            }else{
                FileReader fr = new FileReader("Perks.txt");
                BufferedReader br = new BufferedReader(fr);
                String linea = br.readLine();
                while (linea != null){
                    rellenoPerk.add(linea);
                    linea = br.readLine();
                }
                br.close();
                fr.close();
            }
            
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
        
        return rellenoPerk;
    }
    
    
    public void agregarPerk(String perkNombre){
        try{
            FileReader fr = new FileReader("Perks.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linea = bf.readLine();
            while (linea != null){
                if (linea.equalsIgnoreCase(perkNombre)){
                    return;
                }
                linea = bf.readLine();
            }
            escribir(perkNombre.stripTrailing());
        }catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    
    public void escribir(String linea){
        try(FileWriter fw = new FileWriter("Perks.txt", true)){
            FileReader fr = new FileReader("Perks.txt");
            BufferedReader bf = new BufferedReader(fr);
            String line = bf.readLine();
            if (line == null){
                fw.write(linea);
            }else{
                fw.write("\n" + linea);
                fw.close();
            }
        }catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public void eliminar(SeleccionPerks perk){
        try{
            FileWriter fw = new FileWriter("Perks.txt");
            fw.write("");
            fw.close();
            for (Object perk1 : perk.getPerks()) {
                escribir(perk1.toString());
            }
        }catch(IOException ex){
            System.out.println("Error xd");
        }
    }
    
    
    
    public String capitalize(String palabra){
        palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase();
        return palabra;
    }
}
