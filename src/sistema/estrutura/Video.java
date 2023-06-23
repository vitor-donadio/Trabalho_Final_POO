package sistema.estrutura;

public class Video extends Recurso {
    private int frame_rate;
    private int duracao;

    public Video(int new_frame_rate, int new_duracao, String new_url_recurso){
        this.url_recurso = new_url_recurso;
        this.frame_rate = new_frame_rate;
        this.duracao = new_duracao;
        try {                                                           //captura de exception de argumento invalido
            if (new_duracao < 0) throw new IllegalArgumentException();  //Argumento invalido
        }catch (IllegalArgumentException e){
            System.out.println("Erro = " + e + ": Duracao do video invalida");
        }
        this.ID = prox_ID;
        prox_ID++;
    }

    @Override
    public boolean validaUrlRecurso(String url) {
        try {
            if (url.length() > 4) {
                url = url.substring(url.length() - 4);
            } else if (url.length() < 4) {
                throw new IllegalArgumentException();
            }
            if (url.equals(".wmv") || url.equals(".mov") || url.equals(".mp4")) {
                return true;
            }
            throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){
            System.out.println("Erro = " + e + ": Formato de arquivo invalido, insira ou .mp4, .mov, .wmv");
            return false;
        }
    }

    public int getID() {
        return ID;
    }

    public int getFrame_rate() {
        return frame_rate;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getUrl_recurso() {
        return url_recurso;
    }
}
