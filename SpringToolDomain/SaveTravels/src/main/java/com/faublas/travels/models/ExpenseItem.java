package com.faublas.travels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity // @Entity annotation tells the class that it will represent a DB table (entity
		// == table)
@Table(name = "expenseitems") // @Table annotation tells SQL the class we are building will have a table name.
								// Best practice for table names: all lowercase, plural
public class ExpenseItem {

	@Id // for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this make the primary key auto-generate
	private Long id;

	// expense
	@NotNull // this is a validation that says that the name must not be null
	@Size(min = 2, max = 50, message = "Expense item name must be between 2-50 characters") // @Size annotation is to
																							// validate strings and
																							// arrays lengths
	private String expense;

	// Expenses
	@NotNull
	@Size(min = 2, max = 50, message = "Vendor name must be between 2-50 characters")
	private String vendor;

	// amount
	@NotNull
	@Min(value = 1, message = "Amount must be at least 1 dollar!") // @Min and @Max are validations for
																	// numbers/doubles/floats(decimal numbers)
	private double amount;

	// description
	@NotNull(message = "Expense not be blank")
	@Size(min = 2, max = 3000, message = "Expense item description must be between 2-3000 characters")
	private String description;

	// This will not allow the createdAt column to be updated after creation- these
	// are time stamp member variables
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	// empty constructor-needed for when we want to pass an empty object to the
	// create form
	public ExpenseItem() {

	}

	// loaded constructor--> you do not need to initialize the ID, and the
	// created_at and updated_at ->b/c they get auto generated
	public ExpenseItem(String expense, String vendor, double amount, String description) {
		this.expense = expense;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

	@PrePersist // @PrePersist means before saving into the DB, autogenerate the current time
				// and set that as the created_at
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate // @PreUpdate means before updating, set the updated at to be the current time
				// stamp
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	// GETTERS AND SETTERS!!! REMEMBER TO HAVE THIS OR THINGS WILL NOT WORK IN THE
	// TEMPALTES LATER
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}