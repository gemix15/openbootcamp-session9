public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.telefono = 675439728;
        cliente.nombre = "Maria";
        cliente.credito = 375;

        System.out.println("Datos del cliente:");
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Credito: " + cliente.credito);
        System.out.println("----------------------------------");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 35;
        trabajador.telefono = 653288197;
        trabajador.nombre = "Pedro";
        trabajador.salario = 4500;

        System.out.println("Datos del trabajador:");
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Salario: " + trabajador.salario);

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;

}

class Trabajador extends Persona {
    int salario;
}