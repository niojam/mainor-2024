package ee.mainor.demo.service;

import ee.mainor.demo.dto.GameDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class GameService {
    private ArrayList<GameDTO> games = new ArrayList<>();
    private Random random = new Random();

    public int createNewGame(){
        int target = random.nextInt(100);
        int id = games.size();
        GameDTO gameDTO = new GameDTO();
        gameDTO.setId(id);
        gameDTO.setTargetNumber(target);
        games.add(gameDTO);
        return id;
    }

    public String guess(int id, int guessNumber){

        if (id < 0 | id >= games.size()){
            return "invalid game ID";
        }

        GameDTO gameDTO = games.get(id);

        if (gameDTO.isComplete()){
            return "Game is finished, it took you %d times".formatted(gameDTO.getTryCount());
        }


        gameDTO.setTryCount(gameDTO.getTryCount()+1);

        if (guessNumber == gameDTO.getTargetNumber()){
            gameDTO.setComplete(true);
            return "Correct, it took you %d times".formatted(gameDTO.getTryCount());
        }

        if (guessNumber < gameDTO.getTargetNumber()){

            return "Nr is bigger";
        }
        return "Nr is smaller";
    }
}
