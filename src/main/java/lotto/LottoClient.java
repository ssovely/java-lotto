package lotto;

import lotto.application.LottoService;
import lotto.domain.Money;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoClient {
	public static void main(String[] args) {
		Money money = new Money(InputView.waitInputMoney());

		LottoService lottoService = new LottoService(money);

		OutputView.printLottoCount(lottoService.buyLotto());
	}
}
