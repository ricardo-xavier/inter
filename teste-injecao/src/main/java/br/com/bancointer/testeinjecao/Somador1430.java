package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1430")
public class Somador1430 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
