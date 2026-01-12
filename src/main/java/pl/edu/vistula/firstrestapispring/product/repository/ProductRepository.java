package pl.edu.vistula.firstrestapispring.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.vistula.firstrestapispring.product.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long >{

}


