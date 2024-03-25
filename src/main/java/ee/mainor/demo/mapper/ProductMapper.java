package ee.mainor.demo.mapper;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;

public class ProductMapper {

    public static ProductDto toDto(CreateProductRequest request) {
        ProductDto productDto = new ProductDto();
        productDto.setDescription(request.getDescription());
        productDto.setName(request.getName());
        return productDto;
    }

}
