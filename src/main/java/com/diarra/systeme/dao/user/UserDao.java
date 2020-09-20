package com.diarra.systeme.dao.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diarra.systeme.bean.User;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

    /*
     * Recherche d'un utilisateur
     */
    User findByUsername(String username);

}
