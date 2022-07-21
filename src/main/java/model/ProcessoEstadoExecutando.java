package model;


public class ProcessoEstadoExecutando implements ProcessoEstado {

    private static ProcessoEstadoExecutando instance = new ProcessoEstadoExecutando();

    private ProcessoEstadoExecutando() {
    }

    public static ProcessoEstadoExecutando getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Executando";
    }
}

