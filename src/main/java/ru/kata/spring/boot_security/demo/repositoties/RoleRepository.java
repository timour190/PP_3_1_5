package ru.kata.spring.boot_security.demo.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("select u from User u left join fetch u.roles")
    Role findByName(String name);
}