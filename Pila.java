package junit;

import java.util.Vector;

public class Pila implements Calculator, Stack {
    Vector vector = new Vector<>(10,5); // vector con 10 espacios disponibles y aumenta en 5 al pasar el limite
    double resultado; // valor que se actualiza 
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
