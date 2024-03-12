package ee.mainor.demo.web;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import ee.mainor.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("product")
    public ProductDto create(@RequestBody CreateProductRequest request) {
        return productService.create(request);
    }

}
