package kr.or.fenrird.jpa.repo


import kr.or.fenrird.jpa.entity.KoTest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface Korepo : JpaRepository<KoTest, Int> {
    fun findByIdEquals(id: Int): KoTest?
}
