package DIP;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
	Optional<Customer> findById(int id);
	List<Customer> findAll();
	Optional<Customer> findByName(String name);
	

}
