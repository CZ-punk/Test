package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    public void save() throws Exception {
        //given
        Member member = new Member("choi", 20);

        //when
        Member savedMember = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(savedMember.getId());
        assertThat(findMember).isSameAs(member);
    }

    @Test
    public void findAll() throws Exception {
        //given
        Member memberA = new Member("choi", 20);
        Member memberB = new Member("Joo", 18);

        //when
        Member saveA = memberRepository.save(memberA);
        Member saveB = memberRepository.save(memberB);

        //then
        List<Member> all = memberRepository.findAll();
        assertThat(all.size()).isEqualTo(2);

    }
}
