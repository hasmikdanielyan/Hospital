package com.company.carservice;

import java.util.ArrayList;
import java.util.List;

public class Administration {

    private int profit;
    private List<Patients> patients = new ArrayList<>();

    private void incrementProfit(int treatmentFee){

        profit += treatmentFee;
    }
    public List<Patients> getPatients() {
        return patients;
    }

    public void addPatient(){
        Patients patient=new Patients();
        this.patients.add(patient);
    }
    public void printPatientsList(){
        for(int i=0; i<patients.size(); ++i){
            System.out.println(i + " " + patients.toString());
        }
    }
}
