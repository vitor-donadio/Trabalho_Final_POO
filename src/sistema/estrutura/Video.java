package sistema.estrutura;

public class Video extends Recurso {
    private int frame_rate;
    protected int ID;
    protected String url_recurso;
    protected static int prox_ID = 1;
    private int duracao;
    public Video(int new_frame_rate, int new_duracao, String new_url_recurso){
        if(validaUrlRecurso(new_url_recurso)) this.url_recurso = new_url_recurso;
        this.frame_rate = new_frame_rate;
        if(new_duracao < 0) throw new IllegalArgumentException("Duracao do video invalida");
        this.duracao = new_duracao;
        this.ID = prox_ID;
        prox_ID++;
    }
    public boolean validaUrlRecurso(String url) {
        if (url.length() > 4){
            url = url.substring(url.length() - 4);
        } else if (url.length() < 4) {
            throw new IllegalArgumentException("Formato de arquivo invalido, insira ou .mp4, .mov, .wmv");
        }
        if (url == ".wmv" || url == ".mov" || url == ".mp4"){
            return true;
        }
        throw new IllegalArgumentException("Formato de arquivo invalido, insira ou .mp4, .mov, .wmv");
    }
}
