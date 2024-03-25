package ee.mainor.demo.mapper;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import ee.mainor.demo.model.Product;

public class ProductMapper {

    public static Product updateEntity(ProductDto source, Product target) {
        target.setPrice(source.getPrice());
        target.setName(source.getName());
        target.setDescription(source.getDescription());
        return target;
    }

    public static ProductDto toDto(Product request) {
        ProductDto productDto = new ProductDto();
        productDto.setId(request.getId());
        productDto.setDescription(request.getDescription());
        productDto.setName(request.getName());
        productDto.setPrice(request.getPrice());
        return productDto;
    }


    public static Product toEntity(CreateProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        return product;
    }

}
