package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Arcana;

@Repository
public class ArcanaRepositoryImpl implements ArcanaRepository {

	@Override
	public void flush() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public <S extends Arcana> S saveAndFlush(S entity) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends Arcana> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Arcana> entities) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public Arcana getOne(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Arcana getById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Arcana getReferenceById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends Arcana> List<S> findAll(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends Arcana> List<S> findAll(Example<S> example, Sort sort) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends Arcana> List<S> saveAll(Iterable<S> entities) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Arcana> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Arcana> findAllById(Iterable<Integer> ids) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends Arcana> S save(S entity) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Optional<Arcana> findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public long count() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void delete(Arcana entity) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAll(Iterable<? extends Arcana> entities) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void deleteAll() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public List<Arcana> findAll(Sort sort) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Page<Arcana> findAll(Pageable pageable) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends Arcana> Optional<S> findOne(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return Optional.empty();
	}

	@Override
	public <S extends Arcana> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public <S extends Arcana> long count(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public <S extends Arcana> boolean exists(Example<S> example) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public <S extends Arcana, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
