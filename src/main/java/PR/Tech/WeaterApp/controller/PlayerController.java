package PR.Tech.WeaterApp.controller;

import PR.Tech.WeaterApp.dao.PlayerRepository;
import PR.Tech.WeaterApp.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository repository;


    @GetMapping("/getAllPlayers")
    public List<Player> getPlayer() {
        return repository.findAll();
    }

    @PostMapping("/savePlayer")
    public String savePlayer(@RequestBody Player player){
        repository.save(player);
        return "Player saved...";
    }

}
