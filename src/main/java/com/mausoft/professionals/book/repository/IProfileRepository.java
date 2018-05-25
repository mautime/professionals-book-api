package com.mausoft.professionals.book.repository;

import org.springframework.stereotype.Repository;

import com.mausoft.common.repository.IBaseRepository;
import com.mausoft.professionals.book.entity.Profile;
import com.mausoft.professionals.book.entity.projections.IProfileSummary;

@Repository("profileRepository")
public interface IProfileRepository extends IBaseRepository<Profile, Long> {
	public IProfileSummary findProjectedById(long id);
}