package com.mausoft.professionals.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mausoft.common.http.IAjaxResponse;
import com.mausoft.common.http.SuccessAjaxResponse;
import com.mausoft.professionals.book.service.IProfileService;

@RestController
@RequestMapping(path="/profile", produces={MediaType.APPLICATION_JSON_VALUE})
public class ProfileController {
	
	@Autowired
	private IProfileService profileService;
	
	@GetMapping(path="/{id}")
	public ResponseEntity<IAjaxResponse> getProfile(@PathVariable Long id){
		return ResponseEntity.ok(new SuccessAjaxResponse("data", profileService.getProfile(id)));
	}
	
	@GetMapping(path="/{id}/summary")
	public ResponseEntity<IAjaxResponse> getProfileSummary(@PathVariable Long id){
		return ResponseEntity.ok(new SuccessAjaxResponse("data", profileService.getProfileSummary(id)));
	}
	
	@GetMapping(path="/{id}/professional")
	public ResponseEntity<IAjaxResponse> getProfessionalExperience(@PathVariable Long id){
		return ResponseEntity.ok(new SuccessAjaxResponse("data", profileService.getProfessionalProfile(id)));
	}
	
	@GetMapping(path="/{id}/education")
	public ResponseEntity<IAjaxResponse> getEducationAchievements(@PathVariable Long id){
		return ResponseEntity.ok(new SuccessAjaxResponse("data", profileService.getEducationProfile(id)));
	}
	
	@GetMapping(path="/{id}/hobbies")
	public ResponseEntity<IAjaxResponse> getHobbies(@PathVariable Long id){
		return ResponseEntity.ok(new SuccessAjaxResponse("data", profileService.getHobbies(id)));
	}
}