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

        public PostFoto(Foto new_foto, String new_localizacao){    // Override do construtor atribuindo foto (Construtor obsoleto por conta do Factory)
            if (new_foto.validaUrlRecurso(new_foto.getUrl_recurso())){
                this.localizacao = new_localizacao;
                fotos.add(new_foto);
                this.qtde_fotos++;
            }
        }

        public boolean adicicionaFoto(Foto new_foto){   //Parametro adicionado para que o metodo possa receber uma foto.
            if (new_foto.validaUrlRecurso(new_foto.getUrl_recurso())) {
                try {
                    if (qtde_fotos <= 10) {     //Caso haja espaço para fotos
                        fotos.add(new_foto);
                        this.qtde_fotos += 1;
                        return true;
                    } else {
                        throw new ArrayIndexOutOfBoundsException(); //Exception para evitar a tentativa de indexar argumentos alem da capacidade da Array
                    }
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Ultrapassou do limite de 10 fotos");
                    return false;
                }
            }else {
                return false;
            }
        }

        public boolean removeFoto(Foto new_foto) {
            try {
                if (fotos.contains(new_foto)) {
                    fotos.remove(new_foto);
                    this.qtde_fotos -= 1;
                    return true;
                } else {
                    throw new ArrayIndexOutOfBoundsException(); //Não sei se e a Exception correta
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Foto não existe dentro da postagem");
                return false;
            }
        }

        public boolean posta() {
            try {
                if (qtde_fotos < 1) {
                    throw new ArithmeticException();
                }
            }catch (ArithmeticException e){
                System.out.println("Nao ha foto ligado a postagem");
                return false;
            }
            this.data_postagem = LocalDateTime.now();
            return true;
        }

        public boolean comenta() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Texto do comentario: ");
            String texto = sc.nextLine();
            System.out.println("fixado? true/false: ");
            boolean fixado = sc.nextBoolean();
            Comentario comentario = new Comentario(texto, fixado);
            if(fixado) {
                this.listaComentarios.add(qtde_fixados, comentario); //Nao sei se ta certo
                this.qtde_fixados += 1;
            }else {
                this.listaComentarios.add(comentario);
            }
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
