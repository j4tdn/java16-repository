package bean;

import java.util.List;
import java.util.Objects;

public class GiamKhao {
	private int numberOfCandidates; // <=3
	private List<Integer> candidateIds ;
	
	public GiamKhao() {
		// TODO Auto-generated constructor stub
	}
	
	public GiamKhao(int numberOfCandidates, List<Integer> candidateIds) {
		this.numberOfCandidates = numberOfCandidates;
		this.candidateIds = candidateIds;
	}

	public int getNumberOfCandidates() {
		return numberOfCandidates;
	}

	public void setNumberOfCandidates(int numberOfCandidates) {
		this.numberOfCandidates = numberOfCandidates;
	}

	public List<Integer> getCandidateIds() {
		return candidateIds;
	}

	public void setCandidates(List<Integer> candidates) {
		this.candidateIds = candidates;
	}

	@Override
	public int hashCode() {
		return Objects.hash(candidateIds, numberOfCandidates);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiamKhao other = (GiamKhao) obj;
		return Objects.equals(candidateIds, other.candidateIds) && numberOfCandidates == other.numberOfCandidates;
	}

	@Override
	public String toString() {
		return "GiamKhao [NumberOfCandidates=" + numberOfCandidates + ", CandidateIds=" + candidateIds + "]";
	}
}
