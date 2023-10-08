package studentdatabase;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface courserepo extends JpaRepository<Course,Serializable> {
	

}
