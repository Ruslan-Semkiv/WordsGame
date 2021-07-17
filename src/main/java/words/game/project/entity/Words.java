package words.game.project.entity;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonRootName(value = "words")
public class Words {
    private String [] words = new String[0];
}
