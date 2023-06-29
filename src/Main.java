import sistema.SingletonFeed;
import sistema.estrutura.Foto;
import sistema.estrutura.PostavelFactory;
import sistema.estrutura.Video;
import sistema.postagem.Comentario;
import sistema.postagem.PostFoto;
import sistema.postagem.PostVideo;

public class Main {
    public static void main(String[] args){
        tentativa1();   // Postagem com foto atribuida
        tentativa2();   // Postagem com video atribuido
        tentativa3();   // Postagem sem video atribuido
        tentativa4();   // Postagem sem video atribuido
        tentativa5();   // Postagem com cinco fotos atribuidas
        tentativa6();   // Postagem com 11 fotos atribuidas
        tentativa7();   // Comentario em postagem com foto
        tentativa8();   // Comentario em postagem com video
        tentativa9();   // Postagem com video invalido
        tentativa10();  // Postagem com foto invalido
        tentativa11();  // Criação de PostVideo com string invalida
        tentativa12();  // Criação de PostFoto com tipo de classe invalido
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
            getAtributosFoto(postFoto.getFoto(0));
            System.out.print("Lista de comentarios: ");
            System.out.println(postFoto.getListaComentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postFoto.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
            System.out.println(" ");
        }
    }

    static void tentativa2(){
        System.out.println("================= TENTATIVA 2 =================");
        Video video1 = new Video(60,93, "Shrek2.mp4");
        PostVideo postVideo =  (PostVideo) PostavelFactory.getPostavel("POSTVIDEO");
        postVideo.adicicionaVideo(video1);
        if(postVideo.posta()){
            System.out.println("Postagem feita com sucesso");
            System.out.print("Video: ");
            System.out.println(postVideo.getVideo());
            System.out.print("Data da postagem: ");
            System.out.println(postVideo.getData_postagem());
            System.out.print("ID do Video1: ");
            System.out.println(postVideo.getVideo().getID());
            System.out.print("URL do Video1: ");
            System.out.println(postVideo.getVideo().getUrl_recurso());
            System.out.print("Frame rate do video: ");
            System.out.println(postVideo.getVideo().getFrame_rate() + " fps");
            System.out.print("Duracao do video: ");
            System.out.println(postVideo.getVideo().getDuracao() + " min");
            System.out.print("Lista de comentarios: ");
            System.out.println(postVideo.getLista_comentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postVideo.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
            System.out.println(" ");
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
            System.out.print("ID do Video1: ");
            System.out.println(postVideo.getVideo().getID());
            System.out.print("URL do Video1: ");
            System.out.println(postVideo.getVideo().getUrl_recurso());
            System.out.print("Frame rate do video: ");
            System.out.println(postVideo.getVideo().getFrame_rate() + " fps");
            System.out.print("Duracao do video: ");
            System.out.println(postVideo.getVideo().getDuracao() + " min");
            System.out.print("Lista de comentarios: ");
            System.out.println(postVideo.getLista_comentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postVideo.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
            System.out.println(" ");
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
            System.out.println(" ");
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
            for (int i = 0; i < postFoto.getFotos().size(); i++) {
                getAtributosFoto(postFoto.getFoto(i));
            }
            System.out.print("Lista de comentarios: ");
            System.out.println(postFoto.getListaComentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postFoto.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
            System.out.println(" ");
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
        Foto foto11 = new Foto("1600x1600","Madvillainy.png");
        postFoto.setLocalizacao("Meu Spotify");
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
            for (int i = 0; i < postFoto.getFotos().size(); i++) {
                getAtributosFoto(postFoto.getFoto(i));
            }
            System.out.print("Lista de comentarios: ");
            System.out.println(postFoto.getListaComentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postFoto.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
            System.out.println(" ");
        }
    }

    static void tentativa7(){
        System.out.println("================= TENTATIVA 7 =================");
        Foto foto1 = new Foto("1920x1080","Homem_malhado.png");
        PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTFOTO");
        postFoto.adicicionaFoto(foto1);
        postFoto.setLocalizacao("Academia");
        if (postFoto.posta()){
            System.out.println("Postagem feita com sucesso");
            if(postFoto.comenta()) {
                System.out.print("Lista de fotos: ");
                System.out.println(postFoto.getFotos());
                System.out.print("Quantidade de fotos: ");
                System.out.println(postFoto.getQtde_fotos());
                System.out.print("Localizacao: ");
                System.out.println(postFoto.getLocalizacao());
                System.out.print("Data da postagem: ");
                System.out.println(postFoto.getData_postagem());
                getAtributosFoto(postFoto.getFoto(0));
                System.out.print("Lista de comentarios: ");
                System.out.println(postFoto.getListaComentarios());
                System.out.print("Quantidade de fixados: ");
                System.out.println(postFoto.getQtde_fixados());
                System.out.print("Data do comentario: ");
                System.out.println(postFoto.getComentario(0).getData());
                System.out.print("Comentario fixado: ");
                System.out.println(postFoto.getComentario(0).getFixado());
                System.out.print("Texto do comentario: ");
                System.out.println(postFoto.getComentario(0).getTexto());
                System.out.print("Tamanho do texto: ");
                System.out.println(postFoto.getComentario(0).getTamanho() + " caracteres");
                System.out.println("Comentario feito com sucesso");
                System.out.println(" ");
            }else {
                System.out.println("Falha ao fazer comentario");
                System.out.println(" ");
            }
        }else {
            System.out.println("Falha ao postar");
            System.out.println(" ");
        }
    }

    static void tentativa8(){
        System.out.println("================= TENTATIVA 8 =================");
        Video video1 = new Video(30,24, "One_Piece_EP_1000.mp4");
        PostVideo postVideo = (PostVideo) PostavelFactory.getPostavel("POSTVIDEO");
        postVideo.adicicionaVideo(video1);
        if (postVideo.posta()){
            System.out.println("Postagem feita com sucesso");
            if(postVideo.comenta()) {
                System.out.print("Video: ");
                System.out.println(postVideo.getVideo());
                System.out.print("Data da postagem: ");
                System.out.println(postVideo.getData_postagem());
                System.out.print("ID do Video1: ");
                System.out.println(postVideo.getVideo().getID());
                System.out.print("URL do Video1: ");
                System.out.println(postVideo.getVideo().getUrl_recurso());
                System.out.print("Frame rate do video: ");
                System.out.println(postVideo.getVideo().getFrame_rate() + " fps");
                System.out.print("Duracao do video: ");
                System.out.println(postVideo.getVideo().getDuracao() + " min");
                System.out.print("Lista de comentarios: ");
                System.out.println(postVideo.getLista_comentarios());
                System.out.print("Quantidade de fixados: ");
                System.out.println(postVideo.getQtde_fixados());
                System.out.print("Data do comentario: ");
                System.out.println(postVideo.getComentario(0).getData());
                System.out.print("Comentario fixado: ");
                System.out.println(postVideo.getComentario(0).getFixado());
                System.out.print("Texto do comentario: ");
                System.out.println(postVideo.getComentario(0).getTexto());
                System.out.print("Tamanho do texto: ");
                System.out.println(postVideo.getComentario(0).getTamanho() + " caracteres");
                System.out.println("Comentario feito com sucesso");
                System.out.println(" ");
            }else {
                System.out.println("Falha ao fazer comentario");
                System.out.println(" ");
            }
        }else {
            System.out.println("Falha ao postar");
            System.out.println(" ");
        }
    }
    static void tentativa9(){
        System.out.println("================= TENTATIVA 9 =================");
        Video video1 = new Video(60,160, "GlItCH.mKv");
        PostVideo postVideo =  (PostVideo) PostavelFactory.getPostavel("POSTVIDEO");
        postVideo.adicicionaVideo(video1);
        if(postVideo.posta()){
            System.out.println("Postagem feita com sucesso");
            System.out.print("Video: ");
            System.out.println(postVideo.getVideo());
            System.out.print("Data da postagem: ");
            System.out.println(postVideo.getData_postagem());
            System.out.print("ID do Video1: ");
            System.out.println(postVideo.getVideo().getID());
            System.out.print("URL do Video1: ");
            System.out.println(postVideo.getVideo().getUrl_recurso());
            System.out.print("Frame rate do video: ");
            System.out.println(postVideo.getVideo().getFrame_rate() + " fps");
            System.out.print("Duracao do video: ");
            System.out.println(postVideo.getVideo().getDuracao() + " min");
            System.out.print("Lista de comentarios: ");
            System.out.println(postVideo.getLista_comentarios());
            System.out.print("Quantidade de fixados: ");
            System.out.println(postVideo.getQtde_fixados());
            System.out.println(" ");
        }else {
            System.out.println("Falha ao postar");
            System.out.println(" ");
        }
    }
    static void tentativa10(){
    System.out.println("================ TENTATIVA 10 =================");
    Foto foto1 = new Foto("854x480","Ao_infinito_e_além.gif");
    PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTFOTO");
        postFoto.adicicionaFoto(foto1);
        postFoto.setLocalizacao("Quarto do Andy");
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
        getAtributosFoto(postFoto.getFoto(0));
        System.out.print("Lista de comentarios: ");
        System.out.println(postFoto.getListaComentarios());
        System.out.print("Quantidade de fixados: ");
        System.out.println(postFoto.getQtde_fixados());
        System.out.println(" ");
    }else {
        System.out.println("Falha ao postar");
        System.out.println(" ");
    }
}
    static void tentativa11(){
        System.out.println("================= TENTATIVA 11 =================");
        Video video1 = new Video(60,111, "Ratatouille.mp4");
        try {
            PostVideo postVideo = (PostVideo) PostavelFactory.getPostavel("VIDEO");
            postVideo.adicicionaVideo(video1);
            if (postVideo.posta()) {
                System.out.println("Postagem feita com sucesso");
                System.out.print("Video: ");
                System.out.println(postVideo.getVideo());
                System.out.print("Data da postagem: ");
                System.out.println(postVideo.getData_postagem());
                System.out.print("ID do Video1: ");
                System.out.println(postVideo.getVideo().getID());
                System.out.print("URL do Video1: ");
                System.out.println(postVideo.getVideo().getUrl_recurso());
                System.out.print("Frame rate do video: ");
                System.out.println(postVideo.getVideo().getFrame_rate() + " fps");
                System.out.print("Duracao do video: ");
                System.out.println(postVideo.getVideo().getDuracao() + " min");
                System.out.print("Lista de comentarios: ");
                System.out.println(postVideo.getLista_comentarios());
                System.out.print("Quantidade de fixados: ");
                System.out.println(postVideo.getQtde_fixados());
                System.out.println(" ");
            } else {
                System.out.println("Falha ao postar");
                System.out.println(" ");
            }
        }catch (NullPointerException e){
            System.out.println("ERRO = " + e + ": o valor de postVideo e null");
            System.out.println(" ");
        }
    }
    static void tentativa12(){
        System.out.println("================ TENTATIVA 12 =================");
        Foto foto1 = new Foto("854x480","Trem_Azul.bpm");
        try {
            PostFoto postFoto = (PostFoto) PostavelFactory.getPostavel("POSTVIDEO");
            postFoto.adicicionaFoto(foto1);
            postFoto.setLocalizacao("Quarto do Andy");
            if (postFoto.posta()) {
                System.out.println("Postagem feita com sucesso");
                System.out.print("Lista de fotos: ");
                System.out.println(postFoto.getFotos());
                System.out.print("Quantidade de fotos: ");
                System.out.println(postFoto.getQtde_fotos());
                System.out.print("Localizacao: ");
                System.out.println(postFoto.getLocalizacao());
                System.out.print("Data da postagem: ");
                System.out.println(postFoto.getData_postagem());
                getAtributosFoto(postFoto.getFoto(0));
                System.out.print("Lista de comentarios: ");
                System.out.println(postFoto.getListaComentarios());
                System.out.print("Quantidade de fixados: ");
                System.out.println(postFoto.getQtde_fixados());
                System.out.println(" ");
            } else {
                System.out.println("Falha ao postar");
                System.out.println(" ");
            }
        }catch (ClassCastException e){
            System.out.println("Erro = " + e + ": Classe esperada = PostFoto");
            System.out.println(" ");
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
