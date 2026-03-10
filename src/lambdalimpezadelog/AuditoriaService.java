package lambdalimpezadelog;

import java.util.List;

public class AuditoriaService {

    public void analisarTentativasDeInvasao(List<AcessoLog> logs) {

        logs.removeIf(AcessoLog::isSucceso);

        logs.forEach(log -> System.out.printf(
                "Alerta: Tentativa de invasão pelo usuário: [ %s ]", log.getUsuario()));
    }
}
