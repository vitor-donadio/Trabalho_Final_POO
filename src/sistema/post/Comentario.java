package sistema.post;

import java.time.LocalDateTime;

public class Comentario {
    private LocalDateTime data;
    private boolean fixado;
    private int tamanho;
    private String texto;

    public Comentario(String new_texto, int new_tamanho, boolean new_fixado){ //Construtor
        this.data = LocalDateTime.now();
        this.fixado = new_fixado;
        this.tamanho = new_tamanho;
        this.texto = new_texto;
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

    //A edição do comentario é permitida porem a data é atualizada para o momento da edição, com exeção do fixado

    public void setFixado(boolean fixado) {
        this.fixado = fixado;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
        this.data = LocalDateTime.now();
    }

    public void setTexto(String texto) {
        this.texto = texto;
        this.data = LocalDateTime.now();
    }
}