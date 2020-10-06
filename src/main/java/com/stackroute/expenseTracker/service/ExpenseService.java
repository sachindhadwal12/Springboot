package com.stackroute.expenseTracker.service;

import java.util.List;

import com.stackroute.expenseTracker.model.Expense;

public interface    ExpenseService {
	
List<Expense>findAll();
Expense save(Expense expense);
Expense findById(Long id);
void delete(long id);

}
