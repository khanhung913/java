package jp.co.notebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.notebook.entity.Role;
import jp.co.notebook.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;

	public Role handleFindRoleById(long id) {
		return this.roleRepository.findById(id);
	}

	public Role handleFindRoleByName(String name) {
		return this.roleRepository.findByRole(name);

	}
}
