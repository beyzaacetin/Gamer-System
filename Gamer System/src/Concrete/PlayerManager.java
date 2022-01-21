package Concrete;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService {

    private IPlayerCheckService playerCheckService;

    public PlayerManager(IPlayerCheckService playerCheckService){
        this.playerCheckService = playerCheckService;
    }

    @Override
    public void add(Player player) {
        if (playerCheckService.checkIfRealPerson(player)){
            System.out.println("Player added : " + player.getFirstName() + player.getLastName());
        }
        else {
            System.out.println("Player is not real person!");
        }
    }

    @Override
    public void delete(Player player) {
        System.out.println("Player deleted : " + player.getFirstName() + player.getLastName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Player updated: "+player.getFirstName() + player.getLastName());
    }
}
