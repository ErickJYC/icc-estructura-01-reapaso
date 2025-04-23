package Views;

import Models.Persona;

public class ViewConsol {
    public void printPersona(Persona[]personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]+" || ");
        }

    }
}
