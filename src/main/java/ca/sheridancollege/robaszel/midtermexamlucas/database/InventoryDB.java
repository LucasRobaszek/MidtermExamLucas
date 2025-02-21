package ca.sheridancollege.robaszel.midtermexamlucas.database;

import ca.sheridancollege.robaszel.midtermexamlucas.beans.Store;
import org.springframework.data.repository.CrudRepository;

public interface InventoryDB extends CrudRepository<Store, Long> {
}
