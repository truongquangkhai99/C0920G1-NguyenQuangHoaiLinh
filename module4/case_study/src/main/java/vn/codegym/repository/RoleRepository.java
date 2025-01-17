package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
