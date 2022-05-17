package com.codeup.springblog.respositories;
import com.codeup.springblog.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

}
