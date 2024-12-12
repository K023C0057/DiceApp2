package DiceApp2;

public class Game {
    Player p1, p2; //2人のプレイヤー
    Dice d;

    Game(){
        p1 = new Player();
        p2 = new Player();
        d = new Dice();
    } 

    void start(){
        System.out.println("Player1のターン");
        p1.turn(d);
        System.out.println("Player1の目: " + p1.me);

        System.out.println("Player2のターン");
        p2.turn(d);
        System.out.println("Player2の目: " + p2.me);
    }

    void judge(){
        if (p1.me > p2.me) {
            System.out.println("Player1の勝ち");
        }
        else if (p1.me < p2.me) {
            System.out.println("Player2の勝ち");
        }

        else {
            System.out.println("同点");
        }
    }
}