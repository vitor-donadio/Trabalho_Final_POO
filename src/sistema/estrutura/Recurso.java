package sistema.estrutura;

abstract class Recurso {
    protected String url_recurso;
    protected static int prox_ID = 1;

    protected int ID = prox_ID;
    abstract public boolean validaUrlRecurso(String url);
}
