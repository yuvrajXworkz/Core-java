package com.xworkz.hospital;

import com.xworkz.hospital.Exception.AddressNotFoundException;
import com.xworkz.hospital.Exception.PatientGenderNotUpdateException;
import com.xworkz.hospital.Exception.PatientNameNotFound;
import com.xworkz.hospital.Exception.PatientageNotFoundException;


public interface Hospital {
    public  boolean addPatients(Patients patient);
    public  void getAllPatients();
    public  boolean updatedPatientsAgeByPatientName(int updatedAge,String existingPatientName);
    public boolean updatePatientsAttenderNameByPatientId( String updatedName ,int existingPatientId);
    public  boolean updatePatientGenderByPatientId(Gender updatedgender,int existingPatientId)throws PatientGenderNotUpdateException;
    public boolean updatePatientAgeByPatientId(int updateAge,int existingPatientId);
    public  boolean deletePatientByPatientId(int patientId);

    public  String getPatientsAttenderNameByPatientId(int patientId);
    public  BloodGroup getPatientBloodGroupByPatientName( String PatientName) throws PatientNameNotFound;
    public  Gender getPatientsGenderByPatientName(String name)throws PatientNameNotFound;

    public  int getPatientAgeByPatientId( int patientId)throws PatientageNotFoundException;
    public  String getPatientAddressByPatientName(String PatientName)throws AddressNotFoundException;




}
