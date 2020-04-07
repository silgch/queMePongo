import java.awt.*;
import java.util.Optional;

public class Prenda {
    private String nombre;
    private TipoDePrenda tipo;
    private Color color;
    private Color colorSec;
    private Material material;



    public Prenda(String nombre, TipoDePrenda tipo, Color color, Material material) {
        //Valido que el material sea apto para el Tipo de prenda.
        if(tipo.esValidoMaterial(material)){
            this.nombre = nombre;
            this.tipo = tipo;
            this.color = color;
            this.material = material;


        }
        else{
            throw new MaterialNoValidoException();
        }
    }


    //Getter
    public String getTipo(){
        return tipo.getNombre();
    }
    public Categoria getCategoria(){
       return tipo.getCategoria();
    }
    public String getNombre() { return nombre; }
    public Color getColor() { return color; }
    public Color getColorSec() {
        if(colorSec==null){
            throw new ColorSecundarioNoDefinidoException();
        }
        return colorSec;

    }

    //Setter
    public void setColorSecundario(Color unColor){ this.colorSec=unColor;}

}
