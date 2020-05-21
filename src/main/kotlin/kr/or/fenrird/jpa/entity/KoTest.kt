package kr.or.fenrird.jpa.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="kotest")
data class KoTest (
    @Id
    @Column
    var id: Int? = null
)
