package ee.mainor.demo.dto;
import lombok.Data;
@Data
public class GameDTO {
    private int id;
    private int targetNumber;
    private int tryCount = 0;
    private boolean complete = false;
}
