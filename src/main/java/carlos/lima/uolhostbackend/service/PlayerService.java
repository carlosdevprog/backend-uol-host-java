package carlos.lima.uolhostbackend.service;

import carlos.lima.uolhostbackend.controller.Player;
import carlos.lima.uolhostbackend.infra.CodinameHandler;
import carlos.lima.uolhostbackend.model.GroupType;
import carlos.lima.uolhostbackend.model.dtos.PlayerDto;
import carlos.lima.uolhostbackend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private String getCodiname(GroupType groupType) {
        return handler.findCodiname(groupType);
    }

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
}
