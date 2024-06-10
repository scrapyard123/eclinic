// SPDX-License-Identifier: MIT

package eclinic.data;

import eclinic.model.Visit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
    @Query(value = "SELECT * FROM visit WHERE patient_fk = ?1 AND date_time > NOW()", nativeQuery = true)
    Iterable<Visit> findUpcomingVisits(Long patientId);
}
