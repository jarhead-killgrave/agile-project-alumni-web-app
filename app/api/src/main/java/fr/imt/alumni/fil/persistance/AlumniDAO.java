package fr.imt.alumni.fil.persistance;

import fr.imt.alumni.fil.domain.bo.Alumnus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface AlumniDAO extends JpaRepository<Alumnus, UUID> {    
    @Query(value="SELECT COUNT(*) FROM alumni", nativeQuery=true)
    long getTotal();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE is_stayed = true", nativeQuery = true)
    long getTotalAlumniStayed();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE country = 'France'", nativeQuery = true)
    long getTotalAlumniInFrance();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE country != 'France'", nativeQuery = true)
    long getTotalAlumniAbroad();

    @Query(value = "SELECT COUNT(DISTINCT current_company) FROM alumni", nativeQuery = true)
    long getTotalCurrentCompanies();

    @Query(value = "SELECT (SELECT COUNT(*) FROM alumni WHERE sex = '0')::float / (SELECT COUNT(*) FROM alumni)::float * 100 AS percentage_female", nativeQuery = true)
    long getTotalFemaleAlumni();

    @Query(value = "SELECT (SELECT COUNT(*) FROM alumni WHERE sex = '1')::float / (SELECT COUNT(*) FROM alumni)::float * 100 AS percentage_male", nativeQuery = true)
    long getTotalHommeAlumni();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE country = 'Portugal'", nativeQuery = true)
    long getTotalAlumniInPortugal();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE country = 'Angleterre'", nativeQuery = true)
    long getTotalAlumniInAngleterre();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE country = 'Espagne'", nativeQuery = true)
    long getTotalAlumniInEspagne();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE country = 'Suisse'", nativeQuery = true)
    long getTotalAlumniInSuisse();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE country = 'Canada'", nativeQuery = true)
    long getTotalAlumniInCanada();

    @Query(value = "SELECT COUNT(*) FROM alumni WHERE country = 'Pays-Bas'", nativeQuery = true)
    long getTotalAlumniInPaysBas();

    @Query(value = "SELECT coop_company, COUNT(*) AS alternant_count FROM alumni GROUP BY coop_company HAVING COUNT(*) >= 2 ORDER BY alternant_count DESC", nativeQuery = true)
    List<Object[]> getCompaniesByAlumniCount();

    Set<Alumnus> findByGraduationYear(String graduationYear);

}
