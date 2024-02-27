package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
    // OneToMany: 하나의 Member가 여러 Order를 한다.
    // mappedBy = "member": Order 테이블에 있는 member field 에 의해서 mapping 이 된 것이다.
    // 값을 넣는다해서 fk 값이 바뀌지 않는다. (읽기전용이 됐다)



}
