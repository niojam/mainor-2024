package ee.mainor.demo.web;

import ee.mainor.demo.dto.CreateProductRequest;
import ee.mainor.demo.dto.ProductDto;
import ee.mainor.demo.dto.UpdateProductRequest;
import ee.mainor.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductDto create(@RequestBody CreateProductRequest request) {
        return productService.create(request);
    }

    @PutMapping("{id}")
    public ProductDto update(@PathVariable Long id, @RequestBody ProductDto request) {
        return productService.update(id ,request);
    }

    @GetMapping("{id}")
    public ProductDto findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping
    public List<ProductDto> getAll() {
        return productService.getAll();
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
