package pl.hryshyna.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hryshyna.shop.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
