package ee.mainor.demo.dto;

import lombok.Data;

@Data
public class CreateProductRequest {

    private String name;
    private String description;
    private Integer price;

}
