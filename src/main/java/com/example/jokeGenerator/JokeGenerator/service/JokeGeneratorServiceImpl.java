package com.example.jokeGenerator.JokeGenerator.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeGeneratorServiceImpl implements JokeGeneratorService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeGeneratorServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String generateJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
