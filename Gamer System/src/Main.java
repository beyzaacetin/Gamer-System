import Abstract.IPlayerService;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {
    public static void main(String[] args){
        Player player1 = new Player(1,"Beyza","Çetin",2001,"Turkey");
        Game game1 = new Game("Adventure",100);
        Campaign campaign1 = new Campaign("New Year Cmapaign", 10);

        //IPlayerService playerService = new PlayerManager();
        GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.sale(game1,player1,campaign1);

    }
}
