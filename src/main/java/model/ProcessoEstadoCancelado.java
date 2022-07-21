package model;


public class ProcessoEstadoCancelado implements ProcessoEstado {

    private static ProcessoEstadoCancelado instance = new ProcessoEstadoCancelado();

    private ProcessoEstadoCancelado() {
    }

    public static ProcessoEstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Cancelado";
    }
}

