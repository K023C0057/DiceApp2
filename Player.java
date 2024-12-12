package DiceApp2;

public class Player {
    int me; //プレイヤーの出目を保持

    void turn(Dice d){
        d.roll(); 
        me = d.me;
    }
}
