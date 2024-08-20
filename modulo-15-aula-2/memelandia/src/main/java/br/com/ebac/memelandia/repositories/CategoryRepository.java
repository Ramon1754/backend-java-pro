package br.com.ebac.memelandia.repositories;

import com.exemplo.categories.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
