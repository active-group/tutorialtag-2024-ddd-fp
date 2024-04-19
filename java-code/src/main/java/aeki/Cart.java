package aeki;

public class Cart {
    
    Article article;
    
    public void put(Article article) {
        this.article = article;
    }

    public boolean isDeliverable(AddressType addressType) {
        return this.article.getArticleCategory() == ArticleCategory.LIFESTYLE;
    }
}
