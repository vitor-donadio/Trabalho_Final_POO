package sistema;

import sistema.postagem.Postavel;

import java.util.ArrayList;
import java.util.List;

public class SingletonFeed {
    private static SingletonFeed instance;
    private static List<Postavel> feed = new ArrayList<>();
    private SingletonFeed(){ }

    public static SingletonFeed getInstance(){
        if(instance == null){
            instance = new SingletonFeed();
        }
        return instance;
    }

    public boolean adicionaPostagem(Postavel postavel){
        feed.add(postavel);
        return true;
    }

    public boolean deletaPostagem(Postavel postavel){
        try {
            if (feed.contains(postavel)) {
                feed.remove(postavel);
                return true;
            } else {
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println("Error = " + e + ": Postagem não existe dentro do feed");
            return false;
        }
    }

    public List<Postavel> getFeed(){
        return feed;
    }
}