package ee.mainor.demo.service;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.model.Product;
import ee.mainor.demo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void createGame() {
        Product product = new Product();
        product.setId(1L);
        when(productRepository.save(any())).thenReturn(product);

        Long result =  productService.create(new CreateProductRequest()).getId();

        assertThat(result).isEqualTo(1L);
    }

}