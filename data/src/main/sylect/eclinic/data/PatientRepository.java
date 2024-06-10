// SPDX-License-Identifier: MIT

package eclinic.data;

import eclinic.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
