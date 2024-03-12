package ee.mainor.demo.service;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public ProductDto create(CreateProductRequest createProductRequest) {
        // saving goes here

        ProductDto productDto = new ProductDto();
        productDto.setId(1L);
        productDto.setName(createProductRequest.getName());
        productDto.setDescription(createProductRequest.getDescription());
        return productDto;
    }

}
