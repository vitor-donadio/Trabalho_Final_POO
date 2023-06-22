package sistema.postagem;

import sistema.estrutura.Video;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostVideo implements Postavel{
    private Video video;
    private LocalDateTime data_postagem;
    private List<Comentario> lista_comentarios = new ArrayList<>();
    private int qtde_fixados = 0;

    public PostVideo(){        // Construtor sem video
    }

    public PostVideo(Video new_video){  // Override do construtor com video (Obsoleto pelo Factory)
        if (new_video.validaUrlRecurso(new_video.getUrl_recurso())) {
            this.video = new_video;
        }
    }

    public boolean adicicionaVideo(Video new_video){    //Parametro adicionado para que o metodo possa receber um video.
        if(new_video.validaUrlRecurso(new_video.getUrl_recurso())){
            try {
                if (this.video == null) {    //Caso não haja videos vinculados
                    this.video = new_video;
                    return true;
                } else {
                    throw new IndexOutOfBoundsException(); //Não sei se esta correto
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println("Limite de um video por postagem");
                return false;
            }
        }else {
            return false;
        }
    }

    public boolean posta() {
        try {
            if (this.video == null) {
                throw new NullPointerException(); // Exeção quando o valor do video for null
            }
        }catch (NullPointerException e){
            System.out.println("Nao ha video ligado a postagem");
            return false;
        }
        this.data_postagem = LocalDateTime.now();
        return true;
    }

    public boolean comenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Texto do comentario: ");
        String texto = sc.nextLine();
        System.out.println("fixado? true/false: ");// Talvez seja necessario colocar uma exception
        boolean fixado = sc.nextBoolean();
        Comentario comentario = new Comentario(texto, fixado);
        if(fixado) {
            this.lista_comentarios.add(qtde_fixados, comentario); //Nao sei se ta certo
            this.qtde_fixados += 1;
        }else {
            this.lista_comentarios.add(comentario);
        }
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
