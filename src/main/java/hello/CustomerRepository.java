package main.java.hello;

/**
 * User: Akhil Shastri
 * Date: 10/28/13
 * Time: 10:29 AM
 */
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
