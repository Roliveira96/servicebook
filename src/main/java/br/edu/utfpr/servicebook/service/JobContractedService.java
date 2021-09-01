package br.edu.utfpr.servicebook.service;

import br.edu.utfpr.servicebook.model.entity.*;
import br.edu.utfpr.servicebook.model.repository.JobContractedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class JobContractedService {

    @Autowired
    private JobContractedRepository jobContractedRepository;

    public JobContracted save(JobContracted entity) {
        return jobContractedRepository.save(entity);
    }

    public void delete(Long id) {
        jobContractedRepository.deleteById(id);
    }

    public List<JobContracted> findAll() {
        return this.jobContractedRepository.findAll();
    }

    public List<JobContracted> findByIdProfessional(Long id) {
        return this.jobContractedRepository.findByIdProfessional(id);
    }

    public Optional<Long> countByProfessional(Professional professional) {
        return this.jobContractedRepository.countByProfessional(professional);
    }

    public Optional<Long> countRatingByProfessional(Professional professional) {
        return this.jobContractedRepository.countRatingByProfessional(professional);
    }

    public Optional<Long> countCommentsByProfessional(Professional professional) {
        return this.jobContractedRepository.countCommentsByProfessional(professional);
    }

    public Optional<Long> countByProfessionalAndJobRequest_Expertise(Professional professional, Expertise expertise) {
        return this.jobContractedRepository.countByProfessionalAndJobRequest_Expertise(professional, expertise);
    }

    public Optional<Long> countRatingByProfessionalAndJobRequest_Expertise(Professional professional, Expertise expertise) {
        return this.jobContractedRepository.countRatingByProfessionalAndJobRequest_Expertise(professional, expertise);
    }

    public Optional<Long> countCommentsByProfessionalAndJobRequest_Expertise(Professional professional, Expertise expertise) {
        return this.jobContractedRepository.countCommentsByProfessionalAndJobRequest_Expertise(professional, expertise);
    }

    public Page<JobContracted> findByJobRequest_StatusAndProfessional (JobRequest.Status status, Professional professional, Pageable pageable){
        return this.jobContractedRepository.findByJobRequest_StatusAndProfessional(status, professional, pageable);
    }

    public Page<JobContracted> findByJobRequest_StatusAndJobRequest_ExpertiseAndProfessional (JobRequest.Status status, Expertise expertise, Professional professional, Pageable pageable){
        return this.jobContractedRepository.findByJobRequest_StatusAndJobRequest_ExpertiseAndProfessional(status, expertise, professional, pageable);
    }
    public Page<JobContracted> findByJobRequest_StatusAndJobRequest_Client(JobRequest.Status status, Client client, Pageable pageable){
        return this.jobContractedRepository.findByJobRequest_StatusAndJobRequest_Client(status, client, pageable);
    }


}
