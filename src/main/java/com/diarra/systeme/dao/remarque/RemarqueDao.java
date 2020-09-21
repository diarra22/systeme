package com.diarra.systeme.dao.remarque;

import com.diarra.systeme.bean.Remarque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemarqueDao extends JpaRepository<Remarque, Long> {

}
