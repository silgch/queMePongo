package clima;

import java.util.List;
import java.util.Map;

public class Clima {

    // Se encarga de consultar el clima.
    //ES UN SINGLETON


    IAPIClima apiClima;

   static Clima INSTANCE = new Clima();

    public Clima() {}

    public static Clima instance() {
        return INSTANCE;
    }


    public float obtenerClimaActual() {
        //PATRON ADAPTER: ESTE ES EL CLIENTE
        List<Map<String, Object>> climaActual = apiClima.getWeather("Buenos Aires, Argentina");
        return climaActual.get(0).get("Temperature").get("Value");
    }

    public  void setAPI(IAPIClima apiClima){ //El administrador tendra acceso a elegir cual API quiere implementar
        this.apiClima=apiClima;
    }
}
