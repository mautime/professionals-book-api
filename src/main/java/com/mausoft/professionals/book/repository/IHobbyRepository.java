package com.mausoft.professionals.book.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mausoft.common.repository.IBaseRepository;
import com.mausoft.professionals.book.entity.Hobby;
import com.mausoft.professionals.book.entity.Profile;

@Repository("hobbyRepository")
public interface IHobbyRepository extends IBaseRepository<Hobby, Long> {
	public List<Hobby> findByProfile(Profile profile);
}
