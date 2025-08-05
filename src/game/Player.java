package game;

public class Player 
{
    private int health;
    private int score;

    public Player() 
    {
        this.health = 100;
        this.score = 0;
    }

    public int getHealth() { return health; }
    public int getScore() { return score; }

    public void addScore(int points) { score += points; }
    public void reduceScore(int points) {score += points; }
    public void reduceHealth(int damage) { health -= damage; }
}
