package kr.or.fenrird.jpa.repo;


import kr.or.fenrird.jpa.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TestRepo extends JpaRepository<Test, Integer>  {

    List<Test> findAllBy();

    Test findByTest(int test);

}
