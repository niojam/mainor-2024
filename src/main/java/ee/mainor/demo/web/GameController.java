package ee.mainor.demo.web;

import ee.mainor.demo.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/game")
    public String getGameID(){
        return "id: " + gameService.createNewGame();
    }

    @GetMapping("/game/{game_id}/guess/{number}")
    public String guess(@PathVariable int game_id, @PathVariable int number){

        return gameService.guess(game_id, number);
    }

}
