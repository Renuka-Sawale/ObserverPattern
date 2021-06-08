public class BizAajTak implements IObserver {

    @Override
    public void onUpdate(News news) {
        System.out.println(news.getNews());
    }

    public NewsType getNewsType() {
        return NewsType.BIZ_NEWS;
    }
}

