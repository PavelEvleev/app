package by.erizo.votingApp.service.impl;

import by.erizo.votingApp.repository.VotingRepository;
import by.erizo.votingApp.model.Voting;
import by.erizo.votingApp.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VotingServiceImpl implements VotingService {

    @Autowired
    private VotingRepository votingRepository;

    @Override
    public Voting createVoting(Voting voting) {
        return votingRepository.saveAndFlush(voting);
    }

    @Override
    public List<Voting> getVotings() {
        return votingRepository.findAll();
    }

    @Override
    public Voting updateVoting(Voting voting) {
        return votingRepository.saveAndFlush(voting);
    }

    @Override
    public Optional<Voting> getVotingInfo(Long id) {
        return votingRepository.findById(id);
    }

    @Override
    public Voting saveVoting(Voting voting) {
        return votingRepository.saveAndFlush(voting);
    }
}
