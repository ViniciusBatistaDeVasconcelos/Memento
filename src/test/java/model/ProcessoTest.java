package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ProcessoTest {

    @Test
    void deveArmazenarEstados() {
        Processo processo = new Processo();
        processo.setEstado(ProcessoEstadoIniciando.getInstance());
        processo.setEstado(ProcessoEstadoExecutando.getInstance());
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        assertEquals(3, processo.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Processo processo = new Processo();
        processo.setEstado(ProcessoEstadoIniciando.getInstance());
        processo.setEstado(ProcessoEstadoExecutando.getInstance());
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        processo.restauraEstado(0);
        assertEquals(ProcessoEstadoIniciando.getInstance(), processo.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Processo processo = new Processo();
        processo.setEstado(ProcessoEstadoIniciando.getInstance());
        processo.setEstado(ProcessoEstadoExecutando.getInstance());
        processo.setEstado(ProcessoEstadoSuspenso.getInstance());
        processo.restauraEstado(1);
        assertEquals(ProcessoEstadoExecutando.getInstance(), processo.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Processo processo = new Processo();
            processo.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido.", e.getMessage());
        }
    }

}