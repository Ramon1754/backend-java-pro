package br.com.ebac.memelandia.repositories;

import com.exemplo.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
