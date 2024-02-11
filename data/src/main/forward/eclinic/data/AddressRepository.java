// SPDX-License-Identifier: MIT

package eclinic.data;

import eclinic.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
