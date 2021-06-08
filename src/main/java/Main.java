public class Main {
    public static void main(String[] args) {
        CentralAajTak centralAajTak = new CentralAajTak();
        BizAajTak bizAajTak = new BizAajTak();
        MumbaiAajTak mumbaiAajTak = new MumbaiAajTak();
        DelhiAajTak delhiAajTak = new DelhiAajTak();

        News news = new News();
        news.setNews("Delhi had heavy rainfall yesterday");
        news.setNewsType(NewsType.DELHI_NEWS);

        News mumbaiNews = new News();
        mumbaiNews.setNews("Mumbai reported 794 new covid-19 cases");
        mumbaiNews.setNewsType(NewsType.MUMBAI_NEWS);

        News bizNews = new News();
        bizNews.setNews("Stock market bubble in 2021 as per RBI");
        bizNews.setNewsType(NewsType.BIZ_NEWS);

        centralAajTak.register(bizAajTak);
        centralAajTak.register(mumbaiAajTak);
        centralAajTak.register(delhiAajTak);

        centralAajTak.update(news);
        centralAajTak.update(mumbaiNews);
        centralAajTak.update(bizNews);
    }
}
