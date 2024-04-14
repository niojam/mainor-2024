package ee.mainor.demo.integration;

import ee.mainor.demo.EnableTestcontainers;
import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import ee.mainor.demo.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@EnableTestcontainers
@SpringBootTest
public class ProductIntegrationTest {

    @Autowired
    private ProductService productService;


    @Test
    public void wshouldCreateProduct() {
        CreateProductRequest createProductRequest = new CreateProductRequest();
        String name = "TestName";
        createProductRequest.setName(name);
        ProductDto result =  productService.create(createProductRequest);

        assertThat(result.getName()).isEqualTo(name);
    }

}
