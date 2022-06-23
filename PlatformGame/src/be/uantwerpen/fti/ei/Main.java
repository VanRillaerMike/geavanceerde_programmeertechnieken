package be.uantwerpen.fti.ei;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = Game.Game();
        System.out.println(game.s);

        game.run();
        /*
        //run game en geef wss ook config file mee.
        game.run()
        */

    }
}
