package prenda;

import clima.Clima;
import exception.ColorSecundarioNoDefinidoException;
import exception.MaterialNoValidoException;

import java.awt.*;

public class Prenda {
    private String nombre;
    private TipoDePrenda tipo;
    private Color color;
    private Color colorSec;
    private Material material;
    private float tempMaxAdecuada;


    public Prenda(String nombre, TipoDePrenda tipo, Color color, Material material) {
        //Valido que el material sea apto para el Tipo de prenda.
        if(tipo.admiteMaterial(material)){
            this.nombre = nombre;
            this.tipo = tipo;
            this.color = color;
            this.material = material;


        }
        else{
            throw new MaterialNoValidoException();
        }
    }

    public boolean esAptaParaLaTemperaturaActual() {
        return tempMaxAdecuada <= Clima.instance().obtenerClimaActual();
    }


    //Getter
    public TipoDePrenda getTipo(){ return tipo; }
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
