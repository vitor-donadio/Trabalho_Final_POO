package sistema.estrutura;

public class Foto extends Recurso {
    private String resolucao;
    protected int ID;
    protected String url_recurso;
    protected static int prox_ID = 1;
    public Foto(String new_resolucao, String new_url_recurso){
        if(validaUrlRecurso(new_url_recurso)) this.url_recurso = new_url_recurso;
        this.resolucao = new_resolucao;
        this.ID = prox_ID;
        prox_ID++;
    }
    public boolean validaUrlRecurso(String url) {
        if (url.length() > 4){
            url = url.substring(url.length() - 4);
        } else if (url.length() < 4) {
            throw new IllegalArgumentException("Formato de arquivo invalido, insira ou .jpg, .png, .bpm");
        }
        if (url.equals(".jpg") || url.equals(".png") || url.equals(".bmp")){
            return true;
        }
        throw new IllegalArgumentException("Formato de arquivo invalido, insira ou .jpg, .png, .bpm");
    }
    //Apenas metodos get, prox_ID não necessita de metodo get, pois ele e um atributo estatico que serve para dar valor ao ID


    public int getID() {
        return ID;
    }

    public String getResolucao() {
        return resolucao;
    }

    public String getUrl_recurso() {
        return url_recurso;
    }
}

