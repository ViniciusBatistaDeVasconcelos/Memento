package model;


public class ProcessoEstadoSuspenso implements ProcessoEstado {

    private static ProcessoEstadoSuspenso instance = new ProcessoEstadoSuspenso();

    private ProcessoEstadoSuspenso() {
    }

    public static ProcessoEstadoSuspenso getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Suspenso";
    }
}

