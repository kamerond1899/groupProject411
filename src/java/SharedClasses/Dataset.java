/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SharedClasses;

import java.io.Serializable;

/**  
 * IST 411-001 - Final Project
 * Dataset.java  
 * Purpose: Used to store state, vaccine, and trends data 
 *  
 * @author (Lead) River Martinez & Kameron Dangleben 
 * @version 1.0 5/4/2021
 */
public class Dataset implements Serializable{
    
    private String date;            //Date
    private String state;           //State
    private int cases;              //Number of COVID-related cases
    private int deaths;             //Number of COVID-related deaths
    private int totalVac;           //Total number of vaccines created
    private int totalDis;           //Total number of vaccines distributed
    private int peopleVac;          //Total number of people vaccinated
    private int peopleFullyVac;     //Total number of people fully vaccinated
    private int dailyVac;           //Number of vaccinations per day
    private int constructorFlag;    //Flag variable for determining the type of constructor in use
    
    public Dataset(){ //zero argument constructor
        this.constructorFlag = 1;
        this.state = null;
        this.cases = 0;
        this.deaths = 0;
        this.totalVac = 0;
        this.totalDis = 0;
        this.peopleVac = 0;
        this.peopleFullyVac = 0;
        this.dailyVac = 0;
    }
    
    public Dataset(String da, String st, int c, int de){ //State constructor

        this.constructorFlag = 2;
        this.date = da;
        this.state = st;
        this.cases = c;
        this.deaths = de;
    }
    
    public Dataset(String da, String st, int tV, int tD, int pV, int pFV, int dV){ //Vaccine constructor
        this.constructorFlag = 3;
        this.date = da;
        this.state = st;
        this.totalVac = tV;
        this.totalDis = tD;
        this.peopleVac = pV;
        this.peopleFullyVac = pFV;
        this.dailyVac = dV;
    }
    
    public Dataset(String st, int c, int de, int tV, int tD, int pV, int pFV, int dV){ //Trends Constructor
        this.constructorFlag = 4;
        this.state = st;
        this.cases = c;
        this.deaths = de;
        this.totalVac = tV;
        this.totalDis = tD;
        this.peopleVac = pV;
        this.peopleFullyVac = pFV;
        this.dailyVac = dV;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the cases
     */
    public int getCases() {
        return cases;
    }

    /**
     * @param cases the cases to set
     */
    public void setCases(int cases) {
        this.cases = cases;
    }

    /**
     * @return the deaths
     */
    public int getDeaths() {
        return deaths;
    }

    /**
     * @param deaths the deaths to set
     */
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    /**
     * @return the totalVac
     */
    public int getTotalVac() {
        return totalVac;
    }

    /**
     * @param totalVac the totalVac to set
     */
    public void setTotalVac(int totalVac) {
        this.totalVac = totalVac;
    }

    /**
     * @return the totalDis
     */
    public int getTotalDis() {
        return totalDis;
    }

    /**
     * @param totalDis the totalDis to set
     */
    public void setTotalDis(int totalDis) {
        this.totalDis = totalDis;
    }

    /**
     * @return the peopleVac
     */
    public int getPeopleVac() {
        return peopleVac;
    }

    /**
     * @param peopleVac the peopleVac to set
     */
    public void setPeopleVac(int peopleVac) {
        this.peopleVac = peopleVac;
    }

    /**
     * @return the peopleFullyVac
     */
    public int getPeopleFullyVac() {
        return peopleFullyVac;
    }

    /**
     * @param peopleFullyVac the peopleFullyVac to set
     */
    public void setPeopleFullyVac(int peopleFullyVac) {
        this.peopleFullyVac = peopleFullyVac;
    }

    /**
     * @return the dailyVac
     */
    public int getDailyVac() {
        return dailyVac;
    }

    /**
     * @param dailyVac the dailyVac to set
     */
    public void setDailyVac(int dailyVac) {
        this.dailyVac = dailyVac;
    }

    /**
     * @return the constructorFlag
     */
    public int getConstructorFlag() {
        return constructorFlag;
    }

    /**
     * @param constructorFlag the constructorFlag to set
     */
    public void setConstructorFlag(int constructorFlag) {
        this.constructorFlag = constructorFlag;
    }
    
    /**
     * 
     * @param number the number being formatted
     * @return "+" or "" + number
     */
    private static String showSign(int number) {
    return (number > 0 ? "+" : "" ) + number;
}
    
    @Override
    public String toString(){
        switch (constructorFlag) {
        
            case 2://If constructor flag is 2, format the row with "Cases and Deaths" data
                return "<tr>" + "<td>" + getDate() + "</td>" + "<td>" + getState() + "</td>" + "<td>" + getCases() + "</td>" + "<td>" + getDeaths() + "</td>"+ "</tr>";
            case 3://If constructor flag is 3, format the row with "Vaccines" data
                return "<tr>" + "<td>" + getDate() + "</td>" + "<td>" + getState() + "</td>" + "<td>" + this.getTotalVac() + "</td>" + "<td>"
                        + this.getTotalDis() + "</td>"+ "<td>" + this.getPeopleVac() + "</td>" + "<td>" + this.getPeopleFullyVac() + "</td>" + "<td>" + this.getDailyVac() + "</td>"+ "</tr>";
            case 4://If constructor flag is 4, format the row with "Trends" data. ShowSign is used to show + or - sign for changing values
                return "<tr>" + "<td>" + getState() + "</td>" + "<td>" + showSign(getCases()) + "</td>" + "<td>" + showSign(getDeaths()) + "</td>" +"<td>" + showSign(this.getTotalVac()) + "</td>" + "<td>"
                        + showSign(this.getTotalDis()) + "</td>"+ "<td>" + showSign(this.getPeopleVac()) + "</td>" + "<td>" + showSign(this.getPeopleFullyVac()) + "</td>" + "<td>" + showSign(this.getDailyVac()) + "</td>"+ "</tr>";
            default:
                return "Unable to return data.";
        }

    }
}
