import Interfaces.trabalhador;
import Interfaces.trabalhadorDescanso;
import Interfaces.trabalhadorTrabalho;
import Modelos.designer;
import Modelos.designerSegregado;
import Modelos.programador;
import Modelos.programadorSegregado;

public class main {
    public static void main(String[] args) {
        // Exemplo usando Programador
        trabalhador programador = new programador();
        programador.trabalhar();
        programador.descansar();

        System.out.println("------------------------");

        // Exemplo usando Designer
        trabalhador designer = new designer();
        designer.trabalhar();
        designer.descansar();

        System.out.println("------------------------");

        // Exemplo usando ProgramadorSegregado
        trabalhadorTrabalho programadorSegregado = new programadorSegregado();
        programadorSegregado.trabalhar();

        System.out.println("------------------------");

        // Exemplo usando DesignerSegregado
        trabalhadorDescanso designerSegregado = new designerSegregado();
        designerSegregado.descansar();
    }
}
