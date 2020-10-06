package com.stackroute.expenseTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.expenseTracker.model.Expense;
import com.stackroute.expenseTracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	public List<Expense> findAll() {
		
		return expenseRepository.findAll();
	}

	@Override
	public Expense save(Expense expense) {
		// TODO Auto-generated method stub
	  expenseRepository.save(expense);
		return expense;
	}

	@Override
	public Expense findById(Long id) {
		// TODO Auto-generated method stub
		if(expenseRepository.findById(id).isPresent()) {
			return expenseRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public void delete(long id) {
		Expense expense  = findById(id);
		expenseRepository.delete(expense);
		
	}

}
