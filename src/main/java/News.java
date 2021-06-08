enum  NewsType { BIZ_NEWS, DELHI_NEWS, MUMBAI_NEWS}

public class News {
    String news;
    NewsType newsType;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public NewsType getNewsType() {
        return newsType;
    }

    public void setNewsType(NewsType newsType) {
        this.newsType = newsType;
    }
}
