package br.com.erudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.erudio.data.models.BookModel;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Long>{

}