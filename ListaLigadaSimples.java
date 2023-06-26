public class ListaLigadaSimples {

    protected Celula _primeira;
    protected Celula _ultima;
    protected int _total = 0;
    
    public int getTotal(){
        return this._total;
    }
    
    public int tamanho(){
        return getTotal();
    }
    
    public void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(this._primeira, elemento);
        this._primeira = nova;
        
        if(this._total == 0)
            this._ultima = nova;
        
        this._total++;
    }
    
    public void adiciona(Object elemento) {
        if(this._total == 0)
            this.adicionaNoComeco(elemento);
        else {
            Celula nova = new Celula(elemento);
            this._ultima.setProxima(nova);
            this._ultima = nova;
            this._total++;
        }
    }
    
    @Override
    public String toString(){
        if(this._total == 0)
            return "[]";
        else {
            StringBuilder builder = new StringBuilder("[");
            Celula atual = this._primeira;
            for(int i = 0; i < this._total; i++){
                builder.append(atual.getElemento());
                if(i != this._total - 1) builder.append(", ");
                atual = atual.getProxima();
            }
            builder.append("]");
            return builder.toString();
        }
    }
    
    public boolean EstaVazia(){
        return this._total == 0;
    }
    
    public boolean posicaoOcupada(int index){
        return index < this.tamanho() && index >= 0;
    }
    
    public Celula pegaCelula(int index){
        if(!posicaoOcupada(index))
            throw new IllegalArgumentException("Posição não existe");
        else {
            Celula atual = this._primeira;
            for(int i = 0; i < index; i++)
                atual = atual.getProxima();
            return atual;
        }
    }
    
    public Object pega(int index) {
        return pegaCelula(index).getElemento();
    }
    
    public void removeDoComeco() {
        if(!posicaoOcupada(0))
            throw new IllegalArgumentException("Posição não existe");
        else {
            this._primeira = this._primeira.getProxima();
            this._total--;
            if(this.EstaVazia())
                this._ultima = null;
        }
    }
    
}
