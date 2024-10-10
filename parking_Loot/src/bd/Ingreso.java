package bd;

public class Ingreso {
    private int id_Usuario;    
    private String id_vehiculo;    
    private String id_dispositivo;
    private String fecha_hora;

    public Ingreso() {
    }

    public Ingreso(int id_Usuario, String id_vehiculo, String id_dispositivo, String fecha_hora) {
        this.id_Usuario = id_Usuario;
        this.id_vehiculo = id_vehiculo;
        this.id_dispositivo = id_dispositivo;
        this.fecha_hora = fecha_hora;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }
    
    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(String id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(String id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Override
    public String toString() {
        return "Ingreso{" +
                "id_Usuario=" + id_Usuario +
                ", id_vehiculo='" + id_vehiculo + '\'' +
                ", id_dispositivo='" + id_dispositivo + '\'' +
                ", fecha_hora='" + fecha_hora + '\'' +
                '}';
    }
    
}
