package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Semana {
    private List<String> diasDeLaSemana;

    public Semana() {
        diasDeLaSemana = new ArrayList<>();
        inicializarDiasDeLaSemana();
    }

    private void inicializarDiasDeLaSemana() {
        diasDeLaSemana.addAll(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
    }

    public List<String> obtenerDiasDeLaSemana() {
        return diasDeLaSemana;
    }

    public int obtenerLongitud() {
        return diasDeLaSemana.size();
    }

    public void eliminarDia(String dia) {
        diasDeLaSemana.remove(dia);
    }

    public String obtenerDiaSolicitado(String dia) {
        if (diasDeLaSemana.contains(dia)) {
            return dia;
        } else {
            throw new IllegalArgumentException("El día proporcionado no existe en la lista.");
        }
    }

    public boolean diaExiste(String dia) {
        return diasDeLaSemana.contains(dia);
    }

    public void ordenarDiasAlfabeticamente() {
        Collections.sort(diasDeLaSemana);
    }

    public void vaciarLista() {
        diasDeLaSemana.clear();
    }
}

    

