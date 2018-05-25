package com.mausoft.professionals.book.repository;

import org.springframework.stereotype.Repository;

import com.mausoft.common.repository.IBaseRepository;
import com.mausoft.professionals.book.entity.EducationProfile;
import com.mausoft.professionals.book.entity.Profile;

@Repository("educationAchievementRepository")
public interface IEducationProfileRepository extends IBaseRepository<EducationProfile, Long> {
	public EducationProfile findByProfile(Profile profileId);
}