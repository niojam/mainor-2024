package ee.mainor.demo.service;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import ee.mainor.demo.mapper.ProductMapper;
import ee.mainor.demo.model.User;
import ee.mainor.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final UserRepository userRepository;
    private final Random random = new Random();

    public ProductDto create(CreateProductRequest createProductRequest) {
        // saving goes here
        ProductDto productDto = ProductMapper.toDto(createProductRequest);
        productDto.setId(1L);

        int price = createProductRequest.getName().length();
        productDto.setPrice(price);
        return productDto;
    }

}
