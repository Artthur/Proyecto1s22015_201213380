package Estructuras;

public class ArbolAvl{

public NodoAvl raiz;

public ArbolAvl(){

raiz = null;

}


public NodoAvl buscar(int id, NodoAvl raiz1){
if(raiz1==null){
  return null;
}
else if(raiz1.id==id){
     return raiz1;
} else if (raiz1.id<id){
        return buscar(id,raiz1.nodoDerecho);

} else {
      return buscar(id,raiz1.nodoIzquierdo);
}
}


public int traerFe(NodoAvl raiz2){

if (raiz2==null){
   return -1;
}else{
  return raiz2.fe;
}
}


public NodoAvl voltearIzquierda(NodoAvl r3){
NodoAvl aux = r3.nodoIzquierdo;
r3.nodoIzquierdo = aux.nodoDerecho;
aux.nodoDerecho=r3;
r3.fe=Math.max(traerFe(r3.nodoIzquierdo),traerFe(r3.nodoDerecho))+1;
aux.fe = Math.max(traerFe(aux.nodoizquierdo),traerFe(aux.nodoDerecho))+1;
return aux;
}


public NodoAvl voltearDerecha(NodoAvl r3){
NodoAvl aux = r3.nodoDerecho;
r3.nodoDerecho = aux.nodoIzquierdo;
aux.nodoIzquierdo=r3;
r3.fe=Math.max(traerFe(r3.nodoIzquierdo),traerFe(r3.nodoDerecho))+1;
aux.fe = Math.max(traerFe(aux.nodoizquierdo),traerFe(aux.nodoDerecho))+1;
return aux;
}

public NodoAvl voltearDosIzquierda(NodoAvl r4){
NodoAvl temp;
r4.nodoIzquierda=voltearDerecha(r4.nodIzquierdo);
temp = voltearIzquierda(r4);
return temp;

}

public NodoAvl voltearDosDerecha(NodoAvl r5){
NodoAvl temp;
r5.nodoDerecho=voltearIzquierda(r5.nodoDerecho);
temp = voltearDerecha(r5);
return temp;

}

public NodoAvl añadirNodo(NodoAvl nuevo, NodoAvl subRaiz){
NodoAvl Padrastro = subRaiz;
if(nuevo.id<subRaiz.id){
   if(subRaiz.nodoizquierdo==null){
      subRaiz.nodoIzquierdo=nuevo;
    }
    else{
     //  subRaiz.nodoIzquierdo=
               }
}
    return null;




}
}

























































