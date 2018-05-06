package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

class GuessingGame {
    private String player;
    private Integer number, attempts, maxNumber;

    GuessingGame(String player, Integer maxNumber) {
        this.player = player;
        this.maxNumber = maxNumber;
        this.attempts = 0;

        Random randomGenerator = new Random();
        this.number = randomGenerator.nextInt(maxNumber);
    }

    void startGuessingGame(BufferedReader in, PrintWriter out) throws IOException{
        System.out.println("game started");
        String request = "";
        Integer number = 0;
        while(!request.equalsIgnoreCase("close")){
            request = in.readLine();
            if(!request.equalsIgnoreCase("submit"))
                continue;

            number = Integer.valueOf(in.readLine());
            this.attempts++;
            if(number.equals(this.number))
                out.println("Congratulation");
            else {
                if (number < this.number)
                    out.println("Larger");
                else
                    out.println("Smaller");
            }
        }
        if(!number.equals(this.number))
            out.println("You failed. The number was " + this.number + ". You made " + this.attempts + " attempts.");
    }
}
