package com.diarra.systeme.dao.formation;

import com.diarra.systeme.bean.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface FormationDao extends JpaRepository<Formation, Long> {

}
