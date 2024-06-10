// SPDX-License-Identifier: MIT

package eclinic.data;

import eclinic.model.Clinic;
import org.springframework.data.repository.CrudRepository;

public interface ClinicRepository extends CrudRepository<Clinic, Long> {
}
