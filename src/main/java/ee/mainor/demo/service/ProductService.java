package ee.mainor.demo.service;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import ee.mainor.demo.mapper.ProductMapper;
import ee.mainor.demo.model.Product;
import ee.mainor.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductDto create(CreateProductRequest createProductRequest) {
        Product product = ProductMapper.toEntity(createProductRequest);
        return ProductMapper.toDto(productRepository.save(product));
    }

    public ProductDto update(Long id, ProductDto productDto) {
        Product product = ProductMapper.updateEntity(productDto, requireProduct(id));

        return ProductMapper.toDto(productRepository.save(product));
    }

    public List<ProductDto> getAll() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toDto)
                .toList();
    }

    public ProductDto findById(Long id) {
        Product product = requireProduct(id);
        return ProductMapper.toDto(product);
    }

    private Product requireProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("product not dount"));
    }

}
