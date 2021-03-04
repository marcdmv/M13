package springBootInitialDemo.dto;

import java.util.ArrayList;

public class ProductosDAO2 {
    ArrayList<String> lista = new ArrayList<String>();
    public ProductosDAO2() {
        lista = new ArrayList<String>();
        lista.add(0,"manzanas");
        lista.add(1,"peras");
        lista.add(2,"fresas");
        lista.add(3,"naranjas");

    }
    public ArrayList<String> findAll(){

        return lista;
    }
    public void deleteById(int productoId){

        lista.remove(productoId);
    }
}
