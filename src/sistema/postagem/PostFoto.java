package sistema.postagem;

import sistema.estrutura.Foto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostFoto implements Postavel {
        private int qtde_fotos = 0;
        private List<Foto> fotos = new ArrayList<>(10);
        private String localizacao;
        private LocalDateTime data_postagem;
        private List<Comentario> listaComentarios = new ArrayList<>();
        private int qtde_fixados = 0;
        public PostFoto(){        // Construtor vazio sem foto
        }
        public PostFoto(Foto new_foto, String new_localizacao){    // Override do construtor atribuindo foto
            this.localizacao = new_localizacao;
            fotos.add(new_foto); //Precisa do this?
            this.qtde_fotos++;
        }
        public boolean adicicionaFoto(Foto new_foto){   //Parametro adicionado para que o metodo possa receber uma foto.
            if (qtde_fotos <= 10) {     //Caso haja espaço para fotos
                fotos.add(new_foto);
                this.qtde_fotos += 1;
                return true;
            } else {
                throw new ArrayIndexOutOfBoundsException("Fora do limite de 10 fotos"); //Exception para evitar a tentativa de indexar argumentos alem da capacidade da Array
            }
        }
        public boolean removeFoto(Foto new_foto) {
            if(fotos.contains(new_foto)) {
                fotos.remove(new_foto);
                this.qtde_fotos -= 1;
                return true;
            }
            return false; //Exception foto não encontrada?
        }
        public boolean posta() {
            if (qtde_fotos < 1){
                throw new NullPointerException("Nao ha foto ligado a postagem");
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
            this.listaComentarios.add(comentario);
            if(fixado) this.qtde_fixados += 1;
            return true;
        }

    //Metodos set e get:
    public int getQtde_fotos() {
        return qtde_fotos;
    }

    public int getQtde_fixados() {
        return qtde_fixados;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public List<Comentario> getListaComentarios() {
        return listaComentarios;
    }

    public LocalDateTime getData_postagem() {
        return data_postagem;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /* Não podemos criar os metodos set para qtde_fotos, qtde_fixados, fotos, listaComentarios e data_postagem,
        pois ja temos metodos para dar valor a esse argumentos e o metodo set burlaria as medidas de seguraça do programa   */
}
