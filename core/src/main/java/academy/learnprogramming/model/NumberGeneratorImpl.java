package academy.learnprogramming.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {
    @Getter
    private final int maxNumber;
    @Getter
    private final int minNumber;

    // == fields ==
    private final Random random = new Random();

    // == constructors ==
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // == public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber - minNumber) + minNumber;

    }


}
