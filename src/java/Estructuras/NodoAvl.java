package estructuras;

public class NodoAvl{

int id, fe;
String correo,contraseña;
NodoAvl nodoIzquierdo,nodoDerecho;


public NodoAvl(int id,String correo,String contraseña){

this.correo = correo;
this.contraseña = contraseña;
this.id = id;
this.fe=0;
this.nodoIzquierdo=null;
this.nodoDerecho=null;


}
}
