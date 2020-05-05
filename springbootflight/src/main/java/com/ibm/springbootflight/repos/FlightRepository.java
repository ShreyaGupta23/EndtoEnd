package com.ibm.springbootflight.repos;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springbootflight.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight,Integer> {

public List<Flight> findBySourceAndDestination(String source, String destination);

}
