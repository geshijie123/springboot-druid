package com.gsj.dao;
import com.gsj.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PersonDao extends JpaRepository<Person, Integer> {
}
