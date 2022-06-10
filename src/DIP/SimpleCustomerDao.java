package DIP;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SimpleCustomerDao implements CustomerDao{
	@Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
    
    public Optional<Customer> findByName(String name) {
        return Optional.ofNullable(customers.get(name));
    }

}
