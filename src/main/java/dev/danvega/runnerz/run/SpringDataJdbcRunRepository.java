package dev.danvega.runnerz.run;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

public interface SpringDataJdbcRunRepository extends ListCrudRepository<Run, Integer >{
	
	List<Run> findByLocation(String location);

}
