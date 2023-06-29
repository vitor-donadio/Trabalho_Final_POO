package sistema.postagem;

import java.time.LocalDateTime;

public class Comentario {
    private LocalDateTime data;
    private boolean fixado;
    private int tamanho;
    private String texto;

    public Comentario(String new_texto, boolean new_fixado){ //Construtor
        this.data = LocalDateTime.now();
        this.fixado = new_fixado;
        this.texto = new_texto;
        this.tamanho = texto.length();
    }

    //Metodos set e get:
    public int getTamanho() {
        return tamanho;
    }

    public LocalDateTime getData() {
        return data;
    }

    public boolean getFixado() {
        return fixado;
    }

    public String getTexto() { return texto; }

    //A edição do texto é permitida porem a data e o tamanho são atualizados no momento da edição
    public void setTexto(String text) {
        this.texto = text;
        this.data = LocalDateTime.now();
        this.tamanho = text.length();
    }
}