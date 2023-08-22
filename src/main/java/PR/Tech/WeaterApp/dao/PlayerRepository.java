package PR.Tech.WeaterApp.dao;

import PR.Tech.WeaterApp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
