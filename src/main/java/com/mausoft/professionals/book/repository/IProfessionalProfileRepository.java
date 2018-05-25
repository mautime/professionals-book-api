package com.mausoft.professionals.book.repository;

import org.springframework.stereotype.Repository;

import com.mausoft.common.repository.IBaseRepository;
import com.mausoft.professionals.book.entity.ProfessionalProfile;
import com.mausoft.professionals.book.entity.Profile;

@Repository("professionalExperienceRepository")
public interface IProfessionalProfileRepository extends IBaseRepository<ProfessionalProfile, Long> {
	public ProfessionalProfile findByProfile(Profile profile);
}