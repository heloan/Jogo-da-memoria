/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 29/05/2023
 * Autor: Heloan José Jacinto Marinho
 * Autor: Pedro Henrique Serpa Bechelli
 *
 * Turma: 7UNA Disciplina: Algoritmos Estrutura de Dados - II
 * Projeto Final - E referente ao 2 - Bimestre
 * ***************************************************************************************/
import java.util.Random;

public class Recursos {
    
    // Gerador de numeros que não podem repedir duas vezes em uma lista
    public static int geradorAleatrioDeNumero(int min, int max, ListaLigadaDupla exclusions) {
        Random random = new Random();
        
        int randomNumber;
        boolean isExcluded;
        
        do {
            randomNumber = random.nextInt(max - min + 1) + min;
            
            isExcluded = false;
            int count = 0;
            for(int i=0; i<exclusions.tamanho(); i++){
                if (randomNumber == (int)exclusions.pega(i)) {
                    count++;
                }
            }
            if(count == 2)
                isExcluded = true;

        } while (isExcluded);
        
        return randomNumber;
    }
}
