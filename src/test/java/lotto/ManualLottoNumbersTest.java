package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ManualLottoNumbersTest {

	@Test
	@DisplayName("수동으로 생성하는 로또 테스트")
	public void createManualLottoTest() {
		LottoPayAmounts lottoPayAmounts = LottoPayAmounts.of("5000");
		ManualLottoCount manualLottoNumbers = ManualLottoCount.of(lottoPayAmounts, "3");

		assertThat(manualLottoNumbers).isNotNull();
	}
}