package com.suresh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
