package com.example.random;

import java.util.Random;
import java.util.SplittableRandom;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class RandomGeneratorDemo {
    public static void main(String... args) {

        // random number generation using the legacy API
        Random oldDice = new Random();
        System.out.print("""
                
                Old Dice Thrown
                ---------------
                """);
        System.out.println(oldDice.nextInt(1, 6));
        System.out.println(oldDice.nextInt(1, 6));

        System.out.print("""
                
                New Dice Thrown (one by one)
                ----------------------------
                """);
        // random number generation using new API
        RandomGenerator dice1 = RandomGenerator.getDefault(); // use default algorithm
        RandomGenerator dice2 = RandomGenerator.of("L128X1024MixRandom"); // use specified algorithm


        // old interface still holds good
        System.out.println(dice1.nextInt(1,6));
        System.out.println(dice2.nextInt(1, 6));

        System.out.print("""
                
                New Dice Thrown (together)
                ----------------------------
                """);
        // generating random numbers as stream
        System.out.println(dice1.ints(1, 6)
                .limit(2).boxed().collect(Collectors.toList()));


        System.out.print("""
                
                New Splitable Dice
                ------------------
                """);
        RandomGenerator.SplittableGenerator splitDice1 = new SplittableRandom();
        System.out.println(splitDice1.nextInt(1, 6));
        RandomGenerator splitDice2 = splitDice1.split();
        System.out.println(splitDice2.nextInt(1, 6));

        System.out.print("""
                
                New Jumpable Dice
                ------------------
                """);
        RandomGenerator.JumpableGenerator jumpDice = RandomGenerator.JumpableGenerator.of("Xoroshiro128PlusPlus");
        System.out.println(jumpDice.nextInt(1, 6));
        jumpDice.jump();
        System.out.println(jumpDice.nextInt(1, 6));


        //
        // JumpableGenerator
        // ArbitrarilyJumpableGenerator
        // LeapableGenerator
        // StreamableGenerator
    }
}
