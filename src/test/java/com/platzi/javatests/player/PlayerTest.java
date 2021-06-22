package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void looses_when_dice_number_is_too_low(){

        Dice dice=  Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(5);


        Player player= new Player(dice, 5);
        assertEquals(true, player.play());
    }
}