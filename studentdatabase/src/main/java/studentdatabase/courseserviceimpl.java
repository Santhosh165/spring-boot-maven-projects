package studentdatabase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class courseserviceimpl implements courseservice {
	@Autowired
	private courserepo CourseRepo;
	

	@Override
	public String upsert(Course course) {
		CourseRepo.save(course); //upsert -insert/update
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById=CourseRepo.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		return CourseRepo.findAll();
	}

	@Override
	public String delectById(Integer cid) {
		if(CourseRepo.existsById(cid)) {
			CourseRepo.deleteById(cid);
			return "Delect";
		}
		else {
			return "No record found";
		}
		
	}

}
