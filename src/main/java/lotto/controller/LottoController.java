package lotto.controller;

import lotto.domain.LottoResult;
import lotto.domain.LottoTicket;
import lotto.domain.LottoVendingMachine;
import lotto.view.InputView;
import lotto.view.ResultView;

import java.util.List;

public class LottoController {

    public static void main(String[] args) {
        InputView input = new InputView();
        ResultView output = new ResultView();
        LottoVendingMachine lottoMachine = new LottoVendingMachine();

        output.purchaseLotto();
        int money = input.inputMoney();

        List<LottoTicket> lottoTickets = lottoMachine.receive(money);
        output.printLotto(lottoTickets);

        List<Integer> lastWeekLottoNumber = input.lastWeekLottoNumber();
        LottoResult result = lottoMachine.match(lottoTickets, lastWeekLottoNumber);

        output.printWinningInfos(result.getLottoResult(), money);
    }
}
