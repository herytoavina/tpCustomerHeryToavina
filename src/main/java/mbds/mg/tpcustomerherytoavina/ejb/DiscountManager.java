/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbds.mg.tpcustomerherytoavina.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import mbds.mg.tpcustomerherytoavina.entities.Discount;

/**
 *
 * @author ahery
 */
@Stateless
public class DiscountManager {
    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;
    
   public List<Discount> getAllDiscounts() {
        Query query = em.createNamedQuery("Discount.findAll");
        return query.getResultList();
    }

    public Discount findById(String code) {
        return em.find(Discount.class, code);
    }

    public void persist(Discount discount) {
        em.persist(discount);
    }
}
