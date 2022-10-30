package ru.amaeretran.pp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.amaeretran.pp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
