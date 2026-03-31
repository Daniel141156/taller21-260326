import java.util.*;
public class Taller21260326 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("Ingrese el tamaño de la lista: ");
        int n = sn.nextInt();
        System.out.println("Ingrese numeros entre 1 y el tamaño de la lista: ");
        for(int i=0; i<n-1;i++){
            int aux =sn.nextInt();
            if(aux<1 || aux>n){
                System.out.println("Ingrese un valor válido");
            }else{
        lista.Agregar(aux);
        }
        }    
        for(int i=1;i<n;i++){
        if(!lista.buscar(i)){
            System.out.println("El numero faltante es: "+i);
        }
    }
    }
}
