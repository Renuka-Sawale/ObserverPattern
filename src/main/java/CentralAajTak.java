import java.util.ArrayList;
import java.util.List;

public class CentralAajTak {

    List<IObserver> objectList = new ArrayList<IObserver>();

    public void register(IObserver instance) {
        objectList.add(instance);
    }

    public void update(News news) {
        objectList.stream()
                  .filter(object -> object.getNewsType().equals(news.getNewsType()))
                  .forEach(object -> object.onUpdate(news));
    }
}

