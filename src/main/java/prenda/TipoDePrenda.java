package prenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoDePrenda {
    ZAPATO(Categoria.CALZADO, Arrays.asList(Material.CUERINA, Material.CUERO)),
    ZAPATILLA(Categoria.CALZADO, Arrays.asList(Material.CUERO, Material.CUERINA)),
    REMERA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.ALGODON, Material.LINO)),
    SWEATER(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.LANA, Material.POLIESTER)),
    PANTALON(Categoria.PARTE_INFERIOR, Arrays.asList(Material.CUERO, Material.BENGALINA, Material.JEAN)),
    ANTEOJOS(Categoria.ACCESORIOS, Arrays.asList(Material.PLASTICO, Material.CUERINA)),
    GORRA(Categoria.ACCESORIOS, Arrays.asList(Material.ALGODON, Material.CUERINA));

    private Categoria categoria;
    private List<Material> materialesPermitidos;

    //Ver validacion del material.

    TipoDePrenda(Categoria categoria, List<Material> materiales){
        this.categoria=categoria;
        this.materialesPermitidos=materiales;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public List<Material> getMaterialesPermitidos(){
        return this.materialesPermitidos;
    }
    public boolean admiteMaterial(Material unMaterial){
        return materialesPermitidos.contains(unMaterial);

    }
}
