package com.ibm.springbootflight.entities;
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
@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="name")
	String name;
	String source;
	String destination;
	double priceperseat;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPriceperseat() {
		return priceperseat;
	}
	public void setPriceperseat(double priceperseat) {
		this.priceperseat = priceperseat;
	}
	public Flight()
	{}
	public Flight(String name, String source, String destination, double priceperseat) {
		super();
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.priceperseat = priceperseat;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", priceperseat=" + priceperseat + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(priceperseat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(priceperseat) != Double.doubleToLongBits(other.priceperseat))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}
	
	

}
