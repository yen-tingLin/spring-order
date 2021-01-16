package com.example.app.foodorder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "store_table")
@DynamicUpdate
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@OneToMany()
//	@JoinTable(name = "StoreOrder", uniqueConstraints = @UniqueConstraint(columnNames = {"store_id", "order_id"}), 
//		joinColumns = @JoinColumn(name = "store_id", referencedColumnName = "id"),
//		inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"))
//	private List<Order> orders;

	
	public Store() {}


	public Long getStoreId() {
		return id;
	}


	public void setStoreId(Long storeId) {
		this.id = storeId;
	}


//	public List<Order> getOrders() {
//		return orders;
//	}
//
//
//	public void setOrders(List<Order> orders) {
//		this.orders = orders;
//	}
	

}
