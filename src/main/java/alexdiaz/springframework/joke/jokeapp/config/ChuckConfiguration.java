package alexdiaz.springframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is util when your work with external dependencys
 * Dis-comment for use it
 */
//@Configuration
public class ChuckConfiguration {
    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
