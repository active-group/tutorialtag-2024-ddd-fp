package aeki;

// Test-Driven Development

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CartTest {
    @Test
    void givenCart_whenPuttingALifestyleArticle_thenDeliverAddressCanBePackstation() {
        var cart = new Cart();
        
        cart.put(new Article(new ArticleName("candle diffuser"),
            ArticleCategory.LIFESTYLE));
        
        assertThat(cart.isDeliverable(AddressType.PACKSTATION)).isTrue();
    }
    
    @Test
    void givenCart_whenPuttingAFurnitureArticle_thenDeliverAddressCannotBePackstation() {
        var cart = new Cart();
        
        cart.put(new Article(new ArticleName("sofa"),
            ArticleCategory.FURNITURE));
        
        assertThat(cart.isDeliverable(AddressType.PACKSTATION)).isFalse();
    }
}
