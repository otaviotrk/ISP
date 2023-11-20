package Modelos;
import Interfaces.trabalhadorDescanso;

public class designerSegregado implements trabalhadorDescanso {// Implementação segregada para um designer
    @Override
    public void descansar() {
        System.out.println("Designer descansando...");
    }
}
