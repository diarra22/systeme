package com.diarra.systeme.dao.salle;
import com.diarra.systeme.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diarra.systeme.bean.Salle;

@Repository
public interface SalleDao extends JpaRepository<Salle, Long> {



}
