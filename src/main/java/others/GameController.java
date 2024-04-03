package others;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/game")
@CrossOrigin(origins = "*") // Adjust according to your React app's URL
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/move")
    public ResponseEntity<GameState> makeMove(@RequestBody Move move) {
        return ResponseEntity.ok(gameService.makeMove(move));
    }

    @GetMapping("/state")
    public ResponseEntity<GameState> getGameState() {
        return ResponseEntity.ok(gameService.getGameState());
    }

    @PostMapping("/reset")
    public ResponseEntity<GameState> resetGame() {
        gameService.resetGame();
        return ResponseEntity.ok(gameService.getGameState());
    }

    @GetMapping("/test")
    public ResponseEntity<String> testCors() {
        return ResponseEntity.ok("CORS is configured properly!");
    }
}
