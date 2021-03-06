package pl.hryshyna.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hryshyna.shop.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
