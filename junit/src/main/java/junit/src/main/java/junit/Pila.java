package junit;
import java.util.Vector;

public class Pila implements Calculator, Stack{
    // atributos o propiedades
    Vector vector = new Vector(10,5); //vector inicial de 10 posicion y aumenta en 5
    double resultado=0; //resultado esperado para el usuario
    @Override
    public void add(Object item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Object remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calculate(String operation) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
