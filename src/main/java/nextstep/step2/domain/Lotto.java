package nextstep.step2.domain;

import java.util.Set;

public class Lotto {
	private static final String WRONG_LOTTO_NUMBERS = "로또 번호는 6개여야 합니다.";
	protected static final int LOTTO_SIZE = 6;
	private Set<LottoNumber> numbers;

	public Lotto(Set<LottoNumber> numbers) {
		this.numbers = numbers;
	}

	public Set<LottoNumber> getNumbers() {
		return numbers;
	}

	public void validate() {
		if (numbers.size() != LOTTO_SIZE) {
			throw new IllegalArgumentException(WRONG_LOTTO_NUMBERS);
		}
	}
}
