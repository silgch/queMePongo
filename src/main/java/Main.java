import prenda.Categoria;
import prenda.Material;
import prenda.Prenda;
import prenda.TipoDePrenda;

import java.awt.*;

public class Main {

    static final TipoDePrenda REMERA = new TipoDePrenda("Remera", Categoria.PARTE_SUPERIOR);

    public static void main(String [ ] args){



    //prenda.TipoDePrenda remera = new prenda.TipoDePrenda("Remera", prenda.Categoria.PARTE_SUPERIOR );
    REMERA.agregarMaterialPermitido(Material.ALGODON);


    Prenda remeraAlgodonNegra = new Prenda("Remera Negra de algodon", REMERA, Color.black, Material.ALGODON); // no deberia de crearse: El material no es valido
    System.out.println("El nombre de la prenda es: " + remeraAlgodonNegra.getNombre());
    System.out.println(remeraAlgodonNegra.getColorSec());
    // El codigo se va a ejecutar hasta aca, no va a permitir que se cree  la prenda con un material no permitido.
    Prenda remeraCueroNegra = new Prenda("Remera Negra de cuero", REMERA, Color.black, Material.CUERO); // no deberia de crearse: El material no es valido



    System.out.println("El nombre de la prenda es: " + remeraCueroNegra.getNombre()); // Esto nunca se ejecuta

    }
}
