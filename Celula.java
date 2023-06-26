public class Celula {
	
	private Celula _proxima;
    private Celula _anterior;
    private Object _elemento;

    Celula(Celula proxima, Object elemento){
        _proxima = proxima;
        _elemento = elemento;
    }
    
    Celula(Object elemento){
        _elemento = elemento;
    }
    
    public void setAnterior(Celula anterior){
        _anterior = anterior;
    }
    
    public Celula getAnterior(){
        return this._anterior;
    }
    
    public void setProxima(Celula proxima){
        _proxima = proxima;
    }
    
    public Celula getProxima(){
        return this._proxima;
    }
    
    public Object getElemento(){
        return this._elemento;
    }
}
