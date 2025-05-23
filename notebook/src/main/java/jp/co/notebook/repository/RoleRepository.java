package jp.co.notebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.notebook.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findById(long id);

	Role findByRole(String name);

}
