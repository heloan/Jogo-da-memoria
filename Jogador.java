/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 29/05/2023
 * Autor: Heloan José Jacinto Marinho
 * Autor: Pedro Henrique Serpa Bechelli
 *
 * Turma: 7UNA Disciplina: Algoritmos Estrutura de Dados - II
 * Projeto Final - E referente ao 2 - Bimestre
 * ***************************************************************************************/


/**
 *
 * @author heloa
 */
public class Jogador {
    
    private String _nome;
    private int _pontos;
    private int _ranking;
    
    Jogador(String nome, int pontos){
        this._nome = nome;
        this._pontos = pontos;
        this._ranking = 0;
    }
    
    public int getPontos(){
        return this._pontos;
    }
    
    public int getRanking(){
        return this._ranking;
    }
    
    public String getNome(){
        return this._nome;
    }
    
    public void setRanking(int ranking){
        this._ranking = ranking;
    }
    
    @Override
    public String toString(){
        return this._ranking + " - " + this._nome + " - " + this._pontos;
    }
}
