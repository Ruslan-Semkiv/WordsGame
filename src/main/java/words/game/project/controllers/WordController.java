package words.game.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import words.game.project.services.WordService;
import words.game.project.entity.Words;

@RestController
@RequestMapping("/api/v1/wordsGame/")
public class WordController {
    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping
    public Words doPlay(@RequestBody Words words) {
        return wordService.playGame(words.getWords());
    }
}
