package com.mausoft.professionals.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mausoft.professionals.book.entity.EducationProfile;
import com.mausoft.professionals.book.entity.Hobby;
import com.mausoft.professionals.book.entity.ProfessionalProfile;
import com.mausoft.professionals.book.entity.Profile;
import com.mausoft.professionals.book.entity.projections.IProfileSummary;
import com.mausoft.professionals.book.repository.IEducationProfileRepository;
import com.mausoft.professionals.book.repository.IHobbyRepository;
import com.mausoft.professionals.book.repository.IProfessionalProfileRepository;
import com.mausoft.professionals.book.repository.IProfileRepository;
import com.mausoft.professionals.book.service.IProfileService;

@Service("professionalProfileService")
public class ProfileService implements IProfileService {
	@Autowired
	private IProfileRepository profileRepository;
	
	@Autowired
	private IProfessionalProfileRepository professionalProfileRepository;
	
	@Autowired
	private IEducationProfileRepository educationProfileRepository;
	
	@Autowired
	private IHobbyRepository hobbyRepository;
	
	@Override
	public Profile getProfile(long profileId) {
		return profileRepository.findById(profileId).orElse(null);
	}
	
	@Override
	public IProfileSummary getProfileSummary(long profileId) {
		return profileRepository.findProjectedById(profileId);
	}
	
	@Override
	public ProfessionalProfile getProfessionalProfile(long profileId) {
		return professionalProfileRepository.findByProfile(new Profile(profileId));
	}

	@Override
	public EducationProfile getEducationProfile(long profileId) {
		return educationProfileRepository.findByProfile(new Profile(profileId));
	}

	@Override
	public List<Hobby> getHobbies(long profileId) {
		return hobbyRepository.findByProfile(new Profile(profileId));
	}

}