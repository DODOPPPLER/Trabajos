package logica.Registros;

import java.util.*;
import bd.Vehiculo;

public class registroVehiculos {
        
    public static List<Vehiculo> listaVehiculos = new LinkedList<>();

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }


    public static void main(String[] args) {
        
        

        listaVehiculos.add(new Vehiculo("ABC123", "Toyota", "Corolla", "Rojo", "Automóvil", 1));
        listaVehiculos.add(new Vehiculo("XYZ789", "Honda", "Civic", "Azul", "Automóvil", 2));
        listaVehiculos.add(new Vehiculo("LMN456", "Ford", "Focus", "Negro", "Automóvil", 3));

        
    }
  
}

    

