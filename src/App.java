
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsol;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
                new Persona("Juan", 25),
                new Persona("Maria", 30),
                new Persona("Carlos", 22),
                new Persona("Ana", 28),
                new Persona("Luis", 35),
                new Persona("Sofia", 27),
                new Persona("Miguel", 40),
                new Persona("Laura", 32),
                new Persona("Pedro", 29),
                new Persona("Elena", 26)
        };
        /*
        Imprimir Aregro
         */
        PersonaController personaController = new PersonaController();
        ViewConsol viewConsol = new ViewConsol();

        System.out.println("Arreglo de persona");
        viewConsol.printPersona(personas);
        System.out.println();
        System.out.println("Arreglo ordenado por edad");
        personaController.ordenarPorEdad(personas);
        viewConsol.printPersona(personas);
        System.out.println();
        System.out.println("".repeat(30));
        System.out.println("Persona a buscar");

        Persona indexPersona = personaController.buscarPorEdad(personas,40);
        Persona indexPersona2 = personaController.buscarPorEdad(personas,90);

        if (indexPersona == null) {
            System.out.println("No se encontro ninguna persona con esa edad");
        } else {
            System.out.println("Persona con edad 40: " + indexPersona);
        }

        if (indexPersona2 == null) {
            System.out.println("No se encontro ninguna persona con esa edad");
        } else {
            System.out.println("Persona con edad 90: " + indexPersona2);
        }

    }
}
