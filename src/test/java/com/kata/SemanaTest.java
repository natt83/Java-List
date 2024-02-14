package com.kata;


    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;

import com.Semana;

import static org.junit.jupiter.api.Assertions.*;
    
  public  class SemanaTest {
        private Semana semana;
    
        @BeforeEach
        void setUp() {
            semana = new Semana();
        }
    
        @Test
        void testInicializarDiasDeLaSemana() {
            assertEquals(7, semana.obtenerLongitud(), "La semana debería tener  7 días");
        }
    
        @Test
        void testEliminarDia() {
            semana.eliminarDia("Lunes");
            assertFalse(semana.diaExiste("Lunes"), "El día Lunes no debería existir después de eliminarlo");
        }
    
        @Test
        void testOrdenarDiasAlfabeticamente() {
            semana.ordenarDiasAlfabeticamente();
            assertTrue(semana.diaExiste("Domingo"), "Domingo debería ser el primer día después de ordenar");
        }
    
        @Test
        void testVaciarLista() {
            semana.vaciarLista();
            assertEquals(0, semana.obtenerLongitud(), "La lista debería estar vacía después de vaciarla");
        }
    }
    
