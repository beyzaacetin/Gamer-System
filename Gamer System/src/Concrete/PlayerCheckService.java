package Concrete;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerCheckService implements IPlayerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        return true;
    }
}
