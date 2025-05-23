package jp.co.notebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.notebook.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

	User findById(long id);
}
