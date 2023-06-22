package sistema.postagem;

abstract class Recurso {
    protected int ID;
    protected String url_recurso;
    protected static int prox_ID;
    abstract public boolean validaUrlRecurso(String url);
}
