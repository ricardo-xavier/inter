package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador618")
public class Somador618 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
