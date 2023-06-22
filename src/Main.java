import sistema.postagem.Foto;
import sistema.post.PostFoto;

public class Main {
    public static void main(String[] args){
        Foto foto1 = new Foto("1030","all.png");
        PostFoto postFoto = new PostFoto(foto1, "Paraiba");
        System.out.println("================= TENTATIVA 1 =================");
        if (postFoto.posta()) System.out.println("Postagem feita com sucesso");
        System.out.print("Lista de fotos: ");
        System.out.println(postFoto.getFotos());
        System.out.print("Quantidade de fotos: ");
        System.out.println(postFoto.getQtde_fotos());
        System.out.print("Data da postagem: ");
        System.out.println(postFoto.getData_postagem());
        System.out.print("Localizacao: ");
        System.out.println(postFoto.getLocalizacao());
        System.out.print("Lista de comentarios: ");
        System.out.println(postFoto.getListaComentarios());
        System.out.print("Quantidade de fixados: ");
        System.out.println(postFoto.getQtde_fixados());
        System.out.print("ID da Foto1: ");
        System.out.println(foto1.getID());
        System.out.print("URL da Foto1: ");
        System.out.println(foto1.getUrl_recurso());
        System.out.print("Resolucao da foto: ");
        System.out.println(foto1.getResolucao());
    }
}
