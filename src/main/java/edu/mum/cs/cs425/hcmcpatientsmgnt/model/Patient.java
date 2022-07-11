package edu.mum.cs.cs425.hcmcpatientsmgnt.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "patients")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientId;
	@Column(nullable = false)
	@NotNull(message = " patientNumber cannot be null")
	@NotEmpty(message = " patientNumber cannot be empty ")
	@NotBlank(message = " patientNumber cannot be blank")
	private String patientNumber;
	@Column(nullable = false)
	@NotNull
	@NotBlank(message = "Is An Out Patient status cannot be blank.")
	@NotEmpty(message = "Is An Out Patient status cannot be empty")
	private String isAnOutPatient;
	@Column(nullable = false)
	@NotNull
	@NotBlank(message = "Full names cannot be blank.")
	@NotEmpty(message = "Full names cannot be empty")

	private String fullNames;

	private String emailAddress;

	private String contactPhoneNumber;
	@Column(nullable = false)
	private LocalDate dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="primary_addr_id", nullable= true)
	private PrimaryAddress primaryAddress;

	public Patient( String patientNumber, String isAnOutPatient, String fullNames, String emailAddress,
			String contactPhoneNumber, LocalDate dateOfBirth) {
		
		this.patientNumber = patientNumber;
		this.isAnOutPatient = isAnOutPatient;
		this.fullNames = fullNames;
		this.emailAddress = emailAddress;
		this.contactPhoneNumber = contactPhoneNumber;
		this.dateOfBirth = dateOfBirth;
	}

	

	public Patient() {
		 this(null, null, null,null, null, null);
		// TODO Auto-generated constructor stub
	}



	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public String getIsAnOutPatient() {
		return isAnOutPatient;
	}

	public void setIsAnOutPatient(String isAnOutPatient) {
		this.isAnOutPatient = isAnOutPatient;
	}

	public String getFullNames() {
		return fullNames;
	}

	public void setFullNames(String fullNames) {
		this.fullNames = fullNames;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(PrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }



	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientNumber=" + patientNumber + ", isAnOutPatient="
				+ isAnOutPatient + ", fullNames=" + fullNames + ", emailAddress=" + emailAddress
				+ ", contactPhoneNumber=" + contactPhoneNumber + ", dateOfBirth=" + dateOfBirth + ", primaryAddress="
				+ primaryAddress + "]";
	}





}
