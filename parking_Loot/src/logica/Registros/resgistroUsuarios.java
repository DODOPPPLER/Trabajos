package logica.Registros;

import java.util.*;
import bd.Usuario;

public class resgistroUsuarios {

    public static void main(String[] args) {

        List<Usuario> listaUsuarios = new LinkedList<>(); 

        listaUsuarios.add(new Usuario(1, "Juan", "Perez"));
        listaUsuarios.add(new Usuario(2, "Maria", "Gomez"));
        listaUsuarios.add(new Usuario(3, "Pedro", "Gonzalez"));

        for (Usuario usuario : listaUsuarios) {

            System.out.println(usuario.toString());
            
        }

    }
}
