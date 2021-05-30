package study.lotto.exception;

import study.lotto.domain.LottoGame;
import study.lotto.domain.LottoNumber;

public class WrongLottoNumberException extends RuntimeException{

    private static final String MESSAGE = "로또 번호는 "
                                        + LottoGame.LOTTONUMBER_FROM + " ~ "
                                        + LottoGame.LOTTONUMBER_TO
                                        + " 사이 입니다.";

    public WrongLottoNumberException() {
        super(MESSAGE);
    }
}