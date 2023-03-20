/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mbds.mg.tpcustomerherytoavina.jsf;

import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import mbds.mg.tpcustomerherytoavina.ejb.CustomerManager;
import mbds.mg.tpcustomerherytoavina.entities.Customer;

/**
 *
 * @author ahery
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    private List<Customer> customerList;  

    @EJB
    private CustomerManager customerManager;  

    public CustomerBean() {  }  

    /** 
     * Retourne la liste des clients pour affichage dans une DataTable.
     * @return 
     */  
    public List<Customer> getCustomers() {
      if (customerList == null) {
        customerList = customerManager.getAllCustomers();
      }
      return customerList;
    }  
    
}
