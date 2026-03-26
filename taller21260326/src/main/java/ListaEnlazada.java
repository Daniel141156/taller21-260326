public class ListaEnlazada {
    private Nodo cabeza;
    public ListaEnlazada (){
        cabeza = null;
    }
    public void Agregar(int dato){
        Nodo nuevo = new Nodo(dato);
        if(cabeza==null){
            cabeza=nuevo;
        } else {
            Nodo actual = cabeza;
            while(actual.sig !=null){
                actual=actual.sig;
            }
            actual.sig=nuevo;
                }
        
    }
}
