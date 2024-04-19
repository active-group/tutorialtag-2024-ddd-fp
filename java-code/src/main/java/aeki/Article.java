package aeki;

public class Article {
    private final ArticleName articleName;
    private final ArticleCategory articleCategory;

    public Article(ArticleName articleName, ArticleCategory articleCategory) {
        this.articleName = articleName;
        this.articleCategory = articleCategory;
    }

    public ArticleName getArticleName() {
        return articleName;
    }

    public ArticleCategory getArticleCategory() {
        return articleCategory;
    }
}
