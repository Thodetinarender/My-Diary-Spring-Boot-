package com.my_diary_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my_diary_project.entity.Entry;
import com.my_diary_project.repository.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {
	
	@Autowired
	private EntryRepository entryRepository;

	@Override
	public Entry saveEntry(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public Entry updateEntry(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public void deleteEntry(Entry entry) {
		entryRepository.delete(entry);
	}

	@Override
	public Entry findById(long id) {
		return entryRepository.findById(id).orElse(null);
	}

	@Override
	public List<Entry> findAll() {
		return entryRepository.findAll();
	}

	@Override
	public List<Entry> findByUserid(long id) {
		// TODO Auto-generated method stub
		return entryRepository.findByUserid(id);
	}

}








//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.my_diary_project.entity.Entry;
//import com.my_diary_project.repository.EntryRepository;
//
//@Service
//public class EntryServiceImpl implements EntryService{
//
//	@Autowired
//	private EntryRepository entryRepository; 
//	
//	@Override
//	public Entry saveEntry(Entry entry) {
//		return entryRepository.save(entry);
//	}
//
//	@Override
//	public Entry updateEntry(Entry entry) {
//		return entryRepository.save(entry);
//	}
//
//	@Override
//	public void deleteEntry(Entry entry) {
//		entryRepository.delete(entry);
//	}
//
//	@Override
//	public Entry findById(long id) {
//		 Optional<Entry> optionalEntry = entryRepository.findById(id);
//	        return optionalEntry.orElse(null); // Return null if entry is not found
//	}
//
//	@Override
//	public List<Entry> findAll() {
//		return entryRepository.findAll();
//	}
//
//	@Override
//	public List<Entry> findByUserid(long id) {
//		return entryRepository.findByUserid(id);
//	}
//
//}
