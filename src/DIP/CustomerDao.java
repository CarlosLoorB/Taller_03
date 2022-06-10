package DIP;

public interface CustomerDao {
	Optional<Customer> findById(int id);
	List<Customer> findAll();
	

}
