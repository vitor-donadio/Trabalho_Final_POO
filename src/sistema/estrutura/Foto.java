package sistema.estrutura;

public class Foto extends Recurso {
    private String resolucao;
    public Foto(String new_resolucao, String new_url_recurso){
        this.url_recurso = new_url_recurso;
        this.resolucao = new_resolucao;
        this.ID = prox_ID;
        prox_ID++;
    }
    @Override
    public boolean validaUrlRecurso(String url) {
        try {
            if (url.length() > 4) {
                url = url.substring(url.length() - 4);
            } else if (url.length() < 4) {
                throw new IllegalArgumentException("Formato de arquivo invalido, insira ou .jpg, .png, .bpm");
            }
            if (url.equals(".jpg") || url.equals(".png") || url.equals(".bpm")) {
                return true;
            }else {
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Erro = " + e + ": Formato de arquivo invalido, insira ou .jpg, .png, .bpm");
            return false;
        }
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

