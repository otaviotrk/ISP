package Modelos;
import Interfaces.trabalhador;

public class programador implements trabalhador {// Implementação da interface para um programador
    @Override
    public void trabalhar() {
        System.out.println("Programador trabalhando...");
    }

    @Override
    public void descansar() {
        System.out.println("Programador descansando...");
    }
}
