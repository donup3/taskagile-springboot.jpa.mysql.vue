package com.taskagile.service;

import com.taskagile.domain.Board;
import com.taskagile.domain.Member;
import com.taskagile.domain.Team;
import com.taskagile.dto.TeamDto;
import com.taskagile.repository.BoardRepository;
import com.taskagile.repository.MemberRepository;
import com.taskagile.repository.team.TeamRepository;
import com.taskagile.security.domain.CustomUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MeService {
    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    public List<Board> getBoard(CustomUser customUser) {
        Member member = memberRepository.findByUsername(customUser.getUsername()).get();


        return boardRepository.findAllByMember(member);
    }

    public List<Team> getTeam(CustomUser customUser) {
        Member member = memberRepository.findByUsername(customUser.getUsername()).get();

        return teamRepository.getTeamByMember(member);
    }
}
