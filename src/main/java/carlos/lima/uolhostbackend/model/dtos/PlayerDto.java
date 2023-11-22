package carlos.lima.uolhostbackend.model.dtos;

import carlos.lima.uolhostbackend.model.GroupType;

public record PlayerDto(String name, String email, String phoneNumber, GroupType groupType) {
}
