package sistema.estrutura;
import sistema.postagem.*;

import java.util.Scanner;

//Duvida em como a PostavelFactoryFunciona
public class PostavelFactory {

    public static Postavel getPostavel(String post_tipo){
        try {
            if (post_tipo.equals("POSTVIDEO")) {
                return new PostVideo();
            } else if (post_tipo.equals("POSTFOTO")) {
                return new PostFoto();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
        System.out.println("Erro = " + e + ": Insira POSTVIDEO ou POSTFOTO");
        return null;
        }
    }
}
