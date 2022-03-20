package com.example.demo.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name = "TRAVEL_CLUB")
@Table(name = "TRAVEL_CLUB")
public class PracticeEntity {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID")
	private String id;
	
	@Column(name = "FOUNDATION_TIME")
	private Long foundationTime;
	
	@Column(name = "INTRO")
	private String intro;
	
	@Column(name = "NAME")
	private String name;
	
	public PracticeEntity(PracticeEntity practiceEntity) {
		BeanUtils.copyProperties(practiceEntity, this);
	}
	
	public PracticeEntity toDomain() {
		PracticeEntity practiceEntity = new PracticeEntity(this.id, this.foundationTime, this.intro, this.name);
		practiceEntity.setId(id);
		practiceEntity.setFoundationTime(this.foundationTime);
		
		return practiceEntity;
		
	}
}