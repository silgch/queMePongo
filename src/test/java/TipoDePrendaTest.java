
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import prenda.Categoria;
import prenda.Material;
import prenda.Prenda;
import prenda.TipoDePrenda;

import java.awt.Color;

public class TipoDePrendaTest {
   static final TipoDePrenda REMERA= new TipoDePrenda("Remera", Categoria.PARTE_SUPERIOR);
   static final TipoDePrenda REMERA_MANGAS_LARGAS= new TipoDePrenda("Remera mangas largas", Categoria.PARTE_SUPERIOR);
   static final TipoDePrenda PANTALON = new TipoDePrenda("Pantalon", Categoria.PARTE_INFERIOR);
   static final TipoDePrenda SWEATER= new TipoDePrenda("Sweater", Categoria.PARTE_SUPERIOR);
   static final TipoDePrenda LENTES= new TipoDePrenda("Lentes", Categoria.ACCESORIOS);
   static final TipoDePrenda BERMUDA= new TipoDePrenda("Bermuda", Categoria.PARTE_INFERIOR);
   Prenda remeraRojaAlgodon;
   Prenda remeraMangasLargasNegraAlgodon;
   Prenda pantalonJean;
   Prenda sweaterLanaGris;
   Prenda lentesPlasticoNegro;
   Prenda bermudaGabardina;

   @Before
    public void setUp() throws Exception {
       REMERA.agregarMaterialPermitido(Material.ALGODON);
       REMERA.agregarMaterialPermitido(Material.LINO);
       REMERA_MANGAS_LARGAS.agregarMaterialPermitido(Material.ALGODON);
       PANTALON.agregarMaterialPermitido(Material.JEAN);
       PANTALON.agregarMaterialPermitido(Material.GABARDINA);
       PANTALON.agregarMaterialPermitido(Material.LINO);
       PANTALON.agregarMaterialPermitido(Material.CORDEROY);
       SWEATER.agregarMaterialPermitido(Material.LANA);
       LENTES.agregarMaterialPermitido(Material.PLASTICO);
       LENTES.agregarMaterialPermitido(Material.ACRILICO);
       BERMUDA.agregarMaterialPermitido(Material.JEAN);
       BERMUDA.agregarMaterialPermitido(Material.GABARDINA);

       Prenda remeraRojaAlgodon = new Prenda("Remera roja", REMERA, Color.RED, Material.ALGODON);
       Prenda remeraMangasLargasNegraAlgodon= new Prenda("Remera mangas larga negra", REMERA_MANGAS_LARGAS, Color.BLACK, Material.ALGODON);
       Prenda pantalonJean= new Prenda("Pantalon Jean Azul", PANTALON, Color.BLUE, Material.JEAN);
       Prenda sweaterLanGris= new Prenda("Sweater lana color gris", SWEATER, new Color(128, 128,128), Material.LANA);
       Prenda lentesPlasticoNegro= new Prenda("Lentes Plastico Negro", LENTES, Color.BLACK, Material.PLASTICO);
       Prenda bermudaGabardina= new Prenda("Bermuda gabardina gris claro", BERMUDA, Color.LIGHT_GRAY, Material.GABARDINA);

   }

    @Test
    public void esValidoMaterial() {
       Assert.assertTrue(REMERA.esValidoMaterial(Material.ALGODON));
       Assert.assertTrue(REMERA.esValidoMaterial(Material.LINO));
       Assert.assertFalse(REMERA.esValidoMaterial(Material.PLASTICO));
       Assert.assertTrue(REMERA_MANGAS_LARGAS.esValidoMaterial(Material.ALGODON));
       Assert.assertFalse(REMERA_MANGAS_LARGAS.esValidoMaterial(Material.LINO));
       Assert.assertTrue(PANTALON.esValidoMaterial(Material.JEAN));
       Assert.assertTrue(PANTALON.esValidoMaterial(Material.GABARDINA));
       Assert.assertTrue(PANTALON.esValidoMaterial(Material.LINO));
       Assert.assertTrue(SWEATER.esValidoMaterial(Material.LANA));
       Assert.assertTrue(LENTES.esValidoMaterial(Material.PLASTICO));
       Assert.assertTrue(LENTES.esValidoMaterial(Material.ACRILICO));
       Assert.assertTrue(BERMUDA.esValidoMaterial(Material.JEAN));
       Assert.assertTrue(BERMUDA.esValidoMaterial(Material.GABARDINA));
       Assert.assertFalse(BERMUDA.esValidoMaterial(Material.LINO));

    }

    @Test
    public void getCategoria() {


       Assert.assertEquals(Categoria.PARTE_SUPERIOR, REMERA.getCategoria());
       Assert.assertEquals(Categoria.PARTE_SUPERIOR, REMERA_MANGAS_LARGAS.getCategoria());
       Assert.assertEquals(Categoria.PARTE_INFERIOR, PANTALON.getCategoria());
       Assert.assertEquals(Categoria.PARTE_SUPERIOR, SWEATER.getCategoria());
       Assert.assertEquals(Categoria.ACCESORIOS, LENTES.getCategoria());
       Assert.assertEquals(Categoria.PARTE_INFERIOR, BERMUDA.getCategoria());

    }
}
