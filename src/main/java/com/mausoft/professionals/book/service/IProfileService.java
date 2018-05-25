package com.mausoft.professionals.book.service;

import java.util.List;

import com.mausoft.professionals.book.entity.EducationProfile;
import com.mausoft.professionals.book.entity.Hobby;
import com.mausoft.professionals.book.entity.ProfessionalProfile;
import com.mausoft.professionals.book.entity.Profile;
import com.mausoft.professionals.book.entity.projections.IProfileSummary;

public interface IProfileService {
	public Profile getProfile(long profileId);
	public IProfileSummary getProfileSummary(long profileId);
	public ProfessionalProfile getProfessionalProfile(long profileId);
	public EducationProfile getEducationProfile(long profileId);
	public List<Hobby> getHobbies(long profileId);
}