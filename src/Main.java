import sistema.estrutura.Foto;
import sistema.estrutura.PostavelFactory;
import sistema.estrutura.Video;
import sistema.postagem.Comentario;
import sistema.postagem.PostFoto;
import sistema.postagem.PostVideo;

public class Main {
    public static void main(String[] args){
        tentativa1();
        tentativa2();
        tentativa3();
        tentativa4();
        tentativa5();
        tentativa6();
        tentativa7();
    }

    static void tentativa1(){

        System.out.println("================= TENTATIVA 1 =================");
        Foto foto1 = new Foto("1500x1000","Foto_com_um_Pikachu.png");
        PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTFOTO");
        postFoto.adicicionaFoto(foto1);
        postFoto.setLocalizacao("Kanto");
        if (postFoto.posta()){
            System.out.println("Postagem feita com sucesso");
            System.out.print("Lista de fotos: ");
            System.out.println(postFoto.getFotos());
            System.out.print("Quantidade de fotos: ");
            System.out.println(postFoto.getQtde_fotos());
            System.out.print("Localizacao: ");
            System.out.println(postFoto.getLocalizacao());
            System.out.print("Data da postagem: ");
            System.out.println(postFoto.getData_postagem());
            getAtributosFoto(foto1);
            System.out.print("Lista de comentarios: ");
            System.out.println(postFoto.getListaComentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postFoto.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
        }
    }

    static void tentativa2(){
        System.out.println("================= TENTATIVA 2 =================");
        Video video1 = new Video(60,160, "Shrek2.mp4");
        PostVideo postVideo =  (PostVideo) PostavelFactory.getPostavel("POSTVIDEO");
        postVideo.adicicionaVideo(video1);
        if(postVideo.posta()){
            System.out.println("Postagem feita com sucesso");
            System.out.print("Video: ");
            System.out.println(postVideo.getVideo());
            System.out.print("Data da postagem: ");
            System.out.println(postVideo.getData_postagem());
            System.out.print("ID do Video1: ");
            System.out.println(video1.getID());
            System.out.print("URL do Video1: ");
            System.out.println(video1.getUrl_recurso());
            System.out.print("Frame rate do video: ");
            System.out.println(video1.getFrame_rate() + " fps");
            System.out.print("Duracao do video: ");
            System.out.println(video1.getDuracao() + " min");
            System.out.print("Lista de comentarios: ");
            System.out.println(postVideo.getLista_comentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postVideo.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
        }
    }

    static void tentativa3(){
        System.out.println("================= TENTATIVA 3 =================");
        PostVideo postVideo =  (PostVideo) PostavelFactory.getPostavel("POSTVIDEO");
        if (postVideo.posta()){
            System.out.println("Postagem feita com sucesso");
            System.out.print("Video: ");
            System.out.println(postVideo.getVideo());
            System.out.print("Data da postagem: ");
            System.out.println(postVideo.getData_postagem());
            System.out.print("Lista de comentarios: ");
            System.out.println(postVideo.getLista_comentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postVideo.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
        }
    }

    static void tentativa4(){
        System.out.println("================= TENTATIVA 4 =================");
        PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTFOTO");
        if (postFoto.posta()){
            System.out.println("Postagem feita com sucesso");
            System.out.print("Lista de fotos: ");
            System.out.println(postFoto.getFotos());
            System.out.print("Quantidade de fotos: ");
            System.out.println(postFoto.getQtde_fotos());
            System.out.print("Localizacao: ");
            System.out.println(postFoto.getLocalizacao());
            System.out.print("Data da postagem: ");
            System.out.println(postFoto.getData_postagem());
            System.out.print("Lista de comentarios: ");
            System.out.println(postFoto.getListaComentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postFoto.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
        }
    }

    static void tentativa5() {
        System.out.println("================= TENTATIVA 5 =================");
        PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTFOTO");
        Foto foto1 = new Foto("3840x2160","Super_Capivara.jpg");
        Foto foto2 = new Foto("640x360","Submarino_perdido.bpm");
        Foto foto3 = new Foto("854x480","Um_portal_dentro_do_armario.png");
        Foto foto4 = new Foto("1280x720","Autoretrato_nao_tao_belo.bpm");
        Foto foto5 = new Foto("1920x1080","Print_do_filme_do_Homem_Aranha.png");
        postFoto.setLocalizacao("Lar doce lar");
        postFoto.adicicionaFoto(foto1);
        postFoto.adicicionaFoto(foto2);
        postFoto.adicicionaFoto(foto3);
        postFoto.adicicionaFoto(foto4);
        postFoto.adicicionaFoto(foto5);

        if (postFoto.posta()){
            System.out.println("Postagem feita com sucesso");
            System.out.print("Lista de fotos: ");
            System.out.println(postFoto.getFotos());
            System.out.print("Quantidade de fotos: ");
            System.out.println(postFoto.getQtde_fotos());
            System.out.print("Localizacao: ");
            System.out.println(postFoto.getLocalizacao());
            System.out.print("Data da postagem: ");
            System.out.println(postFoto.getData_postagem());
            getAtributosFoto(foto1);
            getAtributosFoto(foto2);
            getAtributosFoto(foto3);
            getAtributosFoto(foto4);
            getAtributosFoto(foto5);
            System.out.print("Lista de comentarios: ");
            System.out.println(postFoto.getListaComentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postFoto.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
        }
    }

    static void tentativa6(){
        System.out.println("================= TENTATIVA 6 =================");
        PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTFOTO");
        Foto foto1 = new Foto("1600x1600","Clube_da_Esquina.jpg");
        Foto foto2 = new Foto("1600x1600","In_Utero.png");
        Foto foto3 = new Foto("1600x1600","KIDS_SEE_GHOSTS.png");
        Foto foto4 = new Foto("1600x1600","Around_the_Fur.jpg");
        Foto foto5 = new Foto("1600x1600","New_Jeans.png");
        Foto foto6 = new Foto("1600x1600","Lo_Borges.jpg");
        Foto foto7 = new Foto("1600x1600","Samba_Esquema_Novo.png");
        Foto foto8 = new Foto("1600x1600","Musicas_Para_Churrasco_(Vol.I).png");
        Foto foto9 = new Foto("1600x1600","Tardezinha_Ao_Vivo.jpg");
        Foto foto10 = new Foto("1600x1600","Perfect_World.png");
        Foto foto11 = new Foto("1600x1600","HEROES_&_VILLAINS.png");
        postFoto.setLocalizacao("Spotify");
        postFoto.adicicionaFoto(foto1);
        postFoto.adicicionaFoto(foto2);
        postFoto.adicicionaFoto(foto3);
        postFoto.adicicionaFoto(foto4);
        postFoto.adicicionaFoto(foto5);
        postFoto.adicicionaFoto(foto6);
        postFoto.adicicionaFoto(foto7);
        postFoto.adicicionaFoto(foto8);
        postFoto.adicicionaFoto(foto9);
        postFoto.adicicionaFoto(foto10);
        postFoto.adicicionaFoto(foto11);

        if (postFoto.posta()){
            System.out.println("Postagem feita com sucesso");
            System.out.print("Lista de fotos: ");
            System.out.println(postFoto.getFotos());
            System.out.print("Quantidade de fotos: ");
            System.out.println(postFoto.getQtde_fotos());
            System.out.print("Localizacao: ");
            System.out.println(postFoto.getLocalizacao());
            System.out.print("Data da postagem: ");
            System.out.println(postFoto.getData_postagem());
            getAtributosFoto(foto1);
            getAtributosFoto(foto2);
            getAtributosFoto(foto3);
            getAtributosFoto(foto4);
            getAtributosFoto(foto5);
            getAtributosFoto(foto6);
            getAtributosFoto(foto7);
            getAtributosFoto(foto8);
            getAtributosFoto(foto9);
            getAtributosFoto(foto10);
            getAtributosFoto(foto11);
            System.out.print("Lista de comentarios: ");
            System.out.println(postFoto.getListaComentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postFoto.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
        }
    }

    static void tentativa7(){
        System.out.println("================= TENTATIVA 8 =================");
        Foto foto1 = new Foto("1920x1080","Homem_malhado.png");
        PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTFOTO");
        postFoto.adicicionaFoto(foto1);
        postFoto.setLocalizacao("Academia");
        if (postFoto.posta()){
            postFoto.comenta();
            Comentario comentario = postFoto.getComentario(0);
            System.out.println("Postagem feita com sucesso");
            System.out.print("Lista de fotos: ");
            System.out.println(postFoto.getFotos());
            System.out.print("Quantidade de fotos: ");
            System.out.println(postFoto.getQtde_fotos());
            System.out.print("Localizacao: ");
            System.out.println(postFoto.getLocalizacao());
            System.out.print("Data da postagem: ");
            System.out.println(postFoto.getData_postagem());
            getAtributosFoto(foto1);
            System.out.print("Lista de comentarios: ");
            System.out.println(postFoto.getListaComentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postFoto.getQtde_fixados());
            System.out.print("Data do comentario: ");
            System.out.println(comentario.getData());
            System.out.print("Comentario fixado: ");
            System.out.println(comentario.getFixado());
            System.out.print("Texto do comentario: ");
            System.out.println(comentario.getTexto());
            System.out.print("Tamanho do texto: ");
            System.out.println(comentario.getTamanho());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
        }
    }
    static void getAtributosFoto(Foto foto){
        System.out.print("ID da Foto: ");
        System.out.println(foto.getID());
        System.out.print("URL da Foto: ");
        System.out.println(foto.getUrl_recurso());
        System.out.print("Resolucao da Foto: ");
        System.out.println(foto.getResolucao());
    }
}
