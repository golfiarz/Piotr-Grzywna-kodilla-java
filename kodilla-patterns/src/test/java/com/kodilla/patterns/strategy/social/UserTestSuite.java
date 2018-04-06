package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User piotr = new Millenials("Piotr Grzywna");
        User bob = new ZGeneration("Bob Bean");
        User tom = new YGeneration("Tom Cat");

        //When
        String piotrSharingBy = piotr.sharePost();
        System.out.println("Piotr is sharing by :" + piotrSharingBy);
        String bobSharingBy = bob.sharePost();
        System.out.println("Bob is sharing by: " + bobSharingBy);
        String tomSharingBy = tom.sharePost();
        System.out.println("Tom is sharing by: " + tomSharingBy);

        //Then
        Assert.assertEquals("Facebook", piotrSharingBy);
        Assert.assertEquals("Snapchat", bobSharingBy);
        Assert.assertEquals("Twitter", tomSharingBy);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User piotr = new Millenials("Piotr Grzywna");

        //When
        String piotrSharingBy = piotr.sharePost();
        System.out.println("Piotr is sharing by: " + piotrSharingBy);
        piotr.setSocialPublisher(new TwitterPublisher());
        piotrSharingBy = piotr.sharePost();
        System.out.println("Piotr now is sharing by: " + piotrSharingBy);

        //Then
        Assert.assertEquals("Twitter", piotrSharingBy);

    }
}
