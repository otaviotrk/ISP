package Modelos;
import Interfaces.trabalhador;

public class designer implements trabalhador { // Implementação da interface para um designer
    @Override
    public void trabalhar() {
        System.out.println("Designer trabalhando...");
    }

    @Override
    public void descansar() {
        System.out.println("Designer descansando...");
    }
}
