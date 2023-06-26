/* ****************************************************************************************
 * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) (Univap)
 * Curso: Engenharia da Computação - Data de Entrega: 29/05/2023
 * Autor: Heloan José Jacinto Marinho
 * Autor: Pedro Henrique Serpa Bechelli
 *
 * Turma: 7UNA Disciplina: Algoritmos Estrutura de Dados - II
 * Projeto Final - E referente ao 2 - Bimestre
 * ***************************************************************************************/

public class Ranking {
    
    private ListaLigadaDupla _jogadores = new ListaLigadaDupla();
    
    public ListaLigadaDupla getJogadores(){
        return this._jogadores;
    }
    
    public void add(Jogador jogador){
        if(this._jogadores.tamanho() == 0){
            jogador.setRanking(1);
            this._jogadores.adiciona(jogador);
        }
        else {
            
            // Adiciona Jogador
            for (int i = 0; i < this._jogadores.tamanho(); i++) {
                Jogador aux = (Jogador) this._jogadores.pega(i);
                if (jogador.getPontos() > aux.getPontos()) {
                    if(i == 0) 
                        this._jogadores.adicionaNoComeco(jogador);
                    else
                        this._jogadores.adiciona(i, jogador);
                    
                    break;
                } else if (jogador.getPontos() == aux.getPontos()) {
                    this._jogadores.adiciona(i, jogador);                        
                    break;
                } else if (i == this._jogadores.tamanho()-1) {
                    this._jogadores.adiciona(jogador);
              
                    break;
                }
            }

            // Atualiza ranking
            for(int i=1; i<this._jogadores.tamanho(); i++){
                Jogador corrente = (Jogador)this._jogadores.pega(i);
                Jogador anterior = (Jogador)this._jogadores.pega(i-1);           
                if(i==1){
                    anterior.setRanking(1);
                }
                
                if(corrente.getPontos() == anterior.getPontos()){
                    corrente.setRanking(anterior.getRanking()); 
                } else {
                    corrente.setRanking(i+1);
                }                   
            }
        }
    }
}
