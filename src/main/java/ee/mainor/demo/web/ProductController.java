package ee.mainor.demo.web;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import ee.mainor.demo.dto.UpdateProductRequest;
import ee.mainor.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductDto create(@RequestBody CreateProductRequest request) {
        return productService.create(request);
    }
    @PutMapping
    public ProductDto update(@RequestBody UpdateProductRequest request) {
        return null;
    }

    @DeleteMapping
    public ProductDto update() {
        return null;
    }

}
