package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
    회원가입
     */
    public Long join(Member member) {
        // 같은 이름이 있는 중복 회원X

        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();


        /*
        Optional<Member> result = memberRepository.findByName(member.getName());
        result.ifPresent(m -> {

            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
        */


        // 메서드 추출 단축키: ctrl + shift + alt + t

        // ifPresent: 값이 들어 있을 경우 밑에 로직 수행
        // null 이 존재하면 optional 로 한번 감싸서 여러 메서드를 활용 가능
        // orElseGet: 값이 있으면 꺼내고, 값이 없으면 어떤 로직 수행

    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                        .ifPresent(m -> {
                            throw new IllegalStateException("이미 존재하는 회원입니다.");
                        });
    }

    /*
    전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
