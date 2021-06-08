public interface IObserver {
    NewsType getNewsType();
    void onUpdate(News news);
}


