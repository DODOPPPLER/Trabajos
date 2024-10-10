package logica.Registros;

import java.util.*;
import bd.Dispositivo;

public class registroDispositivos {

    public static List<Dispositivo> listaDispositivos = new LinkedList<>(); 

    public List<Dispositivo> getListaDispositivos() {
        return listaDispositivos;
    }

    public static void main(String[] args) {
        
        

        listaDispositivos.add(new Dispositivo("1", "Samsung", "Galaxy S10", "Negro", "Celular", 1));
        listaDispositivos.add(new Dispositivo("2", "Apple", "iPhone 12", "Blanco", "Celular", 2));
        listaDispositivos.add(new Dispositivo("3", "Xiaomi", "Mi 11", "Azul", "Celular", 3));

        

    }
    
}
