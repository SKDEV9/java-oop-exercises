package streamgargalosensores;

import java.util.List;

public class ServicoMonitoramento {

    public double calcularMediaTemperaturaAnomalias(List<LeituraSensor> leituras) {


        return leituras.stream()
                .filter(LeituraSensor::anomalia)
                .mapToDouble(LeituraSensor::temperatura)
                .average()
                .orElse(0.0);
    }
}
