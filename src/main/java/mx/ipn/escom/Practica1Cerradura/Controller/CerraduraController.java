package mx.ipn.escom.Practica1Cerradura.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/cerradura")
public class CerraduraController {

    @GetMapping("/estrella/{n}")
    public Set<String> cerraduraEstrella(@PathVariable int n) {
        return calcularCerraduraKleene(n);
    }

    @GetMapping("/positiva/{n}")
    public Set<String> cerraduraPositiva(@PathVariable int n) {
        return calcularCerraduraPositiva(n);
    }

    private Set<String> calcularCerraduraKleene(int n) {
        Set<String> resultado = new HashSet<>();
        resultado.add(""); // Agregar la cadena vacía
        for (int i = 0; i <= n; i++) {
            generarCadenas(resultado, "", i);
        }
        return resultado;
    }

    private Set<String> calcularCerraduraPositiva(int n) {
        Set<String> resultado = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            generarCadenas(resultado, "", i);
        }
        return resultado;
    }

    private void generarCadenas(Set<String> conjunto, String prefijo, int longitud) {
        if (longitud == 0) {
            conjunto.add(prefijo);
        } else {
            generarCadenas(conjunto, prefijo + "0", longitud - 1);
            generarCadenas(conjunto, prefijo + "1", longitud - 1);
        }
    }
}
