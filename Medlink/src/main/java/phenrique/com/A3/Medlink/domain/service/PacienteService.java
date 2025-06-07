package phenrique.com.A3.Medlink.domain.service;

import phenrique.com.A3.Medlink.domain.entities.Paciente;
import phenrique.com.A3.Medlink.domain.repository.PacienteRepository;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class PacienteService {
 
    private final PacienteRepository pacienteRepository;

   public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    // Add methods to handle business logic related to Paciente
    // For example, methods to create, update, delete, and retrieve Paciente entities

    // Example method to save a Paciente
    public void savePaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    // Example method to find a Paciente by ID
    public Optional<Paciente> findPacienteById(String email) {
        return pacienteRepository.findByEmail(email);
    }
    
}
