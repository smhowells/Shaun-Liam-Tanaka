/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClasses;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author smhowells
 */
public class AdminStaff extends Staff {

    private ArrayList<Rental> rentedOutHistory;

    public AdminStaff(String firstName, String lastName, String staffID,
            String email, String address, String postcode, Boolean canDrive, Date DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.staffID = staffID;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.canDrive = canDrive;
        this.DOB = DOB;
    }

    public Boolean addRentedOutHistory(Rental rental) {
        Boolean result = false;
        if (rental != null) {

            if (this.rentedOutHistory == null) {
                rentedOutHistory = new ArrayList<>();
            }
            this.rentedOutHistory.add(rental);
            result = true;
        }
        return result;
    }

    public ArrayList<Rental> getRentedOutHistory() {
        return rentedOutHistory;

    }

}