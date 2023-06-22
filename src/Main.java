import sistema.estrutura.Foto;
import sistema.estrutura.PostavelFactory;
import sistema.estrutura.Video;
import sistema.postagem.PostFoto;
import sistema.postagem.PostVideo;
import sistema.postagem.Postavel;

public class Main {
    public static void main(String[] args){
        System.out.println("================= TENTATIVA 1 =================");
        Foto foto1 = new Foto("1500x1000","Foto_com_um_Pikachu.ppg");
        //PostFoto postFoto = new PostFoto(foto1, "Kanto");
        PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTFOTO");
        postFoto.adicicionaFoto(foto1);
        postFoto.setLocalizacao("Kanto");
        if (postFoto.posta()){
            System.out.println("Postagem feita com sucesso");
        }else {
            System.out.println("Falha ao postar");
        }
        System.out.print("Lista de fotos: ");
        System.out.println(postFoto.getFotos());
        System.out.print("Quantidade de fotos: ");
        System.out.println(postFoto.getQtde_fotos());
        System.out.print("URL da Foto1: ");
        System.out.println(foto1.getUrl_recurso());
        System.out.print("Localizacao: ");
        System.out.println(postFoto.getLocalizacao());
        System.out.print("Resolucao da foto1: ");
        System.out.println(foto1.getResolucao());
        System.out.print("Data da postagem: ");
        System.out.println(postFoto.getData_postagem());
        System.out.print("Lista de comentarios: ");
        System.out.println(postFoto.getListaComentarios());
        System.out.print("Quantidade de fixados: ");
        System.out.println(postFoto.getQtde_fixados());
        System.out.print("ID da Foto1: ");
        System.out.println(foto1.getID());
        System.out.println(" ");
        System.out.println("================= TENTATIVA 2 =================");
        Video video1 = new Video(60,160, "Shrek2.mm4");
        //PostVideo postVideo = new PostVideo(video1);
        PostVideo postVideo =  (PostVideo) PostavelFactory.getPostavel("POSTVIDEO");
        postVideo.adicicionaVideo(video1);
        if(postVideo.posta()) System.out.println("Postagem feita com sucesso");
        System.out.print("Video: ");
        System.out.println(postVideo.getVideo());
        System.out.print("URL do Video1: ");
        System.out.println(video1.getUrl_recurso());
        System.out.print("Frame rate do video: ");
        System.out.println(video1.getFrame_rate() + " fps");
        System.out.print("Duracao do video: ");
        System.out.println(video1.getDuracao() + " min");
        System.out.print("Data da postagem: ");
        System.out.println(postVideo.getData_postagem());
        System.out.print("Lista de comentarios: ");
        System.out.println(postVideo.getLista_comentarios());
        System.out.print("Quantidade de fixados: ");
        System.out.println(postVideo.getQtde_fixados());
        System.out.print("ID do Video1: ");
        System.out.println(video1.getID());
        System.out.println(" ");

    }
}
