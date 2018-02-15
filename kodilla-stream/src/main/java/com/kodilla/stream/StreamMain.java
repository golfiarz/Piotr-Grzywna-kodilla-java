package com.kodilla.stream;

import com.kodilla.stream.beautifler.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.references.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("zwykływyraz", text -> "ABC" + "zwykływyraz" + "ABC");
        poemBeautifier.beautify("zwykływyraz", text -> toUpperCase(text));
        poemBeautifier.beautify("zwykływyraz", text -> "NIE" + text);
        poemBeautifier.beautify("zwykływyraz", text -> text.replace("zw", "to był zw"));

    }




}
