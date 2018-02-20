package com.kodilla.stream.beautifler;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}
