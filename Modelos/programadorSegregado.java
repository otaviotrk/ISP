package Modelos;
import Interfaces.trabalhadorTrabalho;

public class programadorSegregado implements trabalhadorTrabalho {// Implementação segregada para um programador
    @Override
    public void trabalhar() {
        System.out.println("Programador trabalhando...");
    }
}
