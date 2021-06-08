public class MumbaiAajTak implements IObserver{
    @Override
    public void onUpdate(News news) {
        System.out.println(news.getNews());
    }

    public NewsType getNewsType() {
        return NewsType.MUMBAI_NEWS;
    }
}
