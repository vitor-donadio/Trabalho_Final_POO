package sistema.estrutura;
import sistema.postagem.*;

import java.util.Scanner;

//Duvida em como a PostavelFactoryFunciona
public class PostavelFactory {

    public static Postavel getPostavel(String post_tipo){
        if(post_tipo.equals("POSTVIDEO")){
            return new PostVideo();
        } else if (post_tipo.equals("POSTFOTO")) {
            return new PostFoto();
        }
        try {
            throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){
            System.out.println("Argumentos Invalido.%nInsira POSTVIDEO ou POSTFOTO");
            return null;
        }
    }
}
