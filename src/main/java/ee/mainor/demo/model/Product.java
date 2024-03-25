package ee.mainor.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Data
@Table(name = "product")
public class Product {

    @Id
    private Long id;
    private String name;
    private String description;
    private String currency;
    private Integer price;
    private Instant createdAt;

}
