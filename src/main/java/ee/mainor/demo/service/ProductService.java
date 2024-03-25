package ee.mainor.demo.service;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import ee.mainor.demo.mapper.ProductMapper;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    public ProductDto create(CreateProductRequest createProductRequest) {
        // saving goes here
        ProductDto productDto = ProductMapper.toDto(createProductRequest);
        productDto.setId(1L);

        int price = createProductRequest.getName().length();
        productDto.setPrice(price);
        return productDto;
    }

}
