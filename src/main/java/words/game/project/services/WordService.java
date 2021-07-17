package words.game.project.services;

import org.springframework.stereotype.Service;
import words.game.project.entity.Words;

import java.util.Arrays;

@Service
public class WordService {
    private int wordCounter;

    public Words playGame(String[] tempArray) {
        wordCounter = 0;
        Words resultObject = new Words();
        char latestChar = 0;
        if (tempArray.length != 0) {
            for (String lobeString : tempArray) {
                if (lobeString.isEmpty() || lobeString.toLowerCase().charAt(0) != latestChar && wordCounter != 0) {
                    break;
                } else {
                    latestChar = lobeString.toLowerCase().charAt(lobeString.length() - 1);
                    ++wordCounter;
                }
            }
        }
        resultObject.setWords(Arrays.stream(tempArray).limit(wordCounter).toArray(String[]::new));
        return wordCounter == 0 ? new Words() : resultObject;
    }
}
