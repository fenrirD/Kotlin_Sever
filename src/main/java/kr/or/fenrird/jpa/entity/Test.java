package kr.or.fenrird.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "test")
public class Test {

    public Test() {

    }
    @Id
    @Column
    private int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }
}
