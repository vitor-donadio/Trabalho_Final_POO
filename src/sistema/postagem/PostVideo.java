package sistema.postagem;

import sistema.estrutura.Video;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostVideo implements Postavel{
    private Video video = null;
    private LocalDateTime data_postagem;
    private List<Comentario> lista_comentarios = new ArrayList<>();
    private int qtde_fixados = 0;
    public PostVideo(){        // Construtor sem video
    }
    public PostVideo(Video new_video){  // Override do construtor com video
        this.video = new_video;
    }
    public boolean adicicionaVideo(Video new_video){    //Parametro adicionado para que o metodo possa receber um video.
        if (this.video == null) {    //Caso não haja videos vinculados
            this.video = new_video;
            return true;
        } else {
            //return false; Não ha nescessidade de exeção?
            throw new IndexOutOfBoundsException("Limite de um video por postagem");
        }
    }
    public boolean posta() {
        if (this.video == null){
            throw new NullPointerException("Não há video ligado a postagem"); // Exeção quando o valor do video for null
        }
        this.data_postagem = LocalDateTime.now();
        return true;
    }
    public boolean comenta() {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int tamanho = sc.nextInt();
        boolean fixado = sc.hasNextBoolean();
        Comentario comentario = new Comentario(texto, tamanho, fixado);
        this.lista_comentarios.add(comentario);
        if(fixado) qtde_fixados += 1;
        return true;
    }

    public Video getVideo() {
        return video;
    }

    public LocalDateTime getData_postagem() {
        return data_postagem;
    }

    public int getQtde_fixados() {
        return qtde_fixados;
    }

    public List<Comentario> getLista_comentarios() {
        return lista_comentarios;
    }
    /* Não usamos metodos sets, pois ja existem formas de dar valor a esses argumentos
        que nos permitem evitar erros no programa */
}
