package bd;

public class Vehiculo {

    private String id_vehiculo;
    private String marca;
    private String modelo;
    private String color;
    private String descripcion;
    private int id_Usuario;
    
    public Vehiculo(){
        
    }

    public Vehiculo(String id_vehiculo, String marca, String modelo, String color, String descripcion, int id_Usuario) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.descripcion = descripcion;
        this.id_Usuario = id_Usuario;
        
    }

    public String getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(String id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "id_vehhiculo='" + id_vehiculo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", id_Usuario=" + id_Usuario +
                '}';
    }
}
