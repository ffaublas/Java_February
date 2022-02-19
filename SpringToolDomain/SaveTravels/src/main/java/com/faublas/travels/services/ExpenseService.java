package com.faublas.travels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faublas.travels.models.ExpenseItem;
import com.faublas.travels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepo;

    // constructor that has the repository injected into it (dependency injection)
    // --> initializes the Service with connection to the repository
    public ExpenseService(ExpenseRepository expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    // methods that can use the repository to talk to db
    // returns all the expense Items
    public List<ExpenseItem> allExpenses() {
        // we are using the findAll() method that theexpenseRepo has access to and that
        // returns back a list ofexpenseItem objects in an Iterable data type. We have
        // to cast it to List<MenuItem> then return the result;
        return (List<ExpenseItem>) this.expenseRepo.findAll();
    }

    // this method to create newexpense item accepts aexpenseItem instance as an
    // input and it will save it to the db using the repository
    public ExpenseItem createExpenseItem(ExpenseItem expenseItem) {
        return this.expenseRepo.save(expenseItem);
    }

    // retrieves aexpenseItem by id. Given an id, this method will talk to the
    // repository to get something form the db that matches that given id
    public ExpenseItem findExpenseItem(Long id) {
        // find aexpense item by the given id, if not found, return null (or else null)
        return this.expenseRepo.findById(id).orElse(null);
    }

    // update a expense item given an object and it will save that object to the db
    public ExpenseItem updateItem(ExpenseItem expenseItem) {
        return this.expenseRepo.save(expenseItem);
    }

    // delete a expense item by its id
    public void deleteItem(Long id) {
        // service accesses the repository to delete by the given id
        this.expenseRepo.deleteById(id);

    }

}
