package logica.Ingresos;
import java.util.*;

import bd.Dispositivo;
import bd.Vehiculo;
import bd.Ingreso;
import logica.Registros.registroDispositivos;
import logica.Registros.registroVehiculos;



public class registroIngreso {
    public static void main(String[] args) {

        registroVehiculos.main(args);
        registroDispositivos.main(args);


        List<Ingreso> listaIngresos = new LinkedList<>(); 

        int id_usuario=1;

        // instancias
        registroDispositivos registroDispositivos = new registroDispositivos();
        registroVehiculos registroVehiculo = new registroVehiculos();
        

        //lista proveniente de registro dispositivos
        List <Dispositivo> listaDispositivos = registroDispositivos.getListaDispositivos();                
        //lista de dispositivo por usuario
        List <Dispositivo> listaDispositivosU = new LinkedList<>();
        
    
        for (Dispositivo dispositivo : listaDispositivos) {

            if (dispositivo.getId_Usuario()==id_usuario) {

                listaDispositivosU.add(dispositivo);
                
            }
        }

        // lista proveniente de registro vehiculos
        List <Vehiculo> listaVehiculos = registroVehiculo.getListaVehiculos();
        //lista de vehiculos por usuario
        List <Vehiculo> listaVehiculosU = new LinkedList<>();



        for (Vehiculo vehiculo : listaVehiculos) {

            if (vehiculo.getId_Usuario()==id_usuario) {

                listaVehiculosU.add(vehiculo);
                
            }
        }


        System.out.println("lista dispositivos usuario"+listaDispositivosU);
            
        System.out.println("lista vehiculos usuario"+listaVehiculosU);

        
        boolean ingresoV = true;
        boolean ingresoD = true;
        String dispositivoEleccion = "";
        String vehiculoEleccion = "";   
        boolean intento = false;   


        do {
            
            if (!(listaDispositivosU.isEmpty())) {
                
                if (ingresoD==true) {
                    System.out.println("Ingrese el id del dispositivo");
                        Scanner scanner = new Scanner(System.in);
                        dispositivoEleccion = scanner.next();
    
                    for (Dispositivo dispositivo : listaDispositivosU) {

                        if (dispositivo.getId_dispositivo().equals(dispositivoEleccion)) {

                            System.out.println("Dispositivo encontrado");
                            intento = false;

                        }else{

                            System.out.println("vuelva a intentarlo");
                            intento = true;

                        }
                    }
                
                }else{
                    dispositivoEleccion = "";
                }            
            } 

        } while (intento==true);


        do {
            
            if (!(listaVehiculosU.isEmpty())) {
                
                if (ingresoV==true) {
                    System.out.println("Ingrese el id del vehiculo");
                        Scanner scanner = new Scanner(System.in);
                        vehiculoEleccion = scanner.next();
    
                    for (Vehiculo vehiculo : listaVehiculosU) {

                        if (vehiculo.getId_vehiculo().equals(vehiculoEleccion)) {

                            System.out.println("Vehiculo encontrado");
                            intento = false;

                        }else{

                            System.out.println("vuelva a intentarlo");
                            intento = true;

                        }
                    }
                
                }else{
                    vehiculoEleccion = "";
                }            
            } 

        } while (intento==true);
        

        listaIngresos.add(new Ingreso(id_usuario, String.valueOf(vehiculoEleccion), String.valueOf(dispositivoEleccion), "2021-10-10 10:10:10"));

        System.out.println(listaIngresos);
    }    
}
