// SPDX-License-Identifier: MIT

package eclinic.data;

import eclinic.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}
