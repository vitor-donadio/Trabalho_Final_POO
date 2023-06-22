package sistema.estrutura;

import sistema.postagem.*;

//Duvida em como a PostavelFactoryFunciona
public class PostavelFactory {
     /*private boolean atribuir;  1. Senti a nescessidade de uma forma de criar o Objeto Postavel, com parametros  atribuidos a ele
                               dessa maneira criei um atributo e um constutor para facilitar a implementação.
                               O objeto postavel factory vem agora com o atributo atribuir para que quando o metodo getPostavel
                               for chamado possamos fazer a distinção entre o Postavel com atributos e o sem.*/

    //public PostavelFactory(boolean new_atribuir){
        //this.atribuir = new_atribuir;
    //}
    //Duvida a classe Factory pode ter construtor?

    public Postavel getPostavel(String post_tipo){
        if(post_tipo.equals("POSTVIDEO")){
            /*if (atribuir){
                Scanner sc = new Scanner(System.in);
                System.out.println("Informe a url do video: ");
                String url = sc.nextLine();
                System.out.println("Informe a frame_rate do video: ");
                int frame_rate = sc.nextInt();
                System.out.println("Informe a duração do video: ");
                int duracao = sc.nextInt();
                Video novo_video = new Video(frame_rate, duracao, url);
                PostVideo video = new PostVideo(novo_video);
                return video;
            } */
            PostVideo video = new PostVideo();
            return video;
        } else if (post_tipo.equals("POSTFOTO")) {
            /*if(atribuir){
                Scanner sc = new Scanner(System.in);                    //Tentativa de fazer o Factory com parametros não
                System.out.println("Informe a url da foto: ");          //deu certo :)
                String url = sc.nextLine();
                System.out.println("Informe a resoulção da foto: ");
                String resolucao = sc.nextLine();
                System.out.println("Informe a localização da foto: ");
                String localizacao = sc.nextLine();;
                Foto nova_foto = new Foto(resolucao, url);
                PostFoto foto = new PostFoto(nova_foto, localizacao);
            } */
            PostFoto foto = new PostFoto();
            return foto;
        }
        throw new IllegalArgumentException("Argumentos Invalido.%nInsira POSTVIDEO ou POSTFOTO");
    }
}
