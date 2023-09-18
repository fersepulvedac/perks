import java.util.ArrayList;
import java.util.Random;

public class SeleccionPerks {
    
    private ArrayList<String> perks;
    // Constructor
    
    public SeleccionPerks(){
        
    }
    
    public SeleccionPerks(ArrayList<String> perks){
        this.perks = perks;
    }
    
    // getter
    
    public ArrayList getPerks(){
        return this.perks;
    }
    
    // setter
    
    public void setPerks(ArrayList<String> perks){
        this.perks = perks;
    }
    
    public String seleccion(){
        Random valorAleatorio = new Random();
        int numero = valorAleatorio.nextInt(perks.size());
        return perks.get(numero);
    }
}

