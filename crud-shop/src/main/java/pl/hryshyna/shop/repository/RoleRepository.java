package pl.hryshyna.shop.repository;

import org.springframework.data.repository.CrudRepository;
import pl.hryshyna.shop.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
