// SPDX-License-Identifier: MIT

package eclinic.data;

import eclinic.model.Entry;
import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Long> {
}
