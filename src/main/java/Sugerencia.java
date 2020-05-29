import prenda.Prenda;

import java.util.List;
import java.util.stream.Collectors;

public class Sugerencia {
//Como usuarie de QuéMePongo,
// quiero poder conocer las condiciones climáticas de Buenos Aires en un momento
// dado para obtener sugerencias acordes.


   public List<List<Prenda>>  obtenerAtuendos(){
    //Hago atuendos posibles. Una prenda para cada categoria
   }

   public List<Prenda> consultarPrendasAptasParaElClima(List<Prenda> prendas) {
      return prendas.stream().filter(prenda -> prenda.esAptaParaLaTemperaturaActual()).collect(Collectors.toList());
   }

   public List<List<Prenda>> obtenerAtuendosSegunClima(){
   //Me devuelve los atuendos posibles segun clima
   }
}
