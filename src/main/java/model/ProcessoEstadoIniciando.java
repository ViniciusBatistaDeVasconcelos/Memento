package model;


public class ProcessoEstadoIniciando implements ProcessoEstado {

    private static ProcessoEstadoIniciando instance = new ProcessoEstadoIniciando();

    private ProcessoEstadoIniciando() {
    }

    public static ProcessoEstadoIniciando getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Iniciando";
    }
}

