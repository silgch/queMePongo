import java.awt.*;
import java.util.ArrayList;

public class TipoDePrenda {

   private String nombre;
   private Categoria categoria;
   private  ArrayList<Material> materialesValidos = new ArrayList<Material>();

    //La categoria dependera del tipo de prenda que estoy cargando
    public TipoDePrenda(String nombre, Categoria unaCategoria){
        this.nombre=nombre;
        this.categoria=unaCategoria;
    }



    public boolean esValidoMaterial(Material unMaterial){
        return  materialesValidos.contains(unMaterial);
    }

    public void agregarMaterialPermitido(Material unMaterial){
        //La validacion de los materiales, la realizaremos al crear la prenda.
        materialesValidos.add(unMaterial);
    }




    //Getters:
    public Categoria getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }


}
