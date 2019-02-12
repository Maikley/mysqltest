package com.mk.mysqltest.repo;

import com.mk.mysqltest.domain.MySqlLang;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySqlRepo extends CrudRepository<MySqlLang,Long> {
}
