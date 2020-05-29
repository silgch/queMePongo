package clima;

import java.util.List;
import java.util.Map;

public interface IAPIClima {
    //PATRON ADAPTER: ESTE ES EL ADAPTADOR: Todos los adaptados implementan los metodos de esta clase
    //Hace su magia y me devuelve el clima

     List<Map<String, Object>> getWeather(String ciudad);
}
