import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import words.game.project.entity.Words;
import words.game.project.services.WordService;

@ExtendWith(SpringExtension.class)
public class MyTests {
    private final WordService wordService = new WordService();

    @Test
    public void testFirstExample(){
       String [] testArray = {
               "fish",
               "horse",
               "egg",
               "goose",
               "eagle"
       };
       String [] expectedArray = {
               "fish",
               "horse",
               "egg",
               "goose",
               "eagle"
       };
       Words testObject =  wordService.playGame(testArray);
        Assertions.assertNotNull(testObject);
        Assertions.assertArrayEquals(expectedArray,testObject.getWords());
    }
    @Test
    public void testSecondExample(){
        String [] testArray = {
                "fish",
                "horse",
                "snake",
                "goose",
                "eagle"
        };
        String [] expectedArray = {
                "fish",
                "horse",
        };
        Words testObject =  wordService.playGame(testArray);
        Assertions.assertNotNull(testObject);
        Assertions.assertArrayEquals(expectedArray,testObject.getWords());
    }
    @Test
    public void testThirdExample(){
        String [] testArray = {
                "fish",
                "horse",
                "",
                "goose",
                "eagle"
        };
        String [] expectedArray = {
                "fish",
                "horse",
        };
        Words testObject =  wordService.playGame(testArray);
        Assertions.assertNotNull(testObject);
        Assertions.assertArrayEquals(expectedArray,testObject.getWords());
    }
    @Test
    public void testFourthExample(){
        String [] testArray = {
                "",
                "horse",
                "",
                "goose",
                "eagle"
        };
        String [] expectedArray = new String[0];
        Words testObject =  wordService.playGame(testArray);
        Assertions.assertNotNull(testObject);
        Assertions.assertArrayEquals(expectedArray,testObject.getWords());
    }

}
