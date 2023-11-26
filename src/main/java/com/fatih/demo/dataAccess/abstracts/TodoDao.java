package com.fatih.demo.dataAccess.abstracts;

import com.fatih.demo.entities.concretes.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TodoDao extends JpaRepository<Todo, Long> {

}
