package model;


public class ProcessoEstadoConcluido implements ProcessoEstado {

    private static ProcessoEstadoConcluido instance = new ProcessoEstadoConcluido();

    private ProcessoEstadoConcluido() {
    }

    public static ProcessoEstadoConcluido getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Concluído";
    }
}

