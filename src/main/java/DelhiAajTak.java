public class DelhiAajTak implements IObserver {
    @Override
    public void onUpdate(News news) {
        System.out.println(news.getNews());
    }

    public NewsType getNewsType() {
        return NewsType.DELHI_NEWS;
    }
}
