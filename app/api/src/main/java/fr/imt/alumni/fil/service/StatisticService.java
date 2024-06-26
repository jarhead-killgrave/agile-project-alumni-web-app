package fr.imt.alumni.fil.service;

import fr.imt.alumni.fil.persistance.AlumniDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticService {
    
    private final AlumniDAO repository;

    public StatisticService(AlumniDAO repository) {
        this.repository = repository;
    }

    public long getTotalAlumni() {
        return repository.getTotal();
    }

    public long getTotalStayed() {
        return repository.getTotalAlumniStayed();
    }

    public long getTotalAlumniInFrance() {
        return repository.getTotalAlumniInFrance();
    }

    public long getTotalAlumniAbroad() {
        return repository.getTotalAlumniAbroad();
    }

    public long getTotalCurrentCompanies() {
        return repository.getTotalCurrentCompanies();
    }

    public long getTotalFemaleAlumni() {
        return repository.getTotalFemaleAlumni();
    }

    public long getTotalHommeAlumni() {
        return repository.getTotalHommeAlumni();
    }

    public long getTotalAlumniInPortugal() {
        return repository.getTotalAlumniInPortugal();
    }

    public long getTotalAlumniInAngleterre() {
        return repository.getTotalAlumniInAngleterre();
    }

    public long getTotalAlumniInEspagne() {
        return repository.getTotalAlumniInEspagne();
    }

    public long getTotalAlumniInSuisse() {
        return repository.getTotalAlumniInSuisse();
    }

    public long getTotalAlumniInCanada() {
        return repository.getTotalAlumniInCanada();
    }

    public long getTotalAlumniInPaysBas() {
        return repository.getTotalAlumniInPaysBas();
    }

    public List<Object[]> getCompaniesByAlumniCount() {
        return repository.getCompaniesByAlumniCount();
    }
    
}
